package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By btnLoginSignIn = By.xpath("//p[normalize-space()='Login/Signup']");
    private By ddlBrand = By.id("brandSelect");
    private By ddlModel = By.id("modelSelect");
    private By ddlYear = By.id("yearSelect");
    private By btnBookNow = By.xpath("//div[@class='MuiGrid-root css-1yvh0jd']//button[@type='submit']");

    public void clickLoginSignIn() {
        click(btnLoginSignIn);
    }

    public void selectBrand(){
        SelectDataPerform(ddlBrand);
    }

    public void selectModel(){
        SelectDataPerform(ddlModel);
    }

    public void selectYear(){
        SelectDataPerform(ddlYear);
    }

    public void clickBookNow(){
        click(btnBookNow);
    }

}
