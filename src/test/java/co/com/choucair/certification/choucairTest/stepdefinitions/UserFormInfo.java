package co.com.choucair.certification.choucairTest.stepdefinitions;
import co.com.choucair.certification.choucairTest.tasks.usersetup.*;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
public class UserFormInfo {

    @And("{actor} fill the section about yourself")
    public void he_fill_the_section_about_yourself(Actor actor){
        actor.attemptsTo(
                DoAboutYourself.addInformation("Luis", "Mendez", "fake-mailtest@gmail.com")
        );
    } @And("{actor} fill the section about address")
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
    }  @And("{actor} setup the password and finish the process")
    public void he_setup_the_password_and_finish_the_process(Actor actor){
        actor.attemptsTo(
                DoLastStep.addInformation("27Ca1027ut10$*", "27Ca1027ut10$*")
        );
    }@And("{actor} should be to see message about software testers")
    public void he_should_be_to_see_message_about_software_testers(Actor actor){
        actor.attemptsTo(
                DoCheckLastMessage.validateMessage()
        );
    }
}
