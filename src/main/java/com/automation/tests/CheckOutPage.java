package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends PageBase{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    private By btnAutoTrustAwirService = By.xpath("//p[normalize-space()='Autotrust Awir Service']");
    private By btnNo = By.xpath("//p[normalize-space()='No']");
    private By btnYes = By.xpath("//p[normalize-space()='Yes']");
    private By btnSelectTime = By.xpath("(//p[normalize-space()='18:00 to 18:29'])[1]");
    private By txtFirstName = By.name("firstName");
    private By txtLastName = By.name("lastName");
    private By txtEmail = By.name("email");
    private By txtPhoneNum = By.name("mobile");
    private By btnVerify = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-5 MuiGrid-grid-md-4 MuiGrid-grid-lg-3 css-1rvl9ox']//button[@type='button']");
    private By btnVerifyConfirm = By.xpath("(//div[@class='MuiGrid-root MuiGrid-container style_buttonContainer__IKzF7 css-ry0jrj'])[1]");
    private By ddlselectEmirate = By.xpath("//div[@id='emirateSelect']");
    private By ddlselectCategory = By.xpath("//div[@id='categorySelect']");
    private By txtPlateNumber = By.name("plateNumber");
    private By btnReviewPay = By.xpath("//button[@type='submit']");
    private By ddlSalutation = By.xpath("//div[contains(text(),'Select Salutation')]");
    private By ddlSalutationValue = By.xpath("//li[normalize-space()='Mr']");
    private By ddlselectCategoryValue = By.xpath("//li[normalize-space()='E']");
    private By ddlselectEmirateValue = By.xpath("//li[normalize-space()='Dubai']");
    private By btnCashOnDelivery = By.xpath("//body/div[@id='__next']/div/div/div/div[contains(@class,'MuiGrid-root style_checkout_container__VY3_6 css-rfnosa')]/div[contains(@class,'MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3 css-1o39eoj')]/div[contains(@class,'MuiGrid-root MuiGrid-item MuiGrid-grid-sm-12 MuiGrid-grid-md-6 MuiGrid-grid-lg-4 style_checkout_cart__eZOWM css-f7ma57')]/div[contains(@class,'style_order_summary__n7Wzl')]/div[contains(@class,'MuiGrid-root style_pay_button__5_7l6 css-rfnosa')]/div[contains(@class,'MuiGrid-root css-ahsd8r')]/div[contains(@class,'MuiGrid-root MuiGrid-container style_card_container__iUGzv css-1d3bbye')]/div[contains(@class,'MuiGrid-root style_card_content__uilwh css-rfnosa')]/div[contains(@class,'MuiGrid-root MuiGrid-container style_payment_container__046DT css-1d3bbye')]/div[2]/div[1]");
    private By btnPickUp = By.xpath("//p[normalize-space()='Pick up']");
    private By txtSearchMap = By.xpath("//input[@placeholder='Search']");
    private By txtStreetName = By.xpath("//input[@id=':ra:']");
    private By txtBuildingName = By.xpath("//input[@id=':rb:']");
    private By txtNearestLandmark = By.xpath("//input[@id=':rc:']");
    private By ddlPickUpEmirates = By.xpath("//div[@id='emirateSelect']");
    private By ddlPickUpEmiratesValue = By.xpath("//li[normalize-space()='Dubai']");
    private By btnConfirm = By.xpath("//button[normalize-space()='Confirm']");
    public void clickAutoTrustAwirService() throws InterruptedException {
        scrollToElementAndClick(btnAutoTrustAwirService);
    }
    public void clickNo() throws InterruptedException {
        waitElement(btnNo);
        doubleClick(btnNo);
    }
    public void clickYes() throws InterruptedException {
        waitElement(btnYes);
        doubleClick(btnYes);
    }
    public void clickBtnSelectTime() throws InterruptedException {
        scrollToElementAndClick(btnSelectTime);
    }
    public void setFirstName(String name){
        setText(txtFirstName, name);
    }
    public void setLastName(String name){
        setText(txtLastName, name);
    }
    public void setEmail(String email){
        setText(txtEmail, email);
    }
    public void setPhoneNumber(String phoneNumber){
        setText(txtPhoneNum, phoneNumber);
    }
    public void clickVerify(){
        click(btnVerify);
    }
    public void selectEmiratie() throws InterruptedException {
        doubleClick(ddlselectEmirate);
        scrollToElementAndClick(ddlselectEmirateValue);
    }
    public void selectCategory() throws InterruptedException {
        doubleClick(ddlselectCategory);
        scrollToElementAndClick(ddlselectCategoryValue);
    }

    public void setPlateNumber(String name){
        setText(txtPlateNumber, name);
    }
    public void clickPreviewPay(){
        doubleClick(btnReviewPay);
        //click(btnReviewPay);
    }

    public void selectSalutation() throws InterruptedException {
        scrollToElementAndClick(ddlSalutation);
        scrollToElementAndClick(ddlSalutationValue);
    }

    public void setOTP(String OTP) {
        for (int i=1; i<=6; i++) {
            By txtOTP = By.xpath("//input[@aria-label='Please enter OTP character "+i+"']");
            setText(txtOTP, OTP);
        }
    }
    public void clickVerifyConfirm(){
        doubleClick(btnVerifyConfirm);
    }
    public void clickCashOnDelivery(){
        click(btnCashOnDelivery);
    }
    public void clickPickUp(){
        click(btnPickUp);
    }
    public void setSearchMap(String searchMap) throws InterruptedException {
        setText(txtSearchMap, searchMap);
        Thread.sleep(3000);
        click(txtSearchMap);
        SelectDataPerform(txtSearchMap);
    }
    public void setStreetName(String streetName){
        setText(txtStreetName, streetName);
    }
    public void setBuildingName(String buildingName){
        setText(txtBuildingName, buildingName);
    }
    public void setNearestLandmark(String nearestLandmark){
        setText(txtNearestLandmark, nearestLandmark);
    }
    public void selectPickUpEmiratie() throws InterruptedException {
        doubleClick(ddlPickUpEmirates);
        scrollToElementAndClick(ddlPickUpEmiratesValue);
    }
    public void clickConfirm() throws InterruptedException {
        scrollToElementAndClick(btnConfirm);
    }

}
