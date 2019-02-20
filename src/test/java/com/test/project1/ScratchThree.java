package com.test.project1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ScratchListener.class)
public class ScratchThree {
	
	
	
	
	@Test
	public void intializeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		assertTrue(false);

	}
	

}
