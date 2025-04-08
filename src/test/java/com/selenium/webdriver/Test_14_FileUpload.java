package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_14_FileUpload {
	
	   @Test
       public void test_demo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		
		driver.findElement(By.xpath("//input[@id=\"input-4\"]")).sendKeys("C:\\Users\\Bijaya Chhetri\\eclipse-workspace-new\\testmvn_project\\Include\\Upload file.pdf");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
	}

}
