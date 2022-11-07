package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripTask7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.cleartrip.com/trains");

		driver.manage().window().maximize();
		
		WebElement txtfromstation = driver.findElement(By.id("from_station"));
		txtfromstation.sendKeys("Chennai");
	
		WebElement txttostation = driver.findElement(By.id("to_station"));
		txttostation.sendKeys("Thirchy");
		
		WebElement btnsearch = driver.findElement(By.id("trainFormButton"));
		btnsearch.click();
	
	
		
		
		
		
		
		
		
		
		
	}		
}
