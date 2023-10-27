package co.com.choucair.certification.choucairTest.userform;
import org.openqa.selenium.By;

public class AboutYourself {
    public static By LOCATOR_ABOUT_YOURSELF_TITLE = By.className("sub-title");
    public static By LOCATOR_FIRST_NAME = By.id("firstName");
    public static By LOCATOR_LAST_NAME = By.id("lastName");
    public static By LOCATOR_EMAIL = By.id("email");
    public static By LOCATOR_MONTH = By.id("birthMonth");
    public static By LOCATOR_DAY = By.id("birthDay");
    public static By LOCATOR_YEAR = By.id("birthYear");
    public static By LOCATOR_LOCATION = By.xpath("//span[contains(text(),'Next: Location')]");
}
