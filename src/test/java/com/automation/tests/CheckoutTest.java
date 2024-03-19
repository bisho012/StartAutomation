package com.automation.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class CheckoutTest extends TestBase{
    Faker faker = new Faker();
    String emailAddress = "DragonBisho@ibtest.com";
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String phoneNumber = faker.numerify("561616940");
    @Test(priority = 1)
    public void CheckoutServicesDriveToGarageCash() throws InterruptedException, AWTException {
        homePage.waitPageToLoad();
        homePage.selectBrand();
        Thread.sleep(1000);
        homePage.selectModel();
        homePage.selectYear();
        homePage.clickBookNow();
        servicesPage.waitPageToLoad();
        servicesPage.clickCartPeriodicMaintenanceMajor();
        servicesPage.clickCartPeriodicMaintenanceMinor();
        servicesPage.clickCartHealthCheckUp();
        //servicesPage.setDiscountCode("erdf");
        servicesPage.clickCheckout();
        cartPage.waitPageToLoad();
        cartPage.scrolldown();
        cartPage.clickProceedToCheckout();
        loginPopUpPage.clickCheckoutAsGuest();
        Thread.sleep(3000);
        checkOutPage.waitUntilPageLoad();
        checkOutPage.clickAutoTrustAwirService();
        checkOutPage.scrolldown();
        checkOutPage.clickBtnSelectTime();
        checkOutPage.clickNo();
        checkOutPage.scrolldown();
        checkOutPage.selectSalutation();
        Thread.sleep(1000);
        checkOutPage.setFirstName(firstName);
        checkOutPage.setLastName(lastName);
        checkOutPage.setPhoneNumber(phoneNumber);
        checkOutPage.clickVerify();
        checkOutPage.setOTP("0");
        checkOutPage.clickVerifyConfirm();
        checkOutPage.setEmail(emailAddress);
        checkOutPage.scrolldown();
        checkOutPage.selectEmiratie();
        checkOutPage.selectCategory();
        checkOutPage.setPlateNumber("738065");
        checkOutPage.clickCashOnDelivery();
        checkOutPage.clickPreviewPay();
        underReviewPage.waitPageToLoad();
        underReviewPage.scrolldown();
        Assert.assertEquals(underReviewPage.getEmailText(),"DragonBisho@ibtest.com");
        Assert.assertEquals(underReviewPage.getRequestStatus(), "Booking Received");
    }

    @Test(priority = 2)
    public void CheckoutServicesPickUpCash() throws InterruptedException, AWTException {
        homePage.waitPageToLoad();
        homePage.selectBrand();
        Thread.sleep(1000);
        homePage.selectModel();
        homePage.selectYear();
        homePage.clickBookNow();
        servicesPage.waitPageToLoad();
        servicesPage.clickCartPeriodicMaintenanceMajor();
        servicesPage.clickCartPeriodicMaintenanceMinor();
        servicesPage.clickCartHealthCheckUp();
        //servicesPage.setDiscountCode("erdf");
        servicesPage.clickCheckout();
        cartPage.waitPageToLoad();
        cartPage.scrolldown();
        cartPage.clickProceedToCheckout();
        loginPopUpPage.clickCheckoutAsGuest();
        Thread.sleep(3000);
        checkOutPage.waitUntilPageLoad();
        checkOutPage.clickPickUp();
        checkOutPage.setSearchMap("Diera");
        Thread.sleep(2000);
        checkOutPage.setStreetName(faker.address().streetName());
        checkOutPage.setBuildingName(faker.address().buildingNumber());
        checkOutPage.setNearestLandmark("Dragon Mart");
        checkOutPage.selectPickUpEmiratie();
        checkOutPage.clickConfirm();
        checkOutPage.clickYes();
        checkOutPage.clickBtnSelectTime();
        checkOutPage.selectSalutation();
        Thread.sleep(1000);
        checkOutPage.setFirstName(firstName);
        checkOutPage.setLastName(lastName);
        checkOutPage.setPhoneNumber(phoneNumber);
        checkOutPage.clickVerify();
        checkOutPage.setOTP("0");
        checkOutPage.clickVerifyConfirm();
        checkOutPage.setEmail(emailAddress);
        checkOutPage.scrolldown();
        checkOutPage.selectEmiratie();
        checkOutPage.selectCategory();
        checkOutPage.setPlateNumber("738065");
        checkOutPage.clickCashOnDelivery();
        checkOutPage.clickPreviewPay();
        underReviewPage.waitPageToLoad();
        underReviewPage.scrolldown();
        Assert.assertEquals(underReviewPage.getEmailText(),"DragonBisho@ibtest.com");
        Assert.assertEquals(underReviewPage.getRequestStatus(), "Booking Received");
    }
}
