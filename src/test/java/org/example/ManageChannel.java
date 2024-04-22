package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.ArrayList;

public class ManageChannel {
    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testManage() throws InterruptedException {
        /*
        Names and handles can only be changed twice every 14 days, so a new email and password are used for this test
        Email: ridgewaykeyan@gmail.com
        Password: Qwertyuiop1234567890!
         */

        // Go to YouTube website
        chromeDriver.get("https://youtube.com/");
        Thread.sleep(1000);

        chromeDriver.manage().window().maximize();

        // Find the email text box and enter the email
        WebElement loginButton = chromeDriver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]"));
        loginButton.click();

        WebElement emailInput = chromeDriver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        emailInput.sendKeys("ridgewaykeyan@gmail.com");
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

        Thread.sleep(3500);

        // Click on profile on the top left
        WebElement profileButton = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[3]/div[2]/ytd-topbar-menu-button-renderer[2]/button/yt-img-shadow/img"));
        profileButton.click();

        Thread.sleep(1500);

        // Go to own channel
        WebElement viewChannel = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-multi-page-menu-renderer/div[2]/ytd-active-account-header-renderer/div/yt-formatted-string[4]/a"));
        viewChannel.click();

        Thread.sleep(3500);

        // Open customization tab
        WebElement customize = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/div[3]/ytd-c4-tabbed-header-renderer/tp-yt-app-header-layout/div/tp-yt-app-header/div/div/div/div[1]/div/div[2]/div[4]/ytd-button-renderer[1]/yt-button-shape/a"));
        customize.click();
        Thread.sleep(3500);

        // Switch Selenium priority to the second tab opened for the customization
        ArrayList<String> tabs = new ArrayList<>(chromeDriver.getWindowHandles());
        chromeDriver.switchTo().window(tabs.get(1));

        // this is the code to update a profile picture, couldn't get it to work consistently
//        WebElement branding = chromeDriver.findElement(By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[2]/div"));
//        branding.click();
//        Thread.sleep(2000);
//
//        WebElement chooseFile = chromeDriver.findElement(By.xpath("/html/body/ytcp-app/ytcp-entity-page/div/div/main/div/ytcp-animatable[6]/ytcp-channel-editing-section/iron-pages/div[2]/ytcp-channel-editing-images-tab/div/section[1]/ytcp-profile-image-upload/div/div[3]/div[2]/div[2]/ytcp-button"));
//        Thread.sleep(250);
//        chooseFile.sendKeys("C:\\Users\\jayde\\Pictures\\ProfilePic.png");

        Thread.sleep(1500);


        WebElement basicInfo = chromeDriver.findElement(By.xpath("//*[@id=\"tabsContent\"]/tp-yt-paper-tab[3]/div"));
        basicInfo.click();
        Thread.sleep(2000);

        // this is changing the profile name and handle, 2 times per 14 days so it cannot be tested more, but was working
        WebElement name = chromeDriver.findElement(By.xpath("/html/body/ytcp-app/ytcp-entity-page/div/div/main/div/ytcp-animatable[6]/ytcp-channel-editing-section/iron-pages/div[3]/ytcp-channel-editing-details-tab/div/section[1]/ytcp-channel-editing-channel-name/div[2]/ytcp-form-input-container/div[1]/div/input"));
        name.sendKeys(Keys.CONTROL + "a");
        name.sendKeys("Keyan");

        Thread.sleep(1500);

        WebElement handle = chromeDriver.findElement(By.xpath("/html/body/ytcp-app/ytcp-entity-page/div/div/main/div/ytcp-animatable[6]/ytcp-channel-editing-section/iron-pages/div[3]/ytcp-channel-editing-details-tab/div/section[1]/ytcp-channel-editing-channel-handle/div/ytcp-form-input-container/div[1]/div/div/input"));
        handle.sendKeys(Keys.CONTROL + "a");
        handle.sendKeys("Jayden-8612abc3fhg45");

        Thread.sleep(2500);

        // Select and edit description
        WebElement description = chromeDriver.findElement(By.xpath("/html/body/ytcp-app/ytcp-entity-page/div/div/main/div/ytcp-animatable[6]/ytcp-channel-editing-section/iron-pages/div[3]/ytcp-channel-editing-details-tab/div/section[1]/ytcp-social-suggestions-textbox/ytcp-form-input-container/div[1]/div[2]/div/ytcp-social-suggestion-input/div"));
        description.click();
        description.sendKeys(Keys.CONTROL + "a");
        description.sendKeys("This is a test description");

        Thread.sleep(3500);

        // Publish changes
        WebElement publish = chromeDriver.findElement(By.xpath("/html/body/ytcp-app/ytcp-entity-page/div/div/main/div/ytcp-animatable[6]/ytcp-channel-editing-section/ytcp-sticky-header/ytcp-primary-action-bar/div/div[2]/ytcp-button[3]"));
        Thread.sleep(3500);
        publish.click();
        Thread.sleep(3500);

        // Go back to first tab and refresh
        chromeDriver.switchTo().window(tabs.get(0));
        chromeDriver.navigate().refresh();

        Thread.sleep(1500);

        // Open channel setting in top right to show changes
        WebElement profileButton1 = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[3]/div[2]/ytd-topbar-menu-button-renderer[2]/button/yt-img-shadow/img"));
        profileButton1.click();

        Thread.sleep(5000);
    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tabs after the test is finished
        chromeDriver.quit();
    }
}