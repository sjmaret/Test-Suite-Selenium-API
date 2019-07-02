package com.examples.dropdowns;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestedTest {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        // create Driver object
        BrowserDriverUtil common = new BrowserDriverUtil();
        ChromeDriver driver = common.getChromeDriver();

        // open browser
        driver.get("https://www.spicejet.com/");

        //
        WebElement source = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        source.clear();
        source.sendKeys("MUM");
        Thread.sleep(2000L);
        source.sendKeys(Keys.ENTER);

        WebElement destination = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
        destination.clear();
        destination.sendKeys("AIP");
        Thread.sleep(2000L);
        destination.sendKeys(Keys.ARROW_DOWN);
        destination.sendKeys(Keys.ENTER);

        // close browser in focus (child)
        //driver.close();

        // end of test and close all browsers open by selenium scripts
        //driver.quit();

    }
}
