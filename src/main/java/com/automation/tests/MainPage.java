package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends PageBase {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By signIn = By.linkText("Sign in");

    public void openAuthentication() {
        click(signIn);
    }
}
