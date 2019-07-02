package com.examples;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) {

        // create Driver object
        BrowserDriverUtil common = new BrowserDriverUtil();
        ChromeDriver driver = common.getChromeDriver();

        // open browser
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        //driver.findElement(By.xpath("//input[@value='Milk']")).click();
        int size = driver.findElements(By.xpath("//input[@name='group1']")).size();

        for (int i=0; i< size; i++) {
            System.out.println("Radio value = " + driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));

            String value = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            if (value.equalsIgnoreCase("Milk")) {
                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            }

        }

        // close browser in focus (child)
        //driver.close();

        // end of test and close all browsers open by selenium scripts
        //driver.quit();

    }
}
