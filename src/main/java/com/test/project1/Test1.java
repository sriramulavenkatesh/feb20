package com.test.project1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.AmazonHome;
import resources.base;

public class Test1 extends base {
	
	@Test
	public void amzontest() throws IOException {

		driver = intializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		AmazonHome amtest = new AmazonHome(driver);
		Actions action = new Actions(driver);
		WebElement hellobutton = amtest.HelloButton();
		WebElement youracc = amtest.YourAccount();
		action.moveToElement(hellobutton).perform();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		youracc = wait.until(ExpectedConditions.visibilityOf(youracc));
		action.moveToElement(youracc).click().build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String primetext = amtest.PrimeButton().getText();
		Assert.assertEquals(primetext, "Prime", "Text not matched");
		System.out.println("Text matched");
		driver.close();

	}
	

}
