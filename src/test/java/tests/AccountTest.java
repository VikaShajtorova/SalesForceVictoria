package tests;

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
                .clickNewButton()
        //Заполнить все поля
                .create("NewName","www.onliner.by");
        //нажать кнопку Save
        //Проверить создание аккаунта

    }
}
