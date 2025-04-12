package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Test_12_ChromeOptions {

	@Test
	public void test_browserSpeed() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		// options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

		WebDriver driver = new ChromeDriver(options);
		driver.get("");

	}

	@Test
	public void test_allArguments() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();

		// Set various options
		options.addArguments("--start-maximized");
//		options.addArguments("--window-size=1920,1080");  // Set window size	
//		options.addArguments("--headless");  // Run in headless mode (no UI)
		options.addArguments("--incognito"); // Open in incognito mode

		// NOT TESTED YET
//		options.addArguments("--disable-gpu");  // Disable GPU hardware acceleration	
//		options.addArguments("--disable-notifications");  // Disable browser notifications		
//		options.addArguments("--disable-popup-blocking");  // Disable pop-up blocking
//		options.addArguments("--disable-infobars");  // Disable "Chrome is being controlled" info bar
//		options.addArguments("--remote-debugging-port=9222");  // Enable remote debugging

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
