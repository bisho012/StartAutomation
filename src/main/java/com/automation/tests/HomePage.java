package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By btnLoginSignIn = By.xpath("//p[normalize-space()='Login/Signup']");
    private final By ddlBrand = By.id("brandSelect");
    private final By ddlModel = By.id("modelSelect");
    private final By ddlYear = By.id("yearSelect");
    private final By btnBookNow = By.xpath("//div[@class='MuiGrid-root css-1yvh0jd']//button[@type='submit']");
    private final By btnMyAccount = By.xpath("//img[contains(@alt,'my-account')]");
    private final By btnLocations = By.xpath("//p[normalize-space()='Locations']");
    private final By lblHeader = By.xpath("//h1[normalize-space()='Experience hassle free car service!']");
    private final By btnMaintenanceContractSection = By.xpath("//p[normalize-space()='Maintenance Contracts']");
    private final By btnEnquireNow = By.xpath("(//p[normalize-space()='Enquire Now'])[1]");
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
    @Step("Press Enquire now of Elite Service Contract")
    public void clickEnquireNow() {
        clickPerform(btnEnquireNow);
    }

}
