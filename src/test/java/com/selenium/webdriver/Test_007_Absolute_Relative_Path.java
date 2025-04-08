package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_007_Absolute_Relative_Path {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	
	@Test
	public void absRelativePathDemo() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/fieldset/label[1]/input")).click();// absolute xpath is long with html
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]"));// relative xpath with regular 
		
	}
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	

}
