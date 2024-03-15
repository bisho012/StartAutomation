package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInLoginPage extends PageBase{
    public SignInLoginPage(WebDriver driver) {
        super(driver);
    }

    private By btnSignUp = By.xpath("//a[@href='https://awr-autotrust-dgtl-website-wehxzjtmaq-ew.a.run.app/sign-up']");
    private By txtEmail = By.id("login");
    private By txtPassword = By.id("password");


    public void clickSignUp() {
        click(btnSignUp);
    }

    public void setTxtEmail(String email){
        setText(txtEmail, email);
    }

    public void setTxtPassword(String password){
        setText(txtPassword, password);
    }
}
