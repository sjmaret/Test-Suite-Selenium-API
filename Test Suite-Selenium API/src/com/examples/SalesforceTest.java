package com.examples;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceTest {

public static void main(String[] args) {

		// create Driver object
		BrowserDriverUtil common = new BrowserDriverUtil();
		ChromeDriver driver = common.getChromeDriver();
		
		// open browser
		driver.get("https://login.salesforce.com");
		
		// set email & password and click login
		driver.findElement(By.cssSelector("#username")).sendKeys("sjmaret@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		// close browser in focus (child)
		//driver.close();
		
		// end of test and close all browsers open by selenium scripts
		//driver.quit();
		
	}

}
