package com.automation.tests;

import io.qameta.allure.Step;
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
    private By btnMyAccount = By.xpath("//img[contains(@alt,'my-account')]");
    private By btnLocations = By.xpath("//p[normalize-space()='Locations']");
    private By lblHeader = By.xpath("//h1[normalize-space()='Experience hassle free car service!']");
    private By btnMaintenanceContractSection = By.xpath("//p[normalize-space()='Maintenance Contracts']");
    @Step("Press Login/SignIn Button")
    public void clickLoginSignIn() {
        click(btnLoginSignIn);
    }

    @Step("Select 1st Brand From brand list")
    public void selectBrand(){
        SelectDataPerform(ddlBrand);
    }

    @Step("Select 1st Model from model List")
    public void selectModel(){
        SelectDataPerform(ddlModel);
    }

    @Step("Select 1st Model from model List")
    public void selectYear(){
        SelectDataPerform(ddlYear);
    }

    @Step("Press Book Now")
    public void clickBookNow(){
        click(btnBookNow);
    }
    @Step("Press My Account")
    public void clickMyAccount(){
        click(btnMyAccount);
    }
    @Step("Press Locations")
    public void clickLocations(){
        click(btnLocations);
    }
    @Step("Validate the Header value exists")
    public boolean isHeaderDisplayed(){
        return isDisplayed(lblHeader);
    }
    @Step("Click Maintenance Contract")
    public void clickMaintenanceContracts(){
        click(btnMaintenanceContractSection);
    }
}
