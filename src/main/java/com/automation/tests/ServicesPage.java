package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPage extends PageBase{

    public ServicesPage(WebDriver driver) {
        super(driver);
    }

    private By btnAddToCartPeriodicMaintenanceMajor = By.xpath("(//button[@type='button'])[4]");
    private By btnAddToCartPeriodicMaintenanceMinor = By.xpath("(//button[@type='button'])[5]");
    private By btnAddToCartHealthCheckUp = By.xpath("(//button[@type='button'])[6]");
    private By lblTotalAmount = By.cssSelector("div[class='MuiGrid-root MuiGrid-container css-1rr0jkq'] p[class='MuiTypography-root MuiTypography-body1 css-1m6wyjo']");
    private By txtDiscountCode = By.xpath("//input[@name='streetname']");
    private By btnCheckout = By.xpath("//div[@class='MuiGrid-root style_checkout_btn__MkF_D css-ahsd8r']//button[@type='submit']");
    private By btnMaintenanceContractSection = By.xpath("//p[normalize-space()='Maintenance Contracts']");
    private By btn1EnquireNow = By.xpath("(//p[normalize-space()='Enquire Now'])[1]");
    private By ddlMilage = By.xpath("(//div[@id='currentMileage'])[1]");
    private By ddlMilagevalue = By.xpath("//li[normalize-space()='100,000km - 120,000km']");
    private By txtComment = By.xpath("//textarea[@placeholder='Write your comment here']");
    private By btnSubmitEnquiry = By.xpath("//p[normalize-space()='Submit Enquiry']");
    private By ddlSalutation = By.xpath("//div[contains(text(),'Select Salutation')]");
    private By ddlSalutationValue = By.xpath("//li[normalize-space()='Mrs']");
    private By lblEnquirySuccessMsg = By.xpath("//p[contains(text(),'Your enquiry has been submitted. Our agents will c')]");

    public void clickCartPeriodicMaintenanceMajor() throws InterruptedException {
        //scrollToElementAndClick(btnAddToCartPeriodicMaintenanceMajor);
        waitButtonAndClick(btnAddToCartPeriodicMaintenanceMajor);
    }
    public void clickCartPeriodicMaintenanceMinor() throws InterruptedException {
        scrolldown();
        scrollToElementAndClick(btnAddToCartPeriodicMaintenanceMinor);
    }
    public void clickCartHealthCheckUp() throws InterruptedException {
        scrolldown();
        scrollToElementAndClick(btnAddToCartHealthCheckUp);
    }
    public void setDiscountCode(String discountCode) {
        setText(txtDiscountCode, discountCode);
        pressEnter(txtDiscountCode);
    }
    public void clickCheckout(){
        click(btnCheckout);
    }
    public void clickMaintenanceContracts(){
        doubleClick(btnMaintenanceContractSection);
    }
    public void clickEnquireNow() {
        doubleClick(btn1EnquireNow);
    }
    public void selectMilage() throws InterruptedException {
        doubleClick(ddlMilage);
        scrollToElementAndClick(ddlMilagevalue);
    }
    public void setComment(String comment){
        setText(txtComment, comment);
    }
    public void clickSubmitEnquire() {
        doubleClick(btnSubmitEnquiry);
    }
    @Step("Select Salutation")
    public void selectSalutation() throws InterruptedException {
        scrollToElementAndClick(ddlSalutation);
        scrollToElementAndClick(ddlSalutationValue);
    }
    public boolean isSuccessMsgDisplayed(){
        return isDisplayed(lblEnquirySuccessMsg);
    }
    public String getSuccessMsg(){
      return getContent(lblEnquirySuccessMsg);
    }

}
