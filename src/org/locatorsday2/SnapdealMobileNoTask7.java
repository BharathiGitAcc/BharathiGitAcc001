package org.locatorsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealMobileNoTask7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
	
	WebElement txtMobileNo = driver.findElement(By.id("userName"));
	txtMobileNo.sendKeys("7200290564");
	
	
	
	}
}
