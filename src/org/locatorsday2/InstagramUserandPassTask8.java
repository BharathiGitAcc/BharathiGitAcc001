package org.locatorsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramUserandPassTask8 {


public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	WebElement txtUsername = driver.findElement(By.name("username"));
	txtUsername.sendKeys("Bharathi");
	
	WebElement txtPassword = driver.findElement(By.name("password"));
	txtPassword.sendKeys("Pavi@123");
}
}
