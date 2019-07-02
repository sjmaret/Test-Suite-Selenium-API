package com.examples.dropdowns;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedTest {

    public static void main(String[] args) throws InterruptedException {

        // create Driver object
        BrowserDriverUtil common = new BrowserDriverUtil();
        ChromeDriver driver = common.getChromeDriver();

        // open browser
        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // click the '+' multiple times
        for (int i=1; i<4; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        // click the Done button
        driver.findElement(By.id("btnclosepaxoption")).click();

        //Assert.assertEquals(driver.findElement(By.id("btnclosepaxoption")), "4 Adult");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // close browser in focus (child)
        //driver.close();

        // end of test and close all browsers open by selenium scripts
        //driver.quit();

    }
}
