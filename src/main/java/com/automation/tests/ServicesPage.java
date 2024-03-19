package com.automation.tests;

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


}
