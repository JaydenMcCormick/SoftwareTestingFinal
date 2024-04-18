package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SearchPage {
    private WebDriver chromeDriver;

    @BeforeMethod
    public void setUp() {
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testHomepage() throws InterruptedException {

    }

    @AfterMethod
    public void endTest() {
        // Close the Chrome tab after the test is finished
        chromeDriver.close();
    }
}