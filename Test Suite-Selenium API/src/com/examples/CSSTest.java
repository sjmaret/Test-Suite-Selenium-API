package com.examples;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTest {

    public static void main(String[] args) {

        // create Driver object
        BrowserDriverUtil common = new BrowserDriverUtil();
        ChromeDriver driver = common.getChromeDriver();

        driver.get("https://login.salesforce.com/");

        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("sjmaret@gmail.com");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123456");
        //driver.findElement(By.cssSelector("input[id='Login']")).click();
        driver.findElement(By.cssSelector("#Login")).click();

    }
}
