package co.com.choucair.certification.choucairTest.stepdefinitions;

import co.com.choucair.certification.choucairTest.userform.DoAboutYourAddress;
import co.com.choucair.certification.choucairTest.userform.DoAboutYourDevices;
import co.com.choucair.certification.choucairTest.userform.DoAboutYourself;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;

public class UserFormInfo {

    @And("{actor} fill the section about yourself")
    public void he_fill_the_section_about_yourself(Actor actor){
        actor.attemptsTo(
                DoAboutYourself.addInformation("Luis", "Mendez", "luisalbertoms0312@gmail.com")
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
    }
}
