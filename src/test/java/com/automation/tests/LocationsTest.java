package com.automation.tests;

import com.automation.remarks.video.annotations.Video;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocationsTest extends TestBase {
    @Test(priority = 1)
    @Video(name = "All Locations")
    public void AllServiceCenters() {
        homePage.clickLocations();
        Assert.assertEquals("Autotrust Awir Service",locationsPage.getAwiServiceCenter());
        Assert.assertEquals("Autotrust Sharjah Al Wahda Service",locationsPage.getAutoTrustSharjahAlwahda());
        Assert.assertEquals("Autotrust Service Centre Abudhabi",locationsPage.getAutoTrustServiceCenterAbuDhabi());
    }

    @Test(priority = 2)
    @Video(name = "Dubai Filter")
    public void DubaiServiceCenters() {
        homePage.clickLocations();
        locationsPage.clickDubai();
        locationsPage.waitPageToLoad();
        Assert.assertEquals("Autotrust Awir Service",locationsPage.getAwiServiceCenter());
    }

    @Test(priority = 3)
    @Video(name = "Abu Dhabi Filter")
    public void AbuDhabiServiceCenters() {
        homePage.clickLocations();
        locationsPage.clickAbuDhabi();
        locationsPage.waitPageToLoad();
        Assert.assertEquals("Autotrust Service Centre Abudhabi",locationsPage.getAutoTrustServiceCenterAbuDhabi());
    }

    @Test(priority = 4)
    @Video(name = "Sharjah Filter")
    public void SharjahServiceCenters() {
        homePage.clickLocations();
        locationsPage.clickSharjah();
        locationsPage.waitPageToLoad();
        Assert.assertEquals("Autotrust Sharjah Al Wahda Service",locationsPage.getAutoTrustSharjahAlwahda());
    }
}
