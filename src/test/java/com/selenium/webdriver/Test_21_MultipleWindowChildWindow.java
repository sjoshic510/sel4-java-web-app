package com.selenium.webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_21_MultipleWindowChildWindow {
	
	@Test
	public void testPractice() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent Window Handle = "+parentWindowHandle);
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click(); // will click & open new window
		Thread.sleep(4000);
		
		Set<String> handles = driver.getWindowHandles(); // will give 2 parent and child window handle
		String childWindowHandle = "";
		
		for(String handle :handles) {
			
			if( ! handle.equalsIgnoreCase(parentWindowHandle) ) {  //[ !=  --> not equal to ]
				childWindowHandle= handle;
				System.out.println("child window handle = "+handle);
				break;
			}	
		}

		driver.switchTo().window(childWindowHandle);
		
		String allOurCourse = driver.findElement(By.xpath("//a[normalize-space()='Access all our Courses']"))
		.getText();
		
		System.out.println("==="+allOurCourse);
		
		Thread.sleep(3000);
		driver.quit();
}
}