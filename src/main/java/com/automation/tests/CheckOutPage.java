package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends PageBase{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    private final By btnAutoTrustAwirService = By.xpath("//p[normalize-space()='Autotrust Awir Service']");
    private final By btnNo = By.xpath("//p[normalize-space()='No']");
    private final By btnYes = By.xpath("//p[normalize-space()='Yes']");
    private final By btnSelectTime = By.xpath("(//p[normalize-space()='18:00 to 18:29'])[1]");
    private final By txtFirstName = By.name("firstName");
    private final By txtLastName = By.name("lastName");
    private final By txtEmail = By.name("email");
    private final By txtPhoneNum = By.name("mobile");
    private final By btnVerify = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-5 MuiGrid-grid-md-4 MuiGrid-grid-lg-3 css-1rvl9ox']//button[@type='button']");
    private final By btnVerifyConfirm = By.xpath("(//div[@class='MuiGrid-root MuiGrid-container style_buttonContainer__IKzF7 css-ry0jrj'])[1]");
    private final By ddlselectEmirate = By.xpath("//div[@id='emirateSelect']");
    private final By ddlselectCategory = By.xpath("//div[@id='categorySelect']");
    private final By txtPlateNumber = By.name("plateNumber");
    private final By btnConfirmPay = By.xpath("//p[normalize-space()='Confirm & Pay']");
    private final By ddlSalutation = By.xpath("//div[contains(text(),'Select Salutation')]");
    private final By ddlSalutationValue = By.xpath("//li[normalize-space()='Mr']");
    private final By ddlselectCategoryValue = By.xpath("//li[normalize-space()='E']");
    private final By ddlselectEmirateValue = By.xpath("//li[normalize-space()='Dubai']");
    private final By btnCashOnDelivery = By.xpath("//p[normalize-space()='Cash on Delivery']");
    private final By btnPickUp = By.xpath("//p[normalize-space()='Pick up']");
    private final By txtSearchMap = By.xpath("//input[@placeholder='Search']");
    private final By txtStreetName = By.xpath("//input[@name='streetName']");
    private final By txtBuildingName = By.xpath("//input[@name='buildingName']");
    private final By txtNearestLandmark = By.xpath("//input[@name='nearestLandmark']");
    private final By txtArea = By.xpath("//input[@name='area']");
    private final By ddlPickUpEmirates = By.xpath("//div[@id='emirateSelect']");
    private final By ddlPickUpEmiratesValue = By.xpath("//li[normalize-space()='Dubai']");
    private final By btnConfirm = By.xpath("//button[normalize-space()='Confirm']");
    private final By btnLogoHomePage = By.xpath("//img[@alt='logo']");
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
        click(btnConfirmPay);
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
        clickPerform(btnCashOnDelivery);
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
    public void setArea(String area){
        setText(txtArea, area);
    }
    public void clickConfirm() throws InterruptedException {
        scrollToElementAndClick(btnConfirm);
    }
    public void clickHomePageLogo() throws InterruptedException {
        waitElement(btnLogoHomePage);
        doubleClick(btnLogoHomePage);
    }

}
