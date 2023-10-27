# Choucair Testing
##### Luis Alberto Méndez Suarez

## Escenario automatizado

```Gherkin
Feature: Go to the Utest website and carry out the flow to create a new user.

  @tag1
  Scenario: Create a new user
    Given that an user is on uTest main page
    When he starts with the user creation flow
    And he fill the section about yourself
    And he fill the section about address
    And he fill the section about devices
    And he setup the password and finish the process
    Then he should be to see message about software testers
```

### Escenarios para la implmentación
La implementación realizada para el escenario está confomada de la siguiente manera 
```java
@Given("{actor} is on uTest main page")
public void that_an_user_is_on_uTest_main_page(Actor actor){
        actor.wasAbleTo(
                NavigateTo.theUTestHomePage());
        }

@When("{actor} starts with the user creation flow")
public void he_starts_with_the_user_creation_flow(Actor actor){
        actor.attemptsTo(
                FlowNewUser.iniciatesTheJourney()
            );
        }



```

La clase `NavigateTo` es la responsable de abrir la primera vista de la página uTest
```java
public class NavigateTo {
    public static Performable theUTestHomePage() {
        return Task.where("{0} opens the UTest home page",
                Open.browserOn().the(UTestGoHomePage.class));
    }
}
```


### Flujos definidos
Para los flujos relacionados al proceso de ingreso de datos del formulario, se llevo a cabo por medio de la siguiente implementación

```java
    @And("{actor} fill the section about yourself")
public void he_fill_the_section_about_yourself(Actor actor){
        actor.attemptsTo(
        DoAboutYourself.addInformation("Luis", "Mendez", "email-test@gmail.com")
        );
        }

@And("{actor} fill the section about address")
public void he_fill_the_section_about_address(Actor actor){
        actor.attemptsTo(
        DoAboutYourAddress.addInformation("Sincelejo", "700001")
        );
        }

@And("{actor} fill the section about devices")
public void he_fill_the_section_about_devices(Actor actor){
        actor.attemptsTo(
        DoAboutYourDevices.addInformation("Windows", "10", "Spanish")
        );
        }

@And("{actor} setup the password and finish the process")
public void he_setup_the_password_and_finish_the_process(Actor actor){
        actor.attemptsTo(
        DoLastStep.addInformation("27Ca1027ut10$*", "27Ca1027ut10$*")
        );
        }

@And("{actor} should be to see message about software testers")
public void he_should_be_to_see_message_about_software_testers(Actor actor){
        actor.attemptsTo(
        DoCheckLastMessage.validateMessage()
        );
        }
```
### Capabilities utilizadas para el manejo de navegador utilizado
Para el detalle de los navegadores a utilizar para la automatización se definieron ciertas configuraciones a tener en cuenta al momento de la ejecución de los escenarios
```java
webdriver {
    driver = chrome
}
headless.mode = true

chrome.switches="""--start-maximized;--test-type;--no-sandbox;--ignore-certificate-errors;
                   --disable-popup-blocking;--disable-default-apps;--disable-extensions-file-access-check;
                   --incognito;--disable-infobars,--disable-gpu"""

```
