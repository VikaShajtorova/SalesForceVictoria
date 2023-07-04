package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest{

@Test
    public void loginUserIsValidData(){
    loginPage.openSaleForce();
    loginPage.loginAndPassword("dsygek-fvey@force.com","123456789James");
    loginPage.clickLogInButton();
    assertTrue(homePage.titleIsVisible());
}
}