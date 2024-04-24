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
        //System.setProperty("webdriver.chrome.driver", "/Users/keyanridgeway/Downloads");
        driver.get("https://www.youtube.com/watch?v=BR2VC6d53D4");
    }

    @Test(priority = 1, description = "Test 1 Play/Pause")
    public void play_pause() throws InterruptedException {
        Thread.sleep(2000);
        WebElement activate = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[38]/div[2]/div[1]/button"));
        activate.click();
        Thread.sleep(1500);
        activate.click();
        Thread.sleep(1500);
    }

    @Test(priority = 2, description =  "Test 2 Fullscreen")
    public void Fullscreen() throws InterruptedException {
        Thread.sleep(2000);
        WebElement full = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[38]/div[2]/div[2]/button[9]"));
        Thread.sleep(2000);
        full.click();
        Thread.sleep(2000);
        full.click();
        Thread.sleep(2000);
    }

    @Test(priority = 3, description =  "Test 3 Volume")
    public void Volume() throws InterruptedException {
        Thread.sleep(2000);
        WebElement Vol = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[38]/div[2]/div[1]/span/button"));
        Thread.sleep(2000);
        Vol.click();
        Thread.sleep(2000);
        Vol.click();
        Thread.sleep(2000);
    }

    @Test(priority = 4, description =  "Test 4 liking a video")
    public void Like_vid() throws InterruptedException {
        WebElement like = driver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/segmented-like-dislike-button-view-model/yt-smartimation/div/div/like-button-view-model/toggle-button-view-model/button-view-model"));
        like.click();
        Thread.sleep(2000);
    }

    @Test(priority = 5, description =  "Test 5 Disliking a video")
    public void dislike_vid() throws InterruptedException {
        WebElement dislike = driver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/segmented-like-dislike-button-view-model/yt-smartimation/div/div/dislike-button-view-model/toggle-button-view-model/button-view-model/button"));
        dislike.click();
        Thread.sleep(2000);
    }

    @Test(priority = 6, description =  "Test 6 Add video to new playlist")
    public void playlist() throws InterruptedException {
        WebElement options = driver.findElement(By.xpath("//*[@id=\"flexible-item-buttons\"]/yt-button-view-model/button-view-model/button"));
        options.click();
        Thread.sleep(2000);
    }


    @Test(priority = 7, description =  "Test 7 Captions")
    public void captions() throws InterruptedException {
        WebElement caption = driver.findElement(By.cssSelector("button.ytp-subtitles-button"));
        caption.click();
        Thread.sleep(3500);
    }

    @Test(priority = 8, description =  "Test 8 Theatre mode")
    public void Theatre() throws InterruptedException {
        WebElement theatre = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[38]/div[2]/div[2]/button[7]"));
        theatre.click();
        Thread.sleep(1500);
        theatre.click();
        //sometimes div[29] works, sometimes div[33] works idk why
    }

    @Test(priority = 9, description =  "Test 9 Commenting")
    public void Commenting() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().window().maximize();
        // Find the email text box and enter the email
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
        loginButton.click();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        emailInput.sendKeys("j9095327@gmail.com");
        Thread.sleep(1000);

        // Find the next button and click it
        WebElement emailNext = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        emailNext.click();

        Thread.sleep(5000);

        // Find the password text box and enter the password
        WebElement passInput = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passInput.sendKeys("QwertyuioP1234567890!");
        Thread.sleep(1000);

        // Find the next button and click it
        WebElement passNext = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        passNext.click();

        Thread.sleep(3500);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(2500);
        WebElement comment = driver.findElement(By.cssSelector("ytd-comments ytd-comment-simplebox-renderer div#placeholder-area"));
        comment.click();

        comment = driver.findElement(By.cssSelector("#contenteditable-root"));

        Thread.sleep(2000);
        comment.sendKeys("hi");
        Thread.sleep(2000);

        //WebElement submit_button = driver.findElement(By.xpath("//*[@id=\"submit-button\"]/yt-button-shape/button"));
        //submit_button.click();

    }

    @Test(priority = 10, description =  "Test 10 Subscribe")
    public void subscribe() throws InterruptedException {
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
        Thread.sleep(500);
        WebElement sub = driver.findElement(By.xpath("//*[@id=\"subscribe-button-shape\"]/button"));
        sub.click();
        Thread.sleep(3500);
    }

    @Test(priority = 11, description =  "Test 11 Mini_player")
    public void mini_player() throws InterruptedException {
        WebElement video = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[1]/video"));
        video.click();
        Thread.sleep(1000);

        WebElement mini = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[38]/div[2]/div[2]/button[5]"));
        mini.click();
        Thread.sleep(3500);

        /*Thread.sleep(2000);
        WebElement mini_select = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[22]/div"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(mini_select).perform();
        Thread.sleep(2000);
        WebElement max = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[22]/div/button[2]"));
        max.click();
        */
        //mini player works fine, but the maximize button requires you to hover over it first,
        // and it isn't working
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        // Close the WebDriver
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}



