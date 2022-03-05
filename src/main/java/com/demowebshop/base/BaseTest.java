package com.demowebshop.base;

import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;


// can not have WebDriver Api in our test  method or test class, such as  get driver method....
//that is why we create this base test class to extends to other test class!!!!!!!
public class BaseTest {


    public WebDriver driver;
    public BasePage basePage;
    public Properties prop;
    public HomePage homePage;
    public LoginPage loginPage;
    public RegisterPage registerPage;

    @BeforeTest
    public void setUp() {
        basePage = new BasePage();
        prop = basePage.init_prop();
        String browserType = prop.getProperty("browser");
        driver = basePage.init_driver(browserType);
        homePage=new HomePage(driver);
        driver.get(prop.getProperty("url"));

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
