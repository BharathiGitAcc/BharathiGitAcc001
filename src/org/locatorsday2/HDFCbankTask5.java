package org.locatorsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCbankTask5 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://netbanking.hdfcbank.com/");
	
	driver.manage().window().maximize();

	WebElement txtUserID = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	txtUserID.sendKeys("03031997");
	}
}
