package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_18_CheckBxAndRadioBtn {
	
	
	@Test
	public void test_checkBox() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBoxOption1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkBoxOption1.click();
		boolean checkBoxOption1_status = checkBoxOption1.isSelected();
		System.out.println("----"+checkBoxOption1_status);
		
		
		Thread.sleep(3000);
		//driver.quit();	
	}
	
	
	
	@Test
	public void test_radioButton() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@value=\"radio1\"]"));
		radioButton1.click();
	
	}
	

}
