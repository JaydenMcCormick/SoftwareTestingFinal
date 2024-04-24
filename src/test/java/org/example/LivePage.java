package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LivePage {
    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void tesLivepage() throws InterruptedException {
        chromeDriver.get("https://youtube.com/");
        chromeDriver.manage().window().maximize();

        Thread.sleep(1500);

        // Open live tab on left banner, for some reason xpath wouldn't work for any i could find
        WebElement live = chromeDriver.findElement(By.linkText("Live"));
        live.click();

        Thread.sleep(3500);

        // click show more, also scrolls down automatically
        WebElement showMore = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[6]/ytd-rich-section-renderer[2]/div/ytd-rich-shelf-renderer/div[1]/div[3]/ytd-button-renderer/yt-button-shape/button"));
        showMore.click();

        Thread.sleep(3000);

        // click show less
        WebElement showLess = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[6]/ytd-rich-section-renderer[2]/div/ytd-rich-shelf-renderer/div[1]/div[4]/ytd-button-renderer/yt-button-shape/button"));
        showLess.click();

        Thread.sleep(1000);

        // scroll back up to top of page
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollTo(0, 0)");

        Thread.sleep(1500);

        // click view all to view all upcoming livestreams
        WebElement viewAll = chromeDriver.findElement(By.linkText("View all"));
        js.executeScript("arguments[0].click();", viewAll);


        Thread.sleep(3000);

        // click on first video, first upcoming livestream
        WebElement firstVideo = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[6]/ytd-rich-grid-row/div/ytd-rich-item-renderer[1]/div/ytd-rich-grid-media/div[1]/div[3]/div[1]/h3/a"));
        js.executeScript("arguments[0].click();", firstVideo);

        Thread.sleep(5000);
    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}