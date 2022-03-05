package com.demowebshop.pages;

import com.demowebshop.base.BasePage;
import com.demowebshop.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    private WebDriver driver;
    private ElementUtil elementUtil;

    public RegisterPage(WebDriver driver){
        this.driver =driver;
        elementUtil=new ElementUtil(driver);

    }

    private By genderMale =By.id("gender-male");
    private By genderFemale =By.id("gender-female");
    private By firstName =By.id("FirstName");
    private By lastName =By.id("LastName");
    private By email =By.id("Email");
    private By password=By.id("Password");
    private By confirmPassword =By.id("ConfirmPassword");
    private By registerBtn=By.id("register-button");
    private By registerMessage=By.xpath("//div[@class='result']");
    private By  continueBtn = By.xpath("//div[@class='buttons']/input[@value='Continue']");

    public HomePage registerNewUser(String gender,String firstName,String lastName,String email,String password){
        if(gender.equalsIgnoreCase("male")) {
            elementUtil.doClick(genderMale);
        }else {
            elementUtil.doClick(genderFemale);
        }
        elementUtil.doSendKeys(this.firstName,firstName);
        elementUtil.doSendKeys(this.lastName,lastName);
        elementUtil.doSendKeys(this.email,email);
        elementUtil.doSendKeys(this.password,password);
        elementUtil.doSendKeys(confirmPassword,password);
        elementUtil.doClick(registerBtn);
        elementUtil.waitFor(2000);
        elementUtil.doClick(continueBtn);
        elementUtil.waitFor(2000);
        return new HomePage(driver);


            }
        }

