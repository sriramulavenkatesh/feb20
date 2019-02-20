package com.test.feb;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmTestOne extends Base {
	
	@Test
	public void testOne() {
		
		WebDriver driver =  intializeBrowser();
		driver.get("https://www.amazon.in/");
		//Assert.assertTrue(false);
		AmHome amTest = new AmHome(driver);
		amTest.searchBox().sendKeys("mobile");
		amTest.searchSubmit().click();
		
		
		
		
		
		
		
	}

}
