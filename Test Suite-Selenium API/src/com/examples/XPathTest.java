package com.examples;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTest {

    public static void main(String[] args) {

        // create Driver object
        BrowserDriverUtil common = new BrowserDriverUtil();
        ChromeDriver driver = common.getChromeDriver();

        driver.get("http://www.qaclickacademy.com/interview.php");

        // find by text
        driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

        // find sibling
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

        // find parent
        System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
    }
}
