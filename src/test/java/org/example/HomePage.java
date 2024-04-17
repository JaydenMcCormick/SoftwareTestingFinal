package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HomePage {
    /*
    Used to fully test the homepage of YouTube, use random login:
    email: j9095327@gmail.com and password: QwertyuioP1234567890!
     */

    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testHomepage() throws InterruptedException {
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

        // Find "Subscriptions" on the left banner and click
        WebElement subscriptionsTab = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[3]/a/tp-yt-paper-item/yt-formatted-string"));
        subscriptionsTab.click();

        Thread.sleep(1500);

        // Find "History" on the left banner and click
        WebElement historyTab = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-collapsible-section-entry-renderer/div[2]/ytd-guide-entry-renderer[2]/a/tp-yt-paper-item/yt-formatted-string"));
        historyTab.click();

        Thread.sleep(1500);

        // Find "My Playlists" on the left banner and click
        WebElement playlistsTab = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-collapsible-section-entry-renderer/div[2]/ytd-guide-entry-renderer[3]/a/tp-yt-paper-item/yt-formatted-string"));
        playlistsTab.click();

        Thread.sleep(1500);

        // Find "Trending" on the left banner and click
        WebElement trendingTab = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[2]/div/ytd-guide-entry-renderer[1]/a/tp-yt-paper-item/yt-formatted-string"));
        trendingTab.click();

        Thread.sleep(1750);

        // Find three horizontal lines on the left banner to fold and click
        WebElement bannerFold = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[1]/yt-icon-button[2]/button/yt-icon/yt-icon-shape/icon-shape/div"));
        bannerFold.click();

        Thread.sleep(1750);

        // Wouldn't just double-click for some reason, so re-find it as another variable
        WebElement bannerFold1 = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[1]/yt-icon-button[2]/button/yt-icon/yt-icon-shape/icon-shape/div"));

        bannerFold1.click();
        Thread.sleep(1750);

        // Find "Sports" in "Explore" on the left banner and click
        WebElement sportsTab = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[2]/div/ytd-guide-entry-renderer[8]/a/tp-yt-paper-item/yt-formatted-string"));
        sportsTab.click();

        Thread.sleep(1750);

        // Find "Home" on the left banner and click
        WebElement homeButton = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/tp-yt-app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[1]/div/ytd-guide-entry-renderer[1]/a/tp-yt-paper-item/yt-formatted-string"));
        homeButton.click();

        Thread.sleep(1750);

        // Click through top filters (under the search box)
        WebElement filterOne = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[1]/ytd-feed-filter-chip-bar-renderer/div/div/div[3]/iron-selector/yt-chip-cloud-chip-renderer[2]/yt-formatted-string"));
        filterOne.click();

        Thread.sleep(1500);

        WebElement filterTwo = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[1]/ytd-feed-filter-chip-bar-renderer/div/div/div[3]/iron-selector/yt-chip-cloud-chip-renderer[3]/yt-formatted-string"));
        filterTwo.click();

        Thread.sleep(1500);

        WebElement filterThree = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[1]/ytd-feed-filter-chip-bar-renderer/div/div/div[3]/iron-selector/yt-chip-cloud-chip-renderer[4]/yt-formatted-string"));
        filterThree.click();

        Thread.sleep(1500);

        WebElement filterFour = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[1]/ytd-feed-filter-chip-bar-renderer/div/div/div[3]/iron-selector/yt-chip-cloud-chip-renderer[5]/yt-formatted-string"));
        filterFour.click();

        Thread.sleep(1500);

        WebElement filterFive = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-rich-grid-renderer/div[1]/ytd-feed-filter-chip-bar-renderer/div/div/div[3]/iron-selector/yt-chip-cloud-chip-renderer[6]/yt-formatted-string"));
        filterFive.click();

        Thread.sleep(1500);

        // Find the first video under the fifth filter and click into it
        WebElement firstVideo = chromeDriver.findElement(By.xpath("(//a[@id='video-title-link' and contains(@class, 'yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-media')])[1]"));

        // Use Javascript to click on the button as there is overlapping elements and regular .click() won't select the element
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("arguments[0].click();", firstVideo);

        Thread.sleep(2500);

        // Find "YouTube" logo in the top left and click on it to go home
        WebElement youtubeButton = chromeDriver.findElement(By.xpath("//*[@id=\"logo-icon\"]/yt-icon-shape/icon-shape/div"));
        youtubeButton.click();

        Thread.sleep(2500);

        // Click on profile on the top left
        WebElement profileButton = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[3]/div[2]/ytd-topbar-menu-button-renderer[2]/button/yt-img-shadow/img"));
        profileButton.click();

        Thread.sleep(1500);

        // Click sign out button
        WebElement signOut = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/ytd-multi-page-menu-renderer/div[3]/div[1]/yt-multi-page-menu-section-renderer[1]/div[2]/ytd-compact-link-renderer[3]/a/tp-yt-paper-item/div[2]/yt-formatted-string[1]"));
        signOut.click();

        Thread.sleep(3000);
    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}
