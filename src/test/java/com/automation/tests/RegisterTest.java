package com.automation.tests;


import com.automation.remarks.video.annotations.Video;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends TestBase {
    Faker faker = new Faker();
    String emailAddress = "DragonBisho@ibtest.com";
    String FName = faker.name().firstName();
    String LName = faker.name().lastName();
    String phoneNumber = faker.numerify("561616940");

    @Test
    @Video(name = "Create Account")
    @Step("Create Account")
    public void createPreviouslyCreatedAccount() throws IOException, InterruptedException {
        homePage.clickLoginSignIn();
        signInLoginPage.scrollDown();
        signInLoginPage.clickSignUp();
        signUpPage.selectSalutation();
        signUpPage.setFirstName(FName);
        signUpPage.setLastName(LName);
        signUpPage.setEmail(emailAddress);
        signUpPage.setPhoneNumber(phoneNumber);
        signUpPage.clickSignUp();
        Assert.assertTrue(signUpPage.isErrorMsgDisplayed());
        Assert.assertEquals("Phone number already in use. Please login.", signUpPage.ErrMsg());
    }
}
