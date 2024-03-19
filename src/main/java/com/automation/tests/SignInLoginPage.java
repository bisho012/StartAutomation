package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInLoginPage extends PageBase{
    public SignInLoginPage(WebDriver driver) {
        super(driver);
    }

    private By btnSignUp = By.xpath("//a[@href='https://awr-autotrust-dgtl-website-wehxzjtmaq-ew.a.run.app/sign-up']");
    private By txtEmail = By.id("login");
    private By txtPassword = By.id("password");
    private By btnSignIn = By.id("signin");
    private By lblErrormsg = By.xpath("//p[@class='error']");

    @Step("Click Sign Up")
    public void clickSignUp() {
        doubleClick(btnSignUp);
    }
    @Step("Set Email")
    public void setEmail(String email){
        setText(txtEmail, email);
    }
    @Step("Set Password")
    public void setPassword(String password){
        setText(txtPassword, password);
    }
    @Step("Click Sign In")
    public void clickSignIn() {
        doubleClick(btnSignIn);
    }
    public String getErrorMsg(){
        return getContent(lblErrormsg);
    }
}
