package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class VideoPage {
    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testHomepage() throws InterruptedException {
        chromeDriver.get("https://www.youtube.com/watch?v=HaHsqDjWMLU");

        Thread.sleep(2000);

        WebElement videoPlayer = chromeDriver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[38]/div[2]/div[2]/button[9]"));
        videoPlayer.click();
        Thread.sleep(2000);

    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}