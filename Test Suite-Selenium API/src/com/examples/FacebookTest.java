package com.examples;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	public static void main(String[] args) {

		// create Driver object
		BrowserDriverUtil common = new BrowserDriverUtil();
		ChromeDriver driver = common.getChromeDriver();
		
		// open browser
		driver.get("http://facebook.com");
		
		// set email & password and click login
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.id("")).click();

		// close browser in focus (child)
		//chromeDriver.close();
		
		// end of test and close all browsers open by selenium scripts
		//chromeDriver.quit();
		
	}

}
