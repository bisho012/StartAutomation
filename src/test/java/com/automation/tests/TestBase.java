package com.automation.tests;


import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.enums.RecordingMode;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners(UniversalVideoListener.class)
public class TestBase {
    WebDriver driver;
    HomePage homePage;
    SignInLoginPage signInLoginPage;
    SignUpPage signUpPage;
    ServicesPage servicesPage;
    CartPage cartPage;
    LoginPopUpPage loginPopUpPage;
    CheckOutPage checkOutPage;
    UnderReviewPage underReviewPage;
    AccountPage accountPage;
    LocationsPage locationsPage;
    EnquirePage enquirePage;
    private final String url="https://test.autotrustdgtl.awr-api.com/";

    @BeforeMethod
    public void setUp() {
        System.setProperty("video.save.mode", RecordingMode.ALL.toString());

        WebDriverManager.chromedriver().browserVersion("132").setup();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        signInLoginPage = new SignInLoginPage(driver);
        signUpPage = new SignUpPage(driver);
        servicesPage = new ServicesPage(driver);
        cartPage = new CartPage(driver);
        loginPopUpPage = new LoginPopUpPage(driver);
        checkOutPage = new CheckOutPage(driver);
        underReviewPage = new UnderReviewPage(driver);
        accountPage = new AccountPage(driver);
        locationsPage = new LocationsPage(driver);
        enquirePage = new EnquirePage(driver);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
