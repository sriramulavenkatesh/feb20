package com.test.feb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	 public static WebDriver driver;
	
	public WebDriver intializeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		return driver;

	}
	
	public void getScreenshot(String res) throws IOException {
		
		File imgSrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(imgSrc, new File("D:\\Automation Stuff\\Selenium-Screenshots\\"+res+".png"));
		
		
		
	}

	

}
