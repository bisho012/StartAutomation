package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends PageBase{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    private By txtName = By.name("name");
    private By txtEmail = By.name("email");
    private By txtPhoneNum = By.name("phone_number");
    private By btnSignUp = By.xpath("//button[@type='submit']");

    public void setTxtName(String name){
        setText(txtName, name);
    }

    public void setTxtEmail(String email){
        setText(txtEmail, email);
    }

    public void setPhoneNumber(String phoneNumber){
        setText(txtPhoneNum, phoneNumber);
    }

    public void clickSignUp(){
        click(btnSignUp);
    }
}
