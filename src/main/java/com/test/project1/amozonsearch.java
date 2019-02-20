package com.test.project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.AmazonHome;
import resources.Base2;

public class amozonsearch extends Base2 {
	@Test
	public void amtest() {
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		AmazonHome amasearch = new AmazonHome(driver);
		WebElement amsearchbutton = amasearch.AmazonSearch();
		amsearchbutton.sendKeys("mobile");

	}

}
