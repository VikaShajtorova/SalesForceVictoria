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
    

    public void openSaleForce(){
        driver.get(BASE_URL);

    }
    @Override
    public boolean isPageOpen() {
        return isExist(LOG_IN_BUTTON);
    }
    public void loginAndPassword(String name,String password) {
        driver.findElement(USER_NAME).sendKeys(name);
        driver.findElement(PASSWORD).sendKeys(password);
    }
    public void clickLogInButton(){
        driver.findElement(LOG_IN_BUTTON).click();
    }

}
