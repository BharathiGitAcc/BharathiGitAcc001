package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTask9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		WebElement btnlogin = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		btnlogin.click();
		
		WebElement txtUsername = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtUsername.sendKeys("Bharathi Yuvaraj");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtPassword.sendKeys("Bharathi@123");

		WebElement btnsumbit = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btnsumbit.click();
		
	
	
	
	}
}
