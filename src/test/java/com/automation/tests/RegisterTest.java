package com.automation.tests;


import Utils.ExcelFileManager;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends TestBase {
    Faker faker = new Faker();
    String emailAddress = "DragonBisho@ibtest.com";
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String password = faker.number().digits(10);
    String company = faker.company().name();
    String address = faker.address().cityName();
    String postalCode = faker.number().digits(5);
    String additionalInfo = faker.pokemon().name();
    String phone = faker.phoneNumber().phoneNumber();

    @Test
    public void createAccount() throws IOException, InterruptedException {
        mainPage.openAuthentication();
        createAccountPage.setEmailAddress(emailAddress);
        createAccountPage.clickOnCreateAccount();
        registrationPage.setRb_title();
        Assert.assertTrue(registrationPage.infoIsDisplayed());
        registrationPage.setTxtCustomerFirstName(ExcelFileManager.setExcelFile(0,0));
        registrationPage.setTxtCustomerLastName(ExcelFileManager.setExcelFile(1,0));
//        registrationPage.setTxtEmail(emailAddress);
//        registrationPage.setTxtPassword(password);
//        registrationPage.setDdlDay();
//        registrationPage.setDdlMonths();
//        registrationPage.setDdlYears();
//        registrationPage.setBtnSignUpNewsLetter();
//        registrationPage.setBtnRecieveSpecialOffers();
//        registrationPage.setTxtFirstName(firstName);
//        registrationPage.setTxtLastName(lastName);
//        registrationPage.setTxtCompany(company);
//        registrationPage.setTxtAddress(address);
//        registrationPage.setTextAddress2(address);
//        registrationPage.setTxtCity(address);
//        registrationPage.setTxtState();
//        registrationPage.setTxtPostalCode(postalCode);
//        registrationPage.setTxtCountry();
//        registrationPage.setTxtAdditionalInfo(additionalInfo);
//        registrationPage.setTxtPhone(phone);
//        registrationPage.setTxtMobilePhone(phone);
//        registrationPage.setTxtAlias(additionalInfo);
//        registrationPage.setBtnRegister();




    }
}
