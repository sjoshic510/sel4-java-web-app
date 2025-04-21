package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_13_ToolTip_Text {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void test_demo() throws InterruptedException {

		driver.get("https://jqueryui.com/tooltip");
		driver.switchTo().frame(0);

		WebElement yourAgeBox = driver.findElement(By.xpath("//input[@id=\"age\"]"));
		String yourAgeBoxToolTipText = yourAgeBox.getDomAttribute("title");
		System.out.println(yourAgeBoxToolTipText);
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();
	}
}

