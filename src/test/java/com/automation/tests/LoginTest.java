package com.automation.tests;

import com.automation.remarks.video.annotations.Video;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    @Video(name = "Login With Valid User")
    public void LoginWithValidUser() throws InterruptedException {
        homePage.clickLoginSignIn();
        signInLoginPage.scrollDown();
        signInLoginPage.setEmail("janaki.narayanan@awrostamani.com");
        signInLoginPage.setPassword("Test@123");
        signInLoginPage.clickSignIn();
        //checkOutPage.clickHomePageLogo();
        homePage.clickMyAccount();
        accountPage.waitPageToLoad();
        Assert.assertEquals("Hi Janaki Narayanan!", accountPage.getName());
    }

    @Test
    @Video(name = "Login With Non valid User")
    public void LoginWithNonValidUser() {
        homePage.clickLoginSignIn();
        signInLoginPage.scrollDown();
        signInLoginPage.setEmail("janaki.narayanan@awrostamani.com");
        signInLoginPage.setPassword("Test@test@123");
        signInLoginPage.clickSignIn();
        Assert.assertEquals("Invalid Email/Phone number or Password",signInLoginPage.getErrorMsg());
    }

    @Test
    @Video(name = "Sign Out")
    public void SignOut() throws InterruptedException {
        LoginWithValidUser();
        accountPage.clickSignOut();
        accountPage.clickYes();
        Assert.assertTrue(homePage.isHeaderDisplayed());
    }
}
