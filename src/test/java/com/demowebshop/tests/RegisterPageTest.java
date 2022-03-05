package com.demowebshop.tests;

import com.demowebshop.base.BaseTest;
import com.demowebshop.util.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {

    @BeforeMethod
    public void registerPageSetup(){
   registerPage = homePage.goToRegisterPage();
    }

    @Test(dataProvider = "getUserData")
    public void registerNewUserTest(String gender,String firstName,String lastName,String email,String password){
        registerPage.registerNewUser(gender,firstName,lastName,email,password);
        Assert.assertTrue(homePage.verifyShoppingCartLink());
    }

    @DataProvider
    public Object[][]getUserData(){
        Object data[][]= ExcelUtil.getTestData("DemoWebShop");
        return data;

    }
}
