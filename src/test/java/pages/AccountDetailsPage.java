package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage{

    public static final By DETAILS_LINK = By.xpath("//a[@data-label='Details']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return  isExist(DETAILS_LINK);
    }
}
