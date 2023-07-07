package pages;

import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModalPage extends BasePage{
    public static final By NEW_ACCOUNT_TITLE = By.xpath("//h2[contains(@class, 'inlineTitle')] ");
String inputLocator = "//span[text() = '%s']/ancestor::div[contains(@class, 'uiInput')]//input ";
    public AccountModalPage(WebDriver driver) {
        super(driver);
    }
    public void create(String accountName, String webSite){
new Input(driver, "Account Name").write("NewName");
        new Input(driver, "Website").write("www.onliner.by");

    }

    @Override
    public boolean isPageOpen() {
        return isExist(NEW_ACCOUNT_TITLE);
    }
}
