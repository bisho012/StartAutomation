package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnderReviewPage extends PageBase{
    public UnderReviewPage(WebDriver driver) {
        super(driver);
    }

    private By lblEmail = By.xpath("//*[contains(text(),'DragonBisho@ibtest.com')]");
    private By lblRequestStatusReceived = By.xpath("//p[normalize-space()='Booking Received']");

    public String getEmailText(){
        return getContent(lblEmail);
    }

    public String getRequestStatus(){
        return getContent(lblRequestStatusReceived);
    }
}
