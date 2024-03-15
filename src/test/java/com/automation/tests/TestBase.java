package com.automation.tests;

import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import ru.yandex.qatools.allure.report.AllureReportBuilderException;

import java.io.IOException;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

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
    private final String url="https://awr-autotrust-dgtl-website-wehxzjtmaq-ew.a.run.app/#s";

    @BeforeSuite
    void setEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "122.0.6261.70")
                        .put("URL", url)
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().browserVersion("122").setup();
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
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDown() throws IOException, AllureReportBuilderException {
        //driver.quit();
    }

}
