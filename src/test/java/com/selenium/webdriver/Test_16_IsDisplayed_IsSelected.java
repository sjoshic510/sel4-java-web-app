package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_16_IsDisplayed_IsSelected {
	
	@Test
	public void test_isDisplayed() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement hideShow_txtbx = driver.findElement(By.xpath("//input[@id=\"displayed-text\"]"));
		
		boolean hideShow_txtbx_status = hideShow_txtbx.isDisplayed();
		System.out.println("--1--"+hideShow_txtbx_status);
		
		WebElement hideButton = driver.findElement(By.xpath("//input[@id=\'hide-textbox\']"));
		hideButton.click();
		boolean hideShow_txtbx_status1 = hideShow_txtbx.isDisplayed();
		System.out.println("--2--"+hideShow_txtbx_status1);

}
	
	public void test_isSelected() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBoxOption1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkBoxOption1.click();
		boolean checkBoxOption1_status = checkBoxOption1.isSelected();
		System.out.println("----"+checkBoxOption1_status);
		
		
		Thread.sleep(3000);
		WebElement checkBoxOption2 = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		checkBoxOption2.click();
		boolean checkBoxOption2_status = checkBoxOption2.isSelected();
		System.out.println("----"+checkBoxOption2_status);
		
		Thread.sleep(3000);
		//driver.quit();	
		
	}
	
	
	
	
	
}
