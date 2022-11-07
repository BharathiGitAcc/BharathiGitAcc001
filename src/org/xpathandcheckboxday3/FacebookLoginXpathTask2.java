package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpathTask2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
		txtUsername.sendKeys("Bharathi Yuvaraj");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
		txtPassword.sendKeys("Bharathi@123");

		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnlogin.click();
		
		
	
	
	
	
	
}

}
