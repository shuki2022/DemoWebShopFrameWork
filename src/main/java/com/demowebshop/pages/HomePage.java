package com.demowebshop.pages;

import com.demowebshop.base.BasePage;
import com.demowebshop.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    // Capture elements on the page by its locators- object Repository
    private By logo = By.xpath("//img[@alt ='Tricentis Demo Web Shop']");
    private By registerLink = By.linkText("Register");
    private By loginLink = By.linkText("Log in");
    private By shoppingCartLink = By.linkText("Shopping cart");
    private By wishlistLink = By.linkText("Wishlist");
    private By searchBox = By.id("small-searchterms");
    private By searchBtn = By.xpath("//input[@type='submit']");
    private By bookLink = By.xpath("/ul[@class='top-menu']/descendant::a[1]");
    private By computerLink = By.xpath("/ul[@class='top-menu']/descendant::a[2]");
    private By electronicLink = By.xpath("/ul[@class='top-menu']/descendant::a[3]");
    private By logoutLink = By.linkText("Log out");
    private By popularTagAwesome=By.xpath("//a[text()='awesome']");
    private By communityPollTitle =By.xpath("//div[@class='block block-poll']/descendant::strong[1]");
    private By voteButton = By.id("vote-poll-1");
    private By giftCardImage =By.xpath("//img[@title='Show details for $25 Virtual Gift Card']");
    private By informationAboutUs =By.xpath("//div[@class='column information']/descendant::li[5]");
    private By communityPollExcellentBtn=By.id("pollanswers-1");


    public HomePage(WebDriver driver) {
        this.driver = driver;
       elementUtil =new ElementUtil(driver);
    }

    //2.method that performs action on the element
    public boolean verifyLogo() {
        return elementUtil.doIsDisplayed(logo);
    }

    public String getPageTitle() {

        return driver.getTitle();
    }



    public void verifyVotebutton(){
       elementUtil.doClick(voteButton);
    }

    public boolean verifyShoppingCartLink(){
        return elementUtil.doIsDisplayed(shoppingCartLink);
    }

    public boolean verifyWishlistLink(){
        return elementUtil.doIsDisplayed(wishlistLink);
    }

    public boolean verifyRegisterLink() {

        return elementUtil.doIsDisplayed(registerLink);
    }

    public RegisterPage goToRegisterPage() {
        elementUtil.doClick(registerLink);
        return new RegisterPage(driver);
    }

    public boolean verifyLoginLink() {
      //  return driver.findElement(loginLink).isDisplayed();
        return elementUtil.doIsDisplayed(loginLink);
    }

    public LoginPage goToLoginPage() {
        driver.findElement(loginLink).click();
        return new LoginPage(driver);
    }

    public boolean verifyLogoutLink(){
      //  return driver.findElement(logoutLink).isDisplayed();
        return elementUtil.doIsDisplayed(logoutLink);
    }

    public boolean verifySearchBtn(){
        return elementUtil.doIsDisplayed(searchBtn);
    }

    public boolean verifyGiftCardImage(){
        return elementUtil.doIsDisplayed(giftCardImage);
    }

    public boolean verifyCommunityPollExcellentBtn(){
       // return driver.findElement(By.id("pollanswers-1")).isSelected();
        return elementUtil.doIsSelected(communityPollExcellentBtn);
    }
}

