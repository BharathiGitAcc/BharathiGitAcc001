package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIphoneTask1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement txtUsername = driver.findElement(By.id("twotabsearchtextbox"));
	txtUsername.sendKeys("iphone");
	
	WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	searchButton.click();
	
	}
}
