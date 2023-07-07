package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final By USER_NAME = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By LOG_IN_BUTTON = By.id("Login");


    public LoginPage openSaleForce(){
        driver.get(BASE_URL);
        return this;

    }
    @Override
    public boolean isPageOpen() {
        return isExist(LOG_IN_BUTTON);
    }

    public LoginPage loginAndPassword(String name,String password) {
        driver.findElement(USER_NAME).sendKeys(name);
        driver.findElement(PASSWORD).sendKeys(password);
        return this;
    }
    public HomePage clickLogInButton(){
        driver.findElement(LOG_IN_BUTTON).click();
        return new HomePage(driver);
    }

}
