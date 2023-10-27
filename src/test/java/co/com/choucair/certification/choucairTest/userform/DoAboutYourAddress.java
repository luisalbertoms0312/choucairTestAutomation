package co.com.choucair.certification.choucairTest.userform;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.choucairTest.userform.AboutYourAddress.LOCATOR_ABOUT_ADDRESS_TITLE;
import static co.com.choucair.certification.choucairTest.userform.AboutYourAddress.LOCATOR_DEVICES;
import static co.com.choucair.certification.choucairTest.userform.AboutYourself.LOCATOR_ABOUT_YOURSELF_TITLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoAboutYourAddress implements Task {
    private final String city;
    private final String zipCode;

    public DoAboutYourAddress(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public static Performable addInformation(String city, String zipCode){
        return instrumented(DoAboutYourAddress.class, city, zipCode );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_ABOUT_ADDRESS_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(2000).milliseconds(),
                Click.on(AboutYourAddress.LOCATOR_CITY),
                Enter.theValue(city).into(AboutYourAddress.LOCATOR_CITY),
                Click.on(AboutYourAddress.LOCATOR_CITY_INPUT),
                Enter.theValue(zipCode).into(AboutYourAddress.LOCATOR_POSTAL_CODE),
                Click.on(AboutYourAddress.LOCATOR_POSTAL_CODE_INPUT),
                WaitUntil.the(LOCATOR_DEVICES, WebElementStateMatchers.isVisible()).forNoMoreThan(2000).milliseconds(),
                Click.on(LOCATOR_DEVICES)
        );

    }
}
