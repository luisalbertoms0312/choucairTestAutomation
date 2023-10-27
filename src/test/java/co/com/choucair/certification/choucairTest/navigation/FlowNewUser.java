package co.com.choucair.certification.choucairTest.starter.navigation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certification.choucairTest.starter.navigation.UTestGoHomePage.LOCATOR_BECOME_BTN;
import static co.com.choucair.certification.choucairTest.starter.navigation.UTestGoHomePage.LOCATOR_MAIN_TITLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class FlowNewUser implements Task {

    public static Performable iniciatesTheJourney(){
        return instrumented(FlowNewUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_MAIN_TITLE, WebElementStateMatchers.isVisible()).forNoMoreThan(5000).milliseconds(),
                Click.on(LOCATOR_BECOME_BTN)
        );

    }
}
