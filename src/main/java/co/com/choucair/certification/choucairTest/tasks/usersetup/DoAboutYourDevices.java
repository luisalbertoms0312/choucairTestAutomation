package co.com.choucair.certification.choucairTest.tasks.usersetup;
import co.com.choucair.certification.choucairTest.userinterface.userform.AboutYourDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certification.choucairTest.userinterface.userform.AboutYourDevices.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class DoAboutYourDevices implements Task {
    public final String kindSO;
    public final String versionSO;
    public final String languageSO;

    public DoAboutYourDevices(String kindSO, String versionSO, String languageSO) {
        this.kindSO = kindSO;
        this.versionSO = versionSO;
        this.languageSO = languageSO;
    }

    public static Performable addInformation(String kindSO, String versionSO, String languageSO){
        return instrumented(DoAboutYourDevices.class, kindSO, versionSO, languageSO );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_ABOUT_DEVICES, WebElementStateMatchers.isVisible()).forNoMoreThan(2000).milliseconds(),
                Click.on(AboutYourDevices.LOCATOR_COMPUTER_SO),
                Enter.theValue(kindSO).into(LOCATOR_COMPUTER_SO_INPUT),
                Click.on(AboutYourDevices.LOCATOR_COMPUTER_SO_LABEL),
                Click.on(AboutYourDevices.LOCATOR_VERSION_SO),
                Enter.theValue(kindSO).into(LOCATOR_VERSION_SO_INPUT),
                Click.on(AboutYourDevices.LOCATOR_VERSION_SO_LABEL),
                Click.on(AboutYourDevices.LOCATOR_LANGUAGE_SO),
                Enter.theValue(kindSO).into(LOCATOR_LANGUAGE_SO_INPUT),
                Click.on(AboutYourDevices.LOCATOR_LANGUAGE_SO_LABEL),
                WaitUntil.the(LOCATOR_LAST_STEP, WebElementStateMatchers.isVisible()).forNoMoreThan(2000).milliseconds(),
                Click.on(LOCATOR_LAST_STEP)

        );

    }
}
