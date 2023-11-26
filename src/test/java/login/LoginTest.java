package login;

import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class LoginTest extends BaseTest {

    @Test
    public void LoginSuccessful() {
        //test
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getTitle().contains("Swag Labs"));
    }
}
