package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SearchPage {
    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testSearching() throws InterruptedException {
        chromeDriver.get("https://youtube.com/");
        Thread.sleep(1000);

        chromeDriver.manage().window().maximize();

        // Find search bar and click into it
        WebElement searchBar = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
        searchBar.click();

        Thread.sleep(1000);

        // Search for the organic chemistry tutor
        searchBar.sendKeys("The Organic Chemistry Tutor");
        Thread.sleep(1000);

        // Press enter key
        searchBar.sendKeys(Keys.ENTER);

        Thread.sleep(3500);

        WebElement shorts = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/div/ytd-search-header-renderer/div[1]/yt-chip-cloud-renderer/div/div[2]/iron-selector/yt-chip-cloud-chip-renderer[2]/yt-formatted-string"));
        shorts.click();

        Thread.sleep(2000);

        WebElement videos = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/div/ytd-search-header-renderer/div[1]/yt-chip-cloud-renderer/div/div[2]/iron-selector/yt-chip-cloud-chip-renderer[3]/yt-formatted-string"));
        videos.click();

        Thread.sleep(2000);

        WebElement unwatched = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/div/ytd-search-header-renderer/div[1]/yt-chip-cloud-renderer/div/div[2]/iron-selector/yt-chip-cloud-chip-renderer[4]/yt-formatted-string"));
        unwatched.click();

        Thread.sleep(2000);

        WebElement watched = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/div/ytd-search-header-renderer/div[1]/yt-chip-cloud-renderer/div/div[2]/iron-selector/yt-chip-cloud-chip-renderer[5]/yt-formatted-string"));
        watched.click();

        Thread.sleep(2000);

        WebElement all = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/div/ytd-search-header-renderer/div[1]/yt-chip-cloud-renderer/div/div[2]/iron-selector/yt-chip-cloud-chip-renderer[1]/yt-formatted-string"));
        all.click();

        Thread.sleep(1250);

        WebElement filtersButton = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/div/ytd-search-header-renderer/div[3]/ytd-button-renderer/yt-button-shape/button"));
        filtersButton.click();

        Thread.sleep(2000);

        WebElement uploadDate = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-paper-dialog/ytd-search-filter-options-dialog-renderer/div[2]/ytd-search-filter-group-renderer[5]/ytd-search-filter-renderer[2]/a"));
        uploadDate.click();

        Thread.sleep(4000);

        WebElement filtersButton1 = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/div/ytd-search-header-renderer/div[3]/ytd-button-renderer/yt-button-shape/button"));
        filtersButton1.click();

        Thread.sleep(2000);

        WebElement durationButton = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-paper-dialog/ytd-search-filter-options-dialog-renderer/div[2]/ytd-search-filter-group-renderer[3]/ytd-search-filter-renderer[1]/a"));
        durationButton.click();

        Thread.sleep(2000);

        JavascriptExecutor js =(JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollBy(0, 710)");

        Thread.sleep(4000);

        WebElement closeSearch = chromeDriver.findElement(By.xpath("//*[@id=\"search-clear-button\"]/ytd-button-renderer/yt-button-shape/button"));
        closeSearch.click();

        Thread.sleep(3000);

        searchBar.sendKeys("Selenium installation");
        Thread.sleep(1000);
        searchBar.sendKeys(Keys.ENTER);

        Thread.sleep(3500);
    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}