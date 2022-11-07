package org.locatorsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTask1 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");

	WebElement txtPhonenumber = driver.findElement(By.id("email"));
	txtPhonenumber.sendKeys("Bharathi");
		
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Bharathi@123");
	
		
	}	

}
