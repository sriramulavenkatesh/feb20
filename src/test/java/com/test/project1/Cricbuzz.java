package com.test.project1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base2;

public class Cricbuzz extends Base2 {
	
@Test
	public void cricTest() throws IOException {

		int sum = 0;
		driver = intializedriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/21206/pak-vs-aus-2nd-test-australia-v-pakistan-in-uae-2018");
		//driver.manage().window().maximize();
		WebElement table = driver.findElement(By.cssSelector("div[id='innings_1'] div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		for (int i = 0; i < count-2; i++) {
			
					//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String indscore = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int indscoreval = Integer.parseInt(indscore);
			sum = sum + indscoreval;
			//System.out.println(sum);

		}
		String extraaText = driver.findElement(By.xpath("//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right'][contains(text(),'21')]")).getText();
		int extrasVal = Integer.parseInt(extraaText);
		int extractedTot = sum+extrasVal;
		//System.out.println(extractedTot);
		String ActualTot = driver.findElement(By.cssSelector("div[id='innings_1'] div[class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
		int ActualTotVal = Integer.parseInt(ActualTot);
		Assert.assertEquals(ActualTotVal, extractedTot, "Total mismatch");
		System.out.println("Total matches "+ActualTotVal+" "+extractedTot);
		

	}
   public void cricbuz() {
	   
	   System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20788/nz-vs-ind-1st-t20i-india-tour-of-new-zealand-2019");
		WebElement ExtrasEle=driver.findElement(By.xpath("//*[@id='innings_1']//div[contains(text(),'Extra')]/following::div[1]"));
		String extratext= ExtrasEle.getText();
		Integer extraVal=Integer.parseInt(extratext);
		List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='innings_1']/div[1]//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]"));
		int total=0;
		for(int i=0;i<allElements.size()-2;i++) {
			
			String eleValText = allElements.get(i).getText();
			Integer eleValue = Integer.parseInt(eleValText);
			total=total+eleValue;
			
		}		
		
		System.out.println(total+extraVal);
   }

}
