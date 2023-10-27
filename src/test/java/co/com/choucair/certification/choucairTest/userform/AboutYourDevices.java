package co.com.choucair.certification.choucairTest.userform;
import org.openqa.selenium.By;

public class AboutYourDevices {

    public static By LOCATOR_ABOUT_DEVICES = By.className("sub-title");
    public static By LOCATOR_COMPUTER_SO_LABEL = By.xpath("//label[contains(text(),'Your Computer:')]");
    public static By LOCATOR_COMPUTER_SO= By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span");
    public static By LOCATOR_COMPUTER_SO_INPUT= By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]");

    public static By LOCATOR_VERSION_SO_LABEL = By.xpath("//label[contains(text(),'Your Computer:')]");
    public static By LOCATOR_VERSION_SO= By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span");
    public static By LOCATOR_VERSION_SO_INPUT= By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]");
    public static By LOCATOR_LANGUAGE_SO_LABEL = By.xpath("//label[contains(text(),'Your Computer:')]");
    public static By LOCATOR_LANGUAGE_SO= By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span");
    public static By LOCATOR_LANGUAGE_SO_INPUT= By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]");
    public static By LOCATOR_LAST_STEP = By.xpath("//span[contains(text(),'Next: Last Step')]");
}
