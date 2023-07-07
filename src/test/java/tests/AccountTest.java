package tests;

import models.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {
    @Test
    public void accountShouldBeCreated() {
        //логин
        loginPage.openSaleForce()
                .loginAndPassword("waqupob-w5wu@force.com", "Dbrnjhbz_1105")
                .clickLogInButton();
        //Открыть страницу
        accountListPage.open()


        //Кликнуть кнопку New
                .clickNewButton();
        //Заполнить все поля
                Account account = new Account("TestName","www.onliner.by");
                accountModalPage.create(account);
        //нажать кнопку Save
        //Проверить создание аккаунта

    }
}
