package com.test.feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmHome {
	
	WebDriver driver;
	AmHome(WebDriver driver){
		
		this.driver=driver;
	}
	
	public WebElement searchBox() {
		
		return driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		
	}
    public WebElement searchSubmit() {
		
		return driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
		
	}
	
	
	

}
