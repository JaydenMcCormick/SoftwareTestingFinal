package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TrendingPage {
    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testTrending() throws InterruptedException {
        // Go to YouTube website
        chromeDriver.get("https://youtube.com/");
        Thread.sleep(1000);

        chromeDriver.manage().window().maximize();

        // Find the email text box and enter the email
        WebElement loginButton = chromeDriver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
        loginButton.click();

        WebElement emailInput = chromeDriver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        emailInput.sendKeys("j9095327@gmail.com");
        Thread.sleep(1000);

        // Find the next button and click it
        WebElement emailNext = chromeDriver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        emailNext.click();

        Thread.sleep(3500);

        // Find the password text box and enter the password
        WebElement passInput = chromeDriver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passInput.sendKeys("QwertyuioP1234567890!");
        Thread.sleep(1000);

        // Find the next button and click it
        WebElement passNext = chromeDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        passNext.click();

        Thread.sleep(3000);

        // Find "Trending" on the left banner and click
        WebElement trendingTab = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[2]/div/ytd-guide-entry-renderer[1]/a/tp-yt-paper-item/yt-formatted-string"));
        trendingTab.click();

        Thread.sleep(1750);

        WebElement musicTab = chromeDriver.findElement(By.xpath("//*[@id=\"tabsContent\"]/yt-tab-group-shape/div[1]/yt-tab-shape[2]"));
        musicTab.click();

        Thread.sleep(2000);

        WebElement gamingTab = chromeDriver.findElement(By.xpath("//*[@id=\"tabsContent\"]/yt-tab-group-shape/div[1]/yt-tab-shape[3]"));
        gamingTab.click();

        Thread.sleep(2000);

        WebElement moviesTab = chromeDriver.findElement(By.xpath("//*[@id=\"tabsContent\"]/yt-tab-group-shape/div[1]/yt-tab-shape[4]"));
        moviesTab.click();

        Thread.sleep(2000);

        WebElement nowTab = chromeDriver.findElement(By.xpath("//*[@id=\"tabsContent\"]/yt-tab-group-shape/div[1]/yt-tab-shape[1]"));
        nowTab.click();

        Thread.sleep(2000);

        WebElement rightArrow = chromeDriver.findElement(By.xpath("//*[@id=\"right-arrow\"]/ytd-button-renderer/yt-button-shape/button"));
        rightArrow.click();

        Thread.sleep(2000);

        WebElement leftArrow = chromeDriver.findElement(By.xpath("//*[@id=\"left-arrow\"]/ytd-button-renderer/yt-button-shape/button"));
        leftArrow.click();

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollTo(0, 0)");

        Thread.sleep(2000);

        WebElement firstVideo = chromeDriver.findElement(By.xpath("//*[@id=\"title-wrapper\"]/h3"));
        js.executeScript("arguments[0].click();", firstVideo);

        Thread.sleep(3500);
    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}