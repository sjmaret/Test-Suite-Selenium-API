package com.examples;

import com.utilities.BrowserDriverUtil;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {

		// create Driver object
		BrowserDriverUtil common = new BrowserDriverUtil();
		FirefoxDriver driver = common.getFirefoxDriver();

		driver.get("http://google.com");
		
		System.out.println("Page Title = " + driver.getTitle());

	}

}
