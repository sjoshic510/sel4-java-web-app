package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class Test_13_ToolTip_Text {
	
    	@Test
	public void test_demo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip");
		driver.switchTo().frame(0);
		
		WebElement yourAgeBox = driver.findElement(By.xpath("//input[@id=\"age\"]"));
		String  yourAgeBoxToolTipText =  yourAgeBox.getDomAttribute("title");
		System.out.println(yourAgeBoxToolTipText);
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
	}

}
