package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnquirePage extends PageBase{
    public EnquirePage(WebDriver driver) {
        super(driver);
    }

    private final By ddlSalutationValue = By.xpath("//li[normalize-space()='Mrs']");
    private final By ddlSalutation = By.xpath("//div[contains(text(),'Select Salutation')]");
    private final By txtFirstName = By.name("firstName");
    private final By txtLastName = By.name("lastName");
    private final By txtEmail = By.name("email");
    private final By txtPhoneNum = By.xpath("(//input[@name='mobile'])[2]");
    private final By ddlBrand = By.xpath("(//div[@id='brandSelect'])[2]");
    private final By ddlModel = By.xpath("(//div[@id='modelSelect'])[2]");
    private final By ddlYear = By.xpath("(//div[@id='yearSelect'])[2]");
    private final By ddlMilage = By.xpath("//div[@id='currentMileage']");
    private final By ddlMilageValue = By.xpath("//li[normalize-space()='100,000km - 120,000km']");
    private final By txtComment = By.xpath("//textarea[@placeholder='Write your comment here']");
    private final By btnSubmitEnquiry = By.xpath("//p[normalize-space()='Submit Enquiry']");
    private final By lblsuccessMsg = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-dmxql1']");
    @Step("Select Salutation")
    public void selectSalutation() throws InterruptedException {
        click(ddlSalutation);
        scrollToElementAndClick(ddlSalutationValue);
    }
    @Step("Enter First Name")
    public void setFirstName(String name){
        setText(txtFirstName, name);
    }
    @Step("Enter Last Name")
    public void setLastName(String name){
        setText(txtLastName, name);
    }
    @Step("Enter Email")
    public void setEmail(String email){
        setText(txtEmail, email);
    }
    @Step("Enter Phone Number")
    public void setPhoneNumber(String phoneNumber){
        setText(txtPhoneNum, phoneNumber);
    }
    @Step("Select 1st Brand From brand list")
    public void selectBrand(){
        SelectDataPerform(ddlBrand);
    }
    @Step("Select 1st Model from model List")
    public void selectModel(){
        SelectDataPerform(ddlModel);
    }
    @Step("Select 1st Model from model List")
    public void selectYear(){
        SelectDataPerform(ddlYear);
    }
    @Step("Select Mileage")
    public void selectMileage() throws InterruptedException {
        clickPerform(ddlMilage);
        clickPerform(ddlMilageValue);
    }
    @Step("Set Comment")
    public void setComment(String comment){
        setText(txtComment, comment);
    }
    @Step("Click Submit Enquiry")
    public void clickSubmitEnquire() {
        doubleClick(btnSubmitEnquiry);
    }
    @Step("Verify Success Message appears With correct spelling")
    public String getSuccesMsg(){
        return getContent(lblsuccessMsg);
    }
    @Step("Verify that Success Message appears to the User")
    public boolean isSuccessMessageDisplayed(){
        return isDisplayed(lblsuccessMsg);
    }

}
