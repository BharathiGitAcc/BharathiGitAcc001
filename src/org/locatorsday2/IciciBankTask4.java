package org.locatorsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBankTask4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
			
		driver.manage().window().maximize();
		
		WebElement txtuserid = driver.findElement(By.id("DUMMY1"));
		txtuserid.sendKeys("Bharathi");
		
		WebElement arrowclk = driver.findElement(By.id("user-id-goahead"));
		arrowclk.click();
		
		WebElement txtPassword = driver.findElement(By.className("login-input-password"));
		txtPassword.sendKeys("Bharathi@123");
	}
}
