package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsqaTask4 {

public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		
		driver.manage().window().maximize();

		WebElement txtfirstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		txtfirstName.sendKeys("Bharathi");
		
		WebElement txtlastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		txtlastName.sendKeys("Yuvaraj");
		
		WebElement txteMail = driver.findElement(By.xpath("//input[@id='email']"));
		txteMail.sendKeys("bharathimurugesan97@gmail.com");
		
		WebElement txtphone = driver.findElement(By.xpath("//input[@id='mobile']"));
		txtphone.sendKeys("7200290564");	
}
}
