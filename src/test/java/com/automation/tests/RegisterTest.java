package com.automation.tests;


import Utils.ExcelFileManager;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends TestBase {
    Faker faker = new Faker();
    String emailAddress = "DragonBisho@ibtest.com";
    String Name = faker.name().firstName();
    String phoneNumber = faker.numerify("561616940");

    @Test
    @Step("Create Account")
    public void createAccount() throws IOException, InterruptedException {
        homePage.clickLoginSignIn();
        signInLoginPage.scrolldown();
        signInLoginPage.clickSignUp();
        signUpPage.setTxtName(Name);
        signUpPage.setTxtEmail(emailAddress);
        signUpPage.setPhoneNumber(phoneNumber);
        signUpPage.clickSignUp();
    }
}
