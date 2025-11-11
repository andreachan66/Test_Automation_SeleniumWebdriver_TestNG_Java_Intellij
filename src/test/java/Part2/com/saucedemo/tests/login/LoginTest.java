package Part2.com.saucedemo.tests.login;

import Part2.com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage () {
        loginPage.setUsernameField("standard_username");
        loginPage.setPasswordField("234login");
        loginPage.clickLoginButton();
        String actualMessage =  loginPage.getErrorMessage();

        Assert.assertTrue(actualMessage.contains("Epic sadface"));

    }
}
