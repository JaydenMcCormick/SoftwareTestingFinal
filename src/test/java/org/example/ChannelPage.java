package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ChannelPage {
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

        // Click button again to pull up options
        WebElement subscribeButton1 = chromeDriver.findElement(By.xpath("//*[@id=\"page-header\"]/yt-page-header-renderer/yt-page-header-view-model/div/div[1]/div/yt-flexible-actions-view-model/div[1]/yt-subscribe-button-view-model/yt-animated-action/div[1]/div[2]/button"));
        subscribeButton1.click();
        Thread.sleep(1000);

        // Find and click enable all notifications button
        WebElement allNotis = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/yt-sheet-view-model/yt-contextual-sheet-layout/div[2]/yt-list-view-model/yt-list-item-view-model[1]/radio-shape/label"));
        allNotis.click();
        Thread.sleep(2000);

        // Click subscribe button again
        WebElement subscribeButton2 = chromeDriver.findElement(By.xpath("//*[@id=\"page-header\"]/yt-page-header-renderer/yt-page-header-view-model/div/div[1]/div/yt-flexible-actions-view-model/div[1]/yt-subscribe-button-view-model/yt-animated-action/div[1]/div[2]/button"));
        subscribeButton2.click();
        Thread.sleep(2000);

        // Find and click unsubscribe button
        WebElement unSub = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-iron-dropdown/div/yt-sheet-view-model/yt-contextual-sheet-layout/div[2]/yt-list-view-model/yt-list-item-view-model[4]/div"));
        unSub.click();
        Thread.sleep(2000);

        // Confirm the unsubscription
        WebElement confirmUnsub = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-paper-dialog/yt-confirm-dialog-renderer/div[2]/div[2]/yt-button-renderer[3]/yt-button-shape/button/yt-touch-feedback-shape/div"));
        confirmUnsub.click();
        Thread.sleep(2000);

        // Find and click the pause button on the "intro" video on the homepage
        WebElement pausePlayer = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-channel-video-player-renderer/div[1]/ytd-player/div/div/div[30]/div[2]/div[1]/button"));
        pausePlayer.click();
        Thread.sleep(2000);

        // Click through the filters at the top
        WebElement filterOne = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/div[3]/ytd-tabbed-page-header/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/yt-tab-group-shape/div[1]/yt-tab-shape[2]"));
        filterOne.click();
        Thread.sleep(2000);

        WebElement filterTwo = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/div[3]/ytd-tabbed-page-header/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/yt-tab-group-shape/div[1]/yt-tab-shape[3]"));
        filterTwo.click();
        Thread.sleep(2000);

        WebElement filterThree = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/div[3]/ytd-tabbed-page-header/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/yt-tab-group-shape/div[1]/yt-tab-shape[4]"));
        filterThree.click();
        Thread.sleep(2000);

        WebElement filterFour = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/div[3]/ytd-tabbed-page-header/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/yt-tab-group-shape/div[1]/yt-tab-shape[5]"));
        filterFour.click();
        Thread.sleep(2000);

        // Click "More" button by channel description to pull up full about page
        WebElement aboutButton = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/div[3]/ytd-tabbed-page-header/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/div/div[2]/yt-page-header-renderer/yt-page-header-view-model/div/div[1]/div/yt-description-preview-view-model/truncated-text/button"));
        aboutButton.click();
        Thread.sleep(2000);

        // "x" it out
        WebElement closeAbout = chromeDriver.findElement(By.xpath("/html/body/ytd-app/ytd-popup-container/tp-yt-paper-dialog/ytd-engagement-panel-section-list-renderer/div[1]/ytd-engagement-panel-title-header-renderer/div[3]/div[6]/ytd-button-renderer/yt-button-shape/button"));
        closeAbout.click();
        Thread.sleep(2000);

        // Search channel videos for Calculus and press enter
        WebElement channelSearch = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/div[3]/ytd-tabbed-page-header/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/yt-tab-group-shape/div[1]/yt-tab-shape[6]/ytd-expandable-tab-renderer/yt-icon-button/button"));
        channelSearch.click();
        Thread.sleep(1000);

        WebElement searchText = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/div[3]/ytd-tabbed-page-header/tp-yt-app-header-layout/div/tp-yt-app-header/div[2]/tp-yt-app-toolbar/div/div/tp-yt-paper-tabs/div/div/yt-tab-group-shape/div[1]/yt-tab-shape[6]/ytd-expandable-tab-renderer/form/tp-yt-paper-input/tp-yt-paper-input-container/div[2]/div/iron-input/input"));
        searchText.sendKeys("Calculus");
        searchText.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        // Click the first video that comes up in the search
        WebElement firstVideo = chromeDriver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse/ytd-two-column-browse-results-renderer/div[1]/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer/div[1]/div/div[1]/div/h3"));
        firstVideo.click();

        Thread.sleep(5000);
    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}