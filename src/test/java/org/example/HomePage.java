package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HomePage {
    /*
    This will run exam question 1, where we demonstrate logging into Gmail and getting the current URL and Title of the page
    To do this, I made a fake Gmail account for this question with
    email: j9095327@gmail.com and password: QwertyuioP1234567890!
    just so that I can do this assignment with no worries.
     */

    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        // Setup for question done below. Here, we initialize the ChromeDriver.
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testGmailLogin() throws InterruptedException {
        // Go to Gmail website to login
        chromeDriver.get("https://youtube.com/");
        Thread.sleep(1000);

        // Find the email text box and enter the email
        WebElement loginButton = chromeDriver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
        loginButton.click();

        WebElement emailInput = chromeDriver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        emailInput.sendKeys("j9095327@gmail.com");
        Thread.sleep(1000);

        // Find the next button and click it
        WebElement emailNext = chromeDriver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        emailNext.click();

        Thread.sleep(3000);

        // Find the password text box and enter the password
        WebElement passInput = chromeDriver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passInput.sendKeys("QwertyuioP1234567890!");
        Thread.sleep(1000);

        // Find the next button and click it
        WebElement passNext = chromeDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        passNext.click();

        Thread.sleep(2500);


    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}
