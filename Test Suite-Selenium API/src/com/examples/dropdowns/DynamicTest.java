package com.examples.dropdowns;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTest {

    public static void main(String[] args) throws InterruptedException {

        // create Driver object
        BrowserDriverUtil common = new BrowserDriverUtil();
        ChromeDriver driver = common.getChromeDriver();

        // open browser
        driver.get("https://www.spicejet.com/");

        //open From Select
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        // select option
        // by value and index
        //driver.findElement(By.xpath("//a[@value='BLR']")).click();

        // by parent / value
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();

        Thread.sleep(2000L);

        // by value and index
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        // by parent / value
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

        // close browser in focus (child)
        //driver.close();

        // end of test and close all browsers open by selenium scripts
        //driver.quit();

    }
}
