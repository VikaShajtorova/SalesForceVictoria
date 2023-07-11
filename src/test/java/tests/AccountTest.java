package tests;

import models.Account;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class AccountTest extends BaseTest {
    @Test
    public void accountShouldBeCreated() {
        loginPage.openSaleForce()
                .loginAndPassword("waqupob-w5wu@force.com", "Dbrnjhbz_1105")
                .clickLogInButton();
        //Открыть страницу
        accountListPage.open()


                //Кликнуть кнопку New
                .clickNewButton();
        //Заполнить все поля
        Account account = new Account("TestName", "www.onliner.by", "Investor");
        accountModalPage.create(account);

        accountDetailsPage.isPageOpen();
        assertEquals(accountDetailsPage.getFieldValue("Account Name"),account.getAccountName());
        assertEquals(accountDetailsPage.getFieldValue("Website"),account.getWebSite());
        assertEquals(accountDetailsPage.getFieldValue("Type"),account.getType());
        //нажать кнопку Save
        //Проверить создание аккаунта

    }
}
