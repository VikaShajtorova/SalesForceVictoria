package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public static final By HOME_TITLE = By.xpath("//span[@class='slds-truncate' and text()='Home']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean titleIsVisible() {

        return driver.findElement(HOME_TITLE).isDisplayed();
    }
}