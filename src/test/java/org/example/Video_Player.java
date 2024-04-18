package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class Video_Player {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver", "/Users/keyanridgeway/Downloads");
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
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement full = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[29]/div[2]/div[2]/button[9]"));
        Thread.sleep(3000);
        full.click();
        Thread.sleep(3000);
    }

    @Test(description = "Test 3 Commenting")
    public void Commenting() throws InterruptedException {
        Thread.sleep(7000);
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

        Thread.sleep(7000);
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

    @Test(description = "Test 4 Volume")
    public void Volume() throws InterruptedException {
        Thread.sleep(5000);
        WebElement Vol = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[29]/div[2]/div[1]/span/button"));
        Thread.sleep(2000);
        Vol.click();
    }

    @Test(description = "Test 5 liking a video")
    public void Like_vid() throws InterruptedException {
        Thread.sleep(7000);
        WebElement like = driver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/segmented-like-dislike-button-view-model/yt-smartimation/div/div/like-button-view-model/toggle-button-view-model/button-view-model"));
        like.click();
    }

    @Test(description = "Test 6 Disliking a video")
    public void dislike_vid() throws InterruptedException {
        Thread.sleep(7000);
        WebElement dislike = driver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/segmented-like-dislike-button-view-model/yt-smartimation/div/div/dislike-button-view-model/toggle-button-view-model/button-view-model/button"));
        dislike.click();
    }

    @Test(description = "Test 7 Add video to new playlist")
    public void playlist() throws InterruptedException {
        Thread.sleep(7000);
        WebElement options = driver.findElement(By.xpath("//*[@id=\"button-shape\"]/button"));
        options.click();
        Thread.sleep(2000);
        WebElement save = driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-menu-service-item-renderer"));//if signed in, its renderer[3]
        save.click();
    }

    @Test(description = "Test 8 Subscribe")
    public void subscribe() throws InterruptedException {
        Thread.sleep(7000);
        WebElement sub = driver.findElement(By.xpath("//*[@id=\"subscribe-button-shape\"]/button"));
        sub.click();
    }

    @Test(description = "Test 9 Captions")
    public void captions() throws InterruptedException {
        Thread.sleep(7000);
        WebElement caption = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[29]/div[2]/div[2]/button[3]"));
        caption.click();
    }

    @Test(description = "Test 10 Mini_player")
    public void mini_player() throws InterruptedException {
        Thread.sleep(7000);
        WebElement mini = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[29]/div[2]/div[2]/button[5]"));
        mini.click();
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

    @Test(description = "Test 11 Theatre mode")
    public void Theatre() throws InterruptedException {
        Thread.sleep(7000);
        WebElement theatre = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[29]/div[2]/div[2]/button[7]"));
        theatre.click();
        Thread.sleep(1000);
        theatre.click();
        //sometimes div[29] works, sometimes div[33] works idk why
    }
/*
    @AfterClass
    public void tearDown() throws InterruptedException {
        // Close the WebDriver
        if (driver != null) {
            Thread.sleep(3000);
            driver.quit();
        }
    }

 */
}



