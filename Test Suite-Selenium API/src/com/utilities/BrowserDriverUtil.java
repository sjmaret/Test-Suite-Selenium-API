package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriverUtil {

	public static ChromeDriver chromeDriver;
	public static FirefoxDriver firefoxDriver;

	public static ChromeDriver getChromeDriver() {
		// invoke browser's driver
		System.setProperty("webdriver.chrome.driver", "/Users/shannon/Documents/browser_drivers/chromedriver");

		// create Driver object
		chromeDriver = new ChromeDriver();

		return chromeDriver;
	}

	public static FirefoxDriver getFirefoxDriver() {
		// invoke browser's driver
		System.setProperty("webdriver.gecko.driver", "/Users/shannon/Documents/browser_drivers/geckodriver");

		// create Driver object
		firefoxDriver = new FirefoxDriver();

		return firefoxDriver;
	}

}
