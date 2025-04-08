package com.selenium.webdriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_20_EnterDate {

	@Test
	public void dateEnter() {

		// http://demo.automationtesting.in/Datepicker.html

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Datepicker.html");

		
		driver.findElement(By.xpath("//input[@id=\"datepicker2\"]")).sendKeys(getCurrentDate());

	}

	public static String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String curDate =sdf.format(new Date());//03/30/2025
		return curDate;
	
	}

}
