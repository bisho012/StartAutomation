package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends PageBase{

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    private By txtEmailAddress = By.xpath("//input[@id='email_create']");
    private By btnCreateAccount = By.id("SubmitCreate");

    @Step("add data on text [{emailAddress}]")
    public void setEmailAddress(String emailAddress){
        setText(txtEmailAddress, emailAddress);
    }

    @Step("click on Create Account")
    public void clickOnCreateAccount(){
        click(btnCreateAccount);
    }
}
