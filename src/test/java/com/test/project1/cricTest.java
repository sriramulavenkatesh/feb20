package com.test.project1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base2;

public class cricTest extends Base2 {
	
	@Test
	public void test1() throws IOException {
		int sum=0;
		driver = intializedriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21206/pak-vs-aus-2nd-test-australia-v-pakistan-in-uae-2018");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		//WebElement table = driver.findElement(By.cssSelector("div[id='innings_1'] div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int rowcount = driver.findElements(By.cssSelector("#innings_1 div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int i=0;i<rowcount-2;i++) {
		
	 //String scoreItem = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	 String scoreItem = driver.findElements(By.cssSelector("#innings_1 div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();		
	 int scoreItemValue = Integer.parseInt(scoreItem);
	 sum = sum+scoreItemValue;
	 
		}
		
		String extrasText = driver.findElement(By.xpath("//div[@id='innings_1']//*[text()='Extras']/following::div[1]")).getText();
		int extrasValue = Integer.parseInt(extrasText);
		int ActualTotal = sum+extrasValue;
		String expectedTotal = driver.findElement(By.xpath("//div[@id='innings_1']//*[text()='Total']/following::div[1]")).getText();
		int expectedTotalValue = Integer.parseInt(expectedTotal);
		Assert.assertEquals(expectedTotalValue, ActualTotal, "Total mismatched");
		System.out.println("Totals are matched "+expectedTotalValue+" "+ActualTotal);
		
	}

}
