package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class Video_Player {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/keyanridgeway/Downloads");
        driver.get("https://www.youtube.com/watch?v=TuUTHYTDtmM&t=891s");
    }

    @Test(description = "Test 1 Play/Pause")
    public void play_pause() throws InterruptedException {
        Thread.sleep(7000);
        WebElement activate = driver.findElement(By.xpath("//*[@id=\"player\"]"));
        activate.click();
        Thread.sleep(3000);
    }

    @Test(description = "Test 2 Fullscreen")
    public void Fullscreen() throws InterruptedException {
        Thread.sleep(5000);
        WebElement full = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[33]/div[2]/div[2]/button[9]"));
        Thread.sleep(3000);
        full.click();
        Thread.sleep(3000);
    }

    @Test(description = "Test 3 Commenting")
    public void Commenting() throws InterruptedException {
        Thread.sleep(7000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(3000);
        WebElement comment = driver.findElement(By.cssSelector("ytd-comments ytd-comment-simplebox-renderer div#placeholder-area"));
        comment.click();
        comment = driver.findElement(By.cssSelector("#contenteditable-root"));
        Thread.sleep(2000);
        comment.sendKeys("hi");
        Thread.sleep(2000);
    }

    @Test(description = "Test 4 Volume")
    public void Volume() throws InterruptedException {
        Thread.sleep(5000);
        WebElement Vol = driver.findElement(By.name("mute"));
        Thread.sleep(2000);
        Vol.click();
    }

    @Test(description = "Test 5 liking a video")
    public void Like_vid() throws InterruptedException {
        Thread.sleep(7000);
        WebElement like = driver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/segmented-like-dislike-button-view-model/yt-smartimation/div/div/like-button-view-model/toggle-button-view-model/button-view-model"));
        like.click();
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        // Close the WebDriver
        if (driver != null) {
            Thread.sleep(3000);
            driver.quit();
        }
    }
}



