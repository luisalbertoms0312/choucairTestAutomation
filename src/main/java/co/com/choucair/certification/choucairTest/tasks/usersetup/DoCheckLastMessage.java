package co.com.choucair.certification.choucairTest.tasks.usersetup;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certification.choucairTest.userinterface.lastpage.AboutCheckLastMessage.LOCATOR_ABOUT_LAST_MESSAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class DoCheckLastMessage implements Task {
    public static Performable validateMessage(){
        return instrumented(DoCheckLastMessage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_ABOUT_LAST_MESSAGE, WebElementStateMatchers.isVisible()).forNoMoreThan(5000).milliseconds(),
                Ensure.that(LOCATOR_ABOUT_LAST_MESSAGE).text().isEqualTo("Welcome to the world's largest community of freelance software testers!")
                );

    }
}
