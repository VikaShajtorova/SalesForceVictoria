package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest{

@Test
public void loginUserIsValidData(){
    boolean isHomePageOpen = loginPage.openSaleForce()
            .loginAndPassword("dsygek-fvey@force.com","123456789James")
            .clickLogInButton()
            .isPageOpen();
    assertTrue(isHomePageOpen);
}
}
