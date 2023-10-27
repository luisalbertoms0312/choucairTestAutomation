package co.com.choucair.certification.choucairTest.runner;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/create_new_user.feature",
        tags="@tag1",
        glue="co.com.choucair.certification.choucairTest.stepdefinitions"
      )
public class FlowNewUser {
}
