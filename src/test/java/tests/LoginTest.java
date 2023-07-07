package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest{

@Test
public void loginUserIsValidData(){
    boolean isHomePageOpen = loginPage.openSaleForce()
            .loginAndPassword("waqupob-w5wu@force.com","Dbrnjhbz_1105")
            .clickLogInButton()
            .isPageOpen();
    assertTrue(isHomePageOpen);
}
}
