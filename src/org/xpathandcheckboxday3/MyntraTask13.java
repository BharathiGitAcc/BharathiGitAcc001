package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTask13 {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
	driver.manage().window().maximize();
		
	Thread.sleep(3000);
	WebElement txtsignup = driver.findElement(By.xpath("//input[@class=\"form-control mobileNumberInput\"]"));
	txtsignup.sendKeys("7200290564");
		
	WebElement txtname = driver.findElement(By.className("submitBottomOption"));
	txtname.click();
	
	System.out.println("sign up done");	
		
	}
}
