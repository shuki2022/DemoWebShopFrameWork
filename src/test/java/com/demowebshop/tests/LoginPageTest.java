package com.demowebshop.tests;

import com.demowebshop.base.BaseTest;
import com.demowebshop.util.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    @BeforeClass
    public void loginPageSetup() {
        loginPage = homePage.goToLoginPage();
    }

    @Test(priority = 1)
    public void verifyPageNameTest() {
        Assert.assertEquals(loginPage.getLoginPageName(), Constants.LOGIN_PAGE);
    }

    @Test(priority = 2)
    public void verifyRegisterButtonStatusTest() {
        Assert.assertTrue(loginPage.verifyRegisterButtonStatus());
    }

    @Test(priority = 3)
    public void validateUserLoginTest() throws InterruptedException {
        loginPage.doLogin(prop.getProperty("id"), prop.getProperty("pass"));
        Thread.sleep(2000);
        Assert.assertTrue(homePage.verifyLogoutLink());}

    @Test(priority = 4)
    public void verifyBookLink() {
        Assert.assertTrue(loginPage.verifyBooksLink());
    }

    @Test(priority = 5)
    public void verifyRememberMeBox() {
        Assert.assertTrue(loginPage.verifyRememberMeBox());
    }

}
