package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends PageBase{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    private By txtFirstName = By.name("given_name");
    private By txtLastName= By.name("family_name");
    private By txtEmail = By.name("email");
    private By txtPhoneNum = By.name("mobile");
    private By btnSignUp = By.xpath("//button[@type='submit']");
    private By ddlSalutation = By.xpath("//div[contains(text(),'Select Salutation')]");
    private By ddlSalutationValue = By.xpath("//li[normalize-space()='Mr']");
    private By txtErrMsg = By.xpath("//p[normalize-space()='Phone number already in use. Please login.']");

    @Step("Set First Name")
    public void setFirstName(String firstName){
        setText(txtFirstName, firstName);
    }
    @Step("Set Last Name")
    public void setLastName(String lastName){
        setText(txtLastName, lastName);
    }
    @Step("Set Email")
    public void setEmail(String email){
        setText(txtEmail, email);
    }
    @Step("Set Email")
    public void setPhoneNumber(String phoneNumber){
        setText(txtPhoneNum, phoneNumber);
    }
    @Step("Click SignUp")
    public void clickSignUp(){
        click(btnSignUp);
    }
    @Step("Select Salutation")
    public void selectSalutation() throws InterruptedException {
        scrollToElementAndClick(ddlSalutation);
        scrollToElementAndClick(ddlSalutationValue);
    }
    @Step("Error message Appears")
    public boolean isErrorMsgDisplayed(){
        waitElement(txtErrMsg);
        return isDisplayed(txtErrMsg);
    }

    @Step("Error message Value")
    public String ErrMsg(){
        return getContent(txtErrMsg);
    }
}
