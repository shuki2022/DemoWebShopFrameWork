package com.demowebshop.pages;

import com.demowebshop.base.BasePage;
import com.demowebshop.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    //identify elements
    private By loginPageName = By.xpath("//div[@class='page-title']/h1");
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By remembeMeBox = By.id("RememberMe");
    private By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    private By registerBtn = By.xpath("//input[@class='button-1 register-button']");
    private By booksLink = By.xpath("//div[@class='header-menu']/descendant::a[1]");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getLoginPageName() {
       // return driver.findElement(loginPageName).getText();

        return elementUtil.doGetText(loginPageName);
    }

    public HomePage doLogin(String userID, String password) {
        //driver.findElement(emailField).sendKeys(userID);
        elementUtil.doSendKeys(emailField,userID);
       // driver.findElement(passwordField).sendKeys(password);
        elementUtil.doSendKeys(passwordField,password);
       // driver.findElement(loginBtn).click();
        elementUtil.doClick(loginBtn);
        return new HomePage(driver);

    }

    public boolean verifyRegisterButtonStatus() {
       // return driver.findElement(registerBtn).isDisplayed();
        return elementUtil.doIsDisplayed(registerBtn);
    }

    public boolean verifyBooksLink() {
        //return driver.findElement(booksLink).isDisplayed();
        return elementUtil.doIsDisplayed(booksLink);
    }

    public boolean verifyRememberMeBox(){
       // return driver.findElement(remembeMeBox).isEnabled();
   return elementUtil.doIsEnable(remembeMeBox);
    }

}
