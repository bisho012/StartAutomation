package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocationsPage extends PageBase {
    public LocationsPage(WebDriver driver) {
        super(driver);
    }

    By lblAutoTrustAwirService = By.xpath("//p[normalize-space()='Autotrust Awir Service']");
    By lblAutoTrustSharjahAlWahda = By.xpath("//p[normalize-space()='Autotrust Sharjah Al Wahda Service']");
    By lblAutoTrustServiceCenterAbuDhabi = By.xpath("//p[normalize-space()='Autotrust Service Centre Abudhabi']");
    By btnDubai = By.xpath("//div[contains(text(),'Dubai')]");
    By btnAbuDhabi = By.xpath("//div[contains(text(),'Abu Dhabi')]");
    By btnSharjah = By.xpath("//div[contains(text(),'Sharjah')]");

    public String getAwiServiceCenter(){
        return getContent(lblAutoTrustAwirService);
    }

    public String getAutoTrustSharjahAlwahda(){
        return getContent(lblAutoTrustSharjahAlWahda);
    }

    public String getAutoTrustServiceCenterAbuDhabi(){
        return getContent(lblAutoTrustServiceCenterAbuDhabi);
    }

    public void clickDubai(){
        click(btnDubai);
    }
    public void clickAbuDhabi(){
        click(btnAbuDhabi);
    }
    public void clickSharjah(){
        click(btnSharjah);
    }
}
