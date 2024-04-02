package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageBase{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private final By btnProceedToCheckout = By.xpath("//p[normalize-space()='Proceed to Checkout']");

    public void clickProceedToCheckout() throws InterruptedException {
        scrollToElementAndClick(btnProceedToCheckout);
    }

}
