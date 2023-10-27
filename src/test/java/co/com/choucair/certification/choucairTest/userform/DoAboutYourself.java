package co.com.choucair.certification.choucairTest.userform;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certification.choucairTest.userform.AboutYourself.LOCATOR_ABOUT_YOURSELF_TITLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class DoAboutYourself implements Task {
    private final String username;
    private final String lastname;
    private final String email;



    public DoAboutYourself(String username, String lastname, String email) {
        this.username = username;
        this.lastname = lastname;
        this.email = email;

    }
    public static Performable addInformation(String username, String lastname, String email){
        return instrumented(DoAboutYourself.class, username, lastname, email);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
              actor.attemptsTo(
                      WaitUntil.the(LOCATOR_ABOUT_YOURSELF_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(2000).milliseconds(),
                      Click.on(AboutYourself.LOCATOR_FIRST_NAME),
                      Enter.theValue(username).into(AboutYourself.LOCATOR_FIRST_NAME),
                      Click.on(AboutYourself.LOCATOR_LAST_NAME),
                      Enter.theValue(lastname).into(AboutYourself.LOCATOR_LAST_NAME),
                      Click.on(AboutYourself.LOCATOR_EMAIL),
                      Enter.theValue(email).into(AboutYourself.LOCATOR_EMAIL),
                        Click.on(AboutYourself.LOCATOR_MONTH),
                      SelectFromOptions.byVisibleText("March").from(AboutYourself.LOCATOR_MONTH),
                        Click.on(AboutYourself.LOCATOR_DAY),
                      SelectFromOptions.byVisibleText("12").from(AboutYourself.LOCATOR_DAY),
                        Click.on(AboutYourself.LOCATOR_YEAR),
                      SelectFromOptions.byVisibleText("1995").from(AboutYourself.LOCATOR_YEAR),
                        Click.on(AboutYourself.LOCATOR_LOCATION));



    }
}
