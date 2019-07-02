package com.examples.dropdowns;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticTest {

    public static void main(String[] args) {

        // create Driver object
        BrowserDriverUtil common = new BrowserDriverUtil();
        ChromeDriver driver = common.getChromeDriver();

        // open browser
        driver.get("https://www.spicejet.com/");

        // find specific select
        Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

        // select value from dropdown
        select.selectByValue("USD");
        select.selectByIndex(0);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        select.selectByVisibleText("AED");

        // close browser in focus (child)
        //driver.close();

        // end of test and close all browsers open by selenium scripts
        //driver.quit();

    }
}
