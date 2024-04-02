package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends PageBase{
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    private final By lblName = By.xpath("//p[normalize-space()='Hi Janaki Narayanan!']");
    private final By btnSignOut = By.xpath("//img[@alt='Sign Out']");
    private final By btnYes = By.id("yesBtn");
    private final By btnLogoHomePage = By.xpath("//img[@alt='Logo']");

    public String getName(){
        return getContent(lblName);
    }
    @Step("Click Sign Out")
    public void clickSignOut(){
        click(btnSignOut);
    }
    @Step("Click Yes")
    public void clickYes(){
        click(btnYes);
    }
    @Step("Click On AutoTrustLogo")
    public void clickHomePageLogo() throws InterruptedException {
        waitElement(btnLogoHomePage);
        doubleClick(btnLogoHomePage);
    }
}
