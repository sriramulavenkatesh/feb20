package com.test.project1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.AmazonHome2;
import resources.Base3;

public class AmazonTest1 extends Base3 {

	@Test
	public void amtest() throws IOException {

		driver = intializedriver();
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		AmazonHome2 amtest = new AmazonHome2(driver);
		Actions action = new Actions(driver);
		WebElement helloButton = amtest.HelloButton();
		action.moveToElement(helloButton).perform();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement yourAccount = amtest.YourAccount();
		yourAccount = wait.until(ExpectedConditions.visibilityOf(yourAccount));
		action.moveToElement(yourAccount).click().build().perform();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement primeButton = amtest.AmazonPrime();
		String primetext = primeButton.getText();
		Assert.assertEquals(primetext, "Prime", "Text mismatch");
		System.out.println("Text matched");

	}

	@AfterTest
	public void teardown() {

		driver.quit();
		driver = null;
	}

}
