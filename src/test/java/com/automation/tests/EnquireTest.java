package com.automation.tests;

import com.automation.remarks.video.annotations.Video;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnquireTest extends TestBase{
    Faker faker = new Faker();

    @Test(priority = 0)
    @Video(name = "Enquire Elite Service Contract From Service Page")
    public void enquireEliteServiceContract() throws InterruptedException {
        homePage.clickLoginSignIn();
        signInLoginPage.scrollDown();
        signInLoginPage.setEmail("janaki.narayanan@awrostamani.com");
        signInLoginPage.setPassword("Test@123");
        signInLoginPage.clickSignIn();
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

    @Test(priority = 1)
    @Video(name = "Enquire Nxtus Express Package from Home Page")
    public void enquireNxtusExpressPackage() throws InterruptedException {
        homePage.scrollDown();
        homePage.clickEnquireNow();
        enquirePage.waitPageToLoad();
        enquirePage.selectSalutation();
        enquirePage.setFirstName(faker.name().firstName());
        enquirePage.setLastName(faker.name().lastName());
        enquirePage.setEmail(faker.internet().emailAddress());
        enquirePage.setPhoneNumber(faker.numerify("561616940"));
        enquirePage.selectBrand();
        Thread.sleep(1000);
        enquirePage.selectModel();
        enquirePage.selectYear();
        enquirePage.selectMileage();
        enquirePage.setComment(faker.lorem().paragraph());
        enquirePage.clickSubmitEnquire();
        Assert.assertEquals("Inquiry Submitted successfully!", enquirePage.getSuccesMsg());
        Assert.assertTrue(enquirePage.isSuccessMessageDisplayed());
    }
}
