package com.automation.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnquireTest extends TestBase{
    Faker faker = new Faker();
    @Test
    public void EnquireEliteServiceContract() throws InterruptedException {
        homePage.clickLoginSignIn();
        signInLoginPage.scrolldown();
        signInLoginPage.setEmail("janaki.narayanan@awrostamani.com");
        signInLoginPage.setPassword("Test@123");
        signInLoginPage.clickSignIn();
        checkOutPage.clickHomePageLogo();
        homePage.waitPageToLoad();
        homePage.selectBrand();
        Thread.sleep(1000);
        homePage.selectModel();
        homePage.selectYear();
        homePage.clickBookNow();
        Thread.sleep(3000);
        servicesPage.clickMaintenanceContracts();
        servicesPage.waitPageToLoad();
        servicesPage.waitUntilPageLoad();
        servicesPage.clickEnquireNow();
        servicesPage.selectSalutation();
        servicesPage.selectMilage();
        servicesPage.setComment(faker.lorem().paragraph());
        servicesPage.clickSubmitEnquire();
        Assert.assertTrue(servicesPage.isSuccessMsgDisplayed());
        Assert.assertEquals("Your enquiry has been submitted. Our agents will call you in 24 hrs", servicesPage.getSuccessMsg());
    }
}
