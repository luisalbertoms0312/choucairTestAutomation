package co.com.choucair.certification.choucairTest.userinterface.userform;
import org.openqa.selenium.By;

public class AboutYourAddress {
    public static By LOCATOR_ABOUT_ADDRESS_TITLE = By.className("sub-title");
    public static By LOCATOR_CITY_INPUT = By.xpath("//label[contains(text(),'City:')]");
    public static By LOCATOR_CITY = By.id("city");
    public static By LOCATOR_POSTAL_CODE_INPUT = By.xpath("//label[contains(text(),'Zip or Postal Code:')]");
    public static By LOCATOR_POSTAL_CODE = By.id("zip");
    public static By LOCATOR_DEVICES = By.xpath("//span[contains(text(),'Next: Devices')]");

}
