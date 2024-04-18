package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Subscriptions {
    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testHomepage() throws InterruptedException {
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

        Thread.sleep(5000);

        // Find the password text box and enter the password
        WebElement passInput = chromeDriver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passInput.sendKeys("QwertyuioP1234567890!");
        Thread.sleep(1000);

        // Find the next button and click it
        WebElement passNext = chromeDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        passNext.click();

        Thread.sleep(3500);

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

        // Find and click first channel
        WebElement openChannel = chromeDriver.findElement(By.xpath("//*[@id=\"avatar-section\"]/a"));
        openChannel.click();

        Thread.sleep(3500);

        // Click subscribe button to subscribe
        WebElement subscribeButton = chromeDriver.findElement(By.xpath("//*[@id=\"page-header\"]/yt-page-header-renderer/yt-page-header-view-model/div/div[1]/div/yt-flexible-actions-view-model/div[1]/yt-subscribe-button-view-model/yt-animated-action/div[1]/div[2]/button"));
        subscribeButton.click();

        Thread.sleep(2000);

        // Find "YouTube" logo in the top left and click on it to go home
        WebElement youtubeButton = chromeDriver.findElement(By.xpath("//*[@id=\"logo-icon\"]/yt-icon-shape/icon-shape/div"));
        youtubeButton.click();

        Thread.sleep(2500);

        chromeDriver.navigate().refresh();
        Thread.sleep(1500);

        WebElement subscribed = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[2]/div/ytd-guide-entry-renderer[1]/a/tp-yt-paper-item/yt-formatted-string"));
        subscribed.click();

        Thread.sleep(2500);

        WebElement subscriptionsTab = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[3]/a/tp-yt-paper-item/yt-formatted-string"));
        subscriptionsTab.click();

        Thread.sleep(2500);

        WebElement listView = chromeDriver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/ytd-button-renderer[2]/yt-button-shape"));
        listView.click();

        Thread.sleep(3750);

        WebElement gridView = chromeDriver.findElement(By.xpath("//*[@id=\"top-level-buttons-computed\"]/ytd-button-renderer/yt-button-shape/a"));
        gridView.click();

        Thread.sleep(2500);

        WebElement shorts = chromeDriver.findElement(By.linkText("View all"));
        shorts.click();

        Thread.sleep(2500);

        WebElement subscriptionsTab1 = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[3]/a/tp-yt-paper-item/yt-formatted-string"));
        subscriptionsTab1.click();

        Thread.sleep(2500);

        WebElement manageButton = chromeDriver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-button-renderer/yt-button-shape"));
        manageButton.click();

        Thread.sleep(2500);

        WebElement subButton = chromeDriver.findElement(By.xpath("//*[@id=\"notification-preference-button\"]/ytd-subscription-notification-toggle-button-renderer-next/yt-button-shape"));
        subButton.click();
        Thread.sleep(2500);

        WebElement unsub = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-menu-popup-renderer/tp-yt-paper-listbox/ytd-menu-service-item-renderer[4]/tp-yt-paper-item"));
        unsub.click();
        Thread.sleep(1500);

        WebElement confirmUnsub = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-paper-dialog/yt-confirm-dialog-renderer/div[2]/div[2]/yt-button-renderer[3]/yt-button-shape/button/yt-touch-feedback-shape/div"));
        confirmUnsub.click();
        Thread.sleep(2500);

        chromeDriver.navigate().refresh();
        Thread.sleep(3500);

        WebElement subscriptionsTab2 = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[3]/a/tp-yt-paper-item/yt-formatted-string"));
        subscriptionsTab2.click();

        Thread.sleep(3500);
    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}