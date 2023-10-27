package co.com.choucair.certification.choucairTest.navigation;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theUTestHomePage() {
        return Task.where("{0} opens the UTest home page",
                Open.browserOn().the(co.com.choucair.certification.choucairTest.navigation.UTestGoHomePage.class));
    }
}
