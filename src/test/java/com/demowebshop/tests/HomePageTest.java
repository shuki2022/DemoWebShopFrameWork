package com.demowebshop.tests;

import com.demowebshop.base.BaseTest;
import com.demowebshop.util.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test(priority = 1)
    public void validatePageTitleTest(){
        //homepage object is inherent from BaseTest;
        Assert.assertEquals(homePage.getPageTitle(), Constants.PAGE_TITLE);
    }
    @Test(priority = 2)
    public void verifyLogoTest(){
        Assert.assertTrue(homePage.verifyLogo());
    }

    @Test(priority = 3)
    public void verifyRegisterTest(){
        Assert.assertTrue(homePage.verifyRegisterLink());
    }

    @Test(priority = 4)
    public void verifyLoginLinkTest(){
        Assert.assertTrue(homePage.verifyLoginLink());
    }

    @Test(priority = 5)
    public void verifyShoppingCartTest(){
        Assert.assertTrue(homePage.verifyShoppingCartLink());
    }

    @Test(priority = 6)
    public void verifyWishListLinkTest(){
        Assert.assertTrue(homePage.verifyWishlistLink());
    }

    @Test(priority = 7)
    public void verifySearchBtnTest(){
        Assert.assertTrue(homePage.verifySearchBtn());
    }

    @Test(priority = 8)
    public void VerifyGiftCardImage(){
        Assert.assertTrue(homePage.verifyGiftCardImage());
    }

    @Test(priority = 9)
    public void verifyCommunityPollExcellentBtn(){
        Assert.assertFalse(homePage.verifyCommunityPollExcellentBtn());
    }
}
