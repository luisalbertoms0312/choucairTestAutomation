package co.com.choucair.certification.choucairTest.stepdefinitions;
import co.com.choucair.certification.choucairTest.navigation.FlowNewUser;
import co.com.choucair.certification.choucairTest.navigation.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

public class CreateANewUser {

    @Given("{actor} is on uTest main page")
    public void that_an_user_is_on_uTest_main_page(Actor actor){
        actor.wasAbleTo(NavigateTo.theUTestHomePage());
    }

    @When("{actor} starts with the user creation flow")
    public void he_starts_with_the_user_creation_flow(Actor actor){
        actor.attemptsTo(
                FlowNewUser.iniciatesTheJourney()
        );
    }
}
