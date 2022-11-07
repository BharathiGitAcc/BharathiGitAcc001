package org.locatorsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelTask10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("Bharathi");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("pavi@123");
		
		
	}
}
