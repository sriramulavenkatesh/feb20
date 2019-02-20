package com.test.project1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.AmazonHome;
import resources.Base2;

public class Test2 extends Base2 {
	@BeforeTest
	public void launch() throws IOException {
		driver = intializedriver();

	}

	@Test
	public void amazonAssertTest() throws IOException {

		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		AmazonHome amtest = new AmazonHome(driver);
		WebElement helloButton = amtest.HelloButton();
		WebElement yourAccount = amtest.YourAccount();
		Actions action = new Actions(driver);
		action.moveToElement(helloButton).perform();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		yourAccount = wait.until(ExpectedConditions.visibilityOf(yourAccount));
		action.moveToElement(yourAccount).click().build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement primeButton = amtest.PrimeButton();
		String primtext = primeButton.getText();
		Assert.assertTrue(primeButton.isDisplayed());
		System.out.println("Prime elememt found and text= " + primtext);
		driver.close();

	}

	public void teardown() {

		driver.close();
	}

}
