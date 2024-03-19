package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void LoginWithValidUser() throws InterruptedException {
        homePage.clickLoginSignIn();
        signInLoginPage.scrolldown();
        signInLoginPage.setEmail("janaki.narayanan@awrostamani.com");
        signInLoginPage.setPassword("Test@123");
        signInLoginPage.clickSignIn();
        checkOutPage.clickHomePageLogo();
        homePage.clickMyAccount();
        accountPage.waitPageToLoad();
        Assert.assertEquals("Hi Janaki Narayanan!", accountPage.getName());
    }

    @Test
    public void LoginWithNonValidUser() {
        homePage.clickLoginSignIn();
        signInLoginPage.scrolldown();
        signInLoginPage.setEmail("janaki.narayanan@awrostamani.com");
        signInLoginPage.setPassword("Test@Test@123");
        signInLoginPage.clickSignIn();
        Assert.assertEquals("Invalid Email/Phone number or Password",signInLoginPage.getErrorMsg());
    }

    @Test
    public void SignOut() throws InterruptedException {
        LoginWithValidUser();
        accountPage.clickSignOut();
        accountPage.clickYes();
        Assert.assertTrue(homePage.isHeaderDisplayed());
    }
}
