package pages;

import elements.Input;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModalPage extends BasePage {
    public static final By NEW_ACCOUNT_TITLE = By.xpath("//h2[contains(@class, 'inlineTitle')] ");
    String inputLocator = "//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//input ";

    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void create(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebSite());

    }

    @Override
    public boolean isPageOpen() {
        return isExist(NEW_ACCOUNT_TITLE);
    }
}
