package com.test.project1;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base2;
import resources.ExcelUtility;

public class DemoSiteTest extends Base2 {

	@Test
	public void test1() throws IOException {
		
		driver = intializedriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		int rowcount = driver.findElements(By.cssSelector("[class='ui-grid-cell ng-scope ui-grid-coluiGrid-0008'] div:nth-child(1)")).size();
		for(int i=0;i<rowcount;i++) {
		String ExtractedText = driver.findElements(By.cssSelector("[class='ui-grid-cell ng-scope ui-grid-coluiGrid-0008'] div:nth-child(1)")).get(i).getText();
		ArrayList<String> ExtractedLIst = new ArrayList<String>();
		ExtractedLIst.add(ExtractedText);
		System.out.println(ExtractedLIst);
		}
		
		
		
		}
	}

	
	
			

			

			

	



