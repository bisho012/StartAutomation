package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.InputEvent;

import static java.awt.event.InputEvent.*;

public class LoginPopUpPage extends PageBase{
    public LoginPopUpPage(WebDriver driver) {
        super(driver);
    }

    private By btnCheckoutAsGuest = By.xpath("//*[contains(text(),'Checkout as Guest')]");
    private By popUp = By.xpath("//div[@class='MuiGrid-root MuiGrid-container css-1d3bbye' and @xpath='1']");
    public void clickCheckoutAsGuest() throws InterruptedException, AWTException {
        moveToView(btnCheckoutAsGuest);
        click(btnCheckoutAsGuest);
    }
}
