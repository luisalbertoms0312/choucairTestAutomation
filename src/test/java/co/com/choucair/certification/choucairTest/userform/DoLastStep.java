package co.com.choucair.certification.choucairTest.userform;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certification.choucairTest.userform.AboutLastStep.*;
import static co.com.choucair.certification.choucairTest.userform.AboutYourDevices.LOCATOR_LAST_STEP;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class DoLastStep implements Task {
    private final String password;
    private final String passwordConfirmatioin;

    public DoLastStep(String password, String passwordConfirmatioin) {
        this.password = password;
        this.passwordConfirmatioin = passwordConfirmatioin;
    }

    public static Performable addInformation(String password, String passwordConfirmatioin){
        return instrumented(DoLastStep.class, password, passwordConfirmatioin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_ABOUT_LAST_STEP_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(2000).milliseconds(),
                Click.on(LOCATOR_PASSWORD),
                Enter.theValue(password).into(LOCATOR_PASSWORD),
                Click.on(LOCATOR_CONFIRM_PASSWORD),
                Enter.theValue(passwordConfirmatioin).into(LOCATOR_CONFIRM_PASSWORD),
                Click.on(LOCATOR_FIRST_CHECkBOX),
                Click.on(LOCATOR_SECOND_CHECkBOX),
                WaitUntil.the(LOCATOR_ABOUT_LAST_STEP_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(2000).milliseconds(),
                Click.on(LOCATOR_COMPLETE_PROCESS));

    }
}
