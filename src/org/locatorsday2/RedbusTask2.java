package org.locatorsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTask2 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.redbus.in/");

	WebElement txtfrom = driver.findElement(By.id("src"));
	txtfrom.sendKeys("Chennai");

	WebElement txtto = driver.findElement(By.id("dest"));
	txtto.sendKeys("Kanchipuram");
	
	}
}
