package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends PageBase{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    private By btnAutoTrustAwirService = By.xpath("//p[normalize-space()='Autotrust Awir Service']");
    private By btnNo = By.xpath("//p[normalize-space()='No']");
    private By btnSelectTime = By.xpath("(//p[normalize-space()='18:00 to 18:29'])[1]");
    private By setTxtFirstName = By.name("firstName");
    private By setTxtLastName = By.name("lastName");
    private By txtEmail = By.name("email");
    private By txtPhoneNum = By.name("mobile");
    private By btnVerify = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-5 MuiGrid-grid-md-4 MuiGrid-grid-lg-3 css-1rvl9ox']//button[@type='button']");
    private By ddlselectEmirate = By.xpath("//div[@id='emirateSelect']");
    private By ddlselectCategory = By.xpath("//div[@id='categorySelect']");
    private By setTxtPlateNumber = By.name("plateNumber");
    private By btnReviewPay = By.xpath("//button[@type='submit']");
    private By ddlSalutation = By.xpath("//div[contains(text(),'Select Salutation')]");
    private By ddlSalutationValue = By.xpath("//li[normalize-space()='Mr']");
    private By ddlselectCategoryValue = By.xpath("//li[normalize-space()='E']");
    private By ddlselectEmirateValue = By.xpath("//li[normalize-space()='Dubai']");
    public void clickAutoTrustAwirService() throws InterruptedException {
        scrollToElementAndClick(btnAutoTrustAwirService);
    }
    public void clickNo() throws InterruptedException {
        waitElement(btnNo);
        doubleClick(btnNo);
    }
    public void clickBtnSelectTime() throws InterruptedException {
        scrollToElementAndClick(btnSelectTime);
    }
    public void setFirstName(String name){
        setText(setTxtFirstName, name);
    }
    public void setLastName(String name){
        setText(setTxtLastName, name);
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
        setText(setTxtPlateNumber, name);
    }
    public void clickPreviewPay(){
        doubleClick(btnReviewPay);
        //click(btnReviewPay);
    }

    public void selectSalutation() throws InterruptedException {
        scrollToElementAndClick(ddlSalutation);
        scrollToElementAndClick(ddlSalutationValue);
    }
}
