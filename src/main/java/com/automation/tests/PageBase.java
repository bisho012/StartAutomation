package com.automation.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import static java.time.Duration.ofSeconds;
import static java.util.concurrent.TimeUnit.SECONDS;

public class PageBase {

    WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    protected WebElement action(By locator){
        return driver.findElement(locator);
    }
    protected void WaitLocatorToLoad(By locator) {
        Wait<WebDriver> fluentWait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(ofSeconds(60))
                        .pollingEvery(ofSeconds(2))
                        .ignoring(NoSuchElementException.class);
        WebElement webElement = fluentWait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static WebElement waitForDropdownPopulate(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        return wait.until(drv -> {
            WebElement elementList = drv.findElement(locator);
            elementList.click();
            if (elementList.findElements(locator).size() >= 2) {
                return elementList;
            }
            return null;
        });
    }

    protected void waitElement(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitPageToLoad(){
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
    }

    protected void waitButtonAndClick(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.stalenessOf(action(locator)));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    }

    protected void setText(By locator, String data) {
        waitElement(locator);
        action(locator).clear();
        action(locator).sendKeys(data);
    }

    protected void click(By locator){
        waitElement(locator);
        action(locator).click();
    }

    public void selectDataByIndex(By locator, int index) {
        Select select;
        select = new Select(action(locator));
        select.selectByIndex(index);
    }

    public void SelectDataPerform(By locator){
        action(locator).click();
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
    }

    public boolean isDisplayed(By locator){
        return action(locator).isDisplayed();
    }

    public String getContent(By locator){
        return action(locator).getText();
    }

    public void scrolldown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,250)");
    }

    public void scrollToElementAndClick(By locator) throws InterruptedException {
        WebElement element = action(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void refresh(){
        driver.navigate().refresh();
    }

    public void waitUntilPageLoad(){
        String url = driver.getCurrentUrl();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));
    }

    public void pressEnter(By locator){
        action(locator).sendKeys(Keys.ENTER);
    }
    public void moveToView(By locator){
        WebElement element = action(locator);
        WebElement myElement = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myElement);
    }

    public void doubleClick(By locator){
        waitElement(locator);
        Actions act = new Actions(driver);
        //Double click on element
        WebElement ele = action(locator);
        act.doubleClick(ele).perform();
    }

    public void SelectDataPerformDoubleClick(By locator){
        doubleClick(locator);
        Actions keyDown = new Actions(driver);
        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
    }

    protected void Refresh(){
        driver.navigate().refresh();
    }
}