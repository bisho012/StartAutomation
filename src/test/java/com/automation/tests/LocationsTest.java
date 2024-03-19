package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocationsTest extends TestBase {
    @Test(priority = 1)
    public void AllServiceCenters() {
        homePage.clickLocations();
        Assert.assertEquals("Autotrust Awir Service",locationsPage.getAwiServiceCenter());
        Assert.assertEquals("Autotrust Sharjah Al Wahda Service",locationsPage.getAutoTrustSharjahAlwahda());
        Assert.assertEquals("Autotrust Service Centre Abudhabi",locationsPage.getAutoTrustServiceCenterAbuDhabi());
    }

    @Test(priority = 2)
    public void DubaiServiceCenters() {
        homePage.clickLocations();
        locationsPage.clickDubai();
        locationsPage.waitPageToLoad();
        Assert.assertEquals("Autotrust Awir Service",locationsPage.getAwiServiceCenter());
    }

    @Test(priority = 3)
    public void AbuDhabiServiceCenters() {
        homePage.clickLocations();
        locationsPage.clickAbuDhabi();
        locationsPage.waitPageToLoad();
        Assert.assertEquals("Autotrust Service Centre Abudhabi",locationsPage.getAutoTrustServiceCenterAbuDhabi());
    }

    @Test(priority = 4)
    public void SharjahServiceCenters() {
        homePage.clickLocations();
        locationsPage.clickSharjah();
        locationsPage.waitPageToLoad();
        Assert.assertEquals("Autotrust Sharjah Al Wahda Service",locationsPage.getAutoTrustSharjahAlwahda());
    }
}
