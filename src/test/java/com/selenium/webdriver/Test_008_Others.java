package com.selenium.webdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_008_Others {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	@Test
	public void test_demo() throws InterruptedException {
		driver.manage().deleteAllCookies();

		System.out.println("current URL = " + driver.getCurrentUrl());
		System.out.println("current page title = " + driver.getTitle());
		System.out.println("current windows number(handle) = " + driver.getWindowHandle());

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();

	}

}
