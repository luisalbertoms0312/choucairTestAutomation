package co.com.choucair.certification.choucairTest.starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UTestGoHomePage extends PageObject {
public static  By LOCATOR_MAIN_TITLE = By.xpath("//h1[contains(text(),'The Largest Community of Testers in the World')]");
public static  By LOCATOR_BECOME_BTN = By.xpath("//div[1]/a[contains(text(),'Become a uTester')]");

}
