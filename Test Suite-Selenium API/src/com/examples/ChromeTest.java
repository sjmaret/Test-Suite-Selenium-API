package com.examples;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {

		// create Driver object
		BrowserDriverUtil common = new BrowserDriverUtil();
		ChromeDriver driver = common.getChromeDriver();

		// set base url
		String baseUrl = "\"http://google.com\"";

		// open browser
		driver.get(baseUrl);
		
		// validate page title
		System.out.println("Page Title = " + driver.getTitle());
		
		// validate correct url
		System.out.println("Current URL = " + driver.getCurrentUrl());
		
		// validate page source
		//System.out.println("Page Source" + driver.getPageSource());

		driver.get("http://yahoo.com");

		driver.navigate().back();
		
		// close browser in focus (child)
		driver.close();
		
		// end of test and close all browsers open by selenium scripts
		driver.quit();

	}

}
