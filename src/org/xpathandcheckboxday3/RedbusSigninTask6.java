package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusSigninTask6 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.redbus.in/");

	driver.manage().window().maximize();
	
	WebElement SignIn = driver.findElement(By.id("sign-in-icon-down"));
	SignIn.click();
	
	WebElement SignIn1 = driver.findElement(By.id("signInLink"));
	SignIn1.click();
	
	WebElement txtMobile = driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number'])[2]"));
	txtMobile.sendKeys("7200290564");
	
	
	}
}
