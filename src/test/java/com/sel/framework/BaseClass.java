package com.sel.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	protected WebDriver driver;
	
    @BeforeMethod
	public void setUp() {
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
    
    
    
    
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}