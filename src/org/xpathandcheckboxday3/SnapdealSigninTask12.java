package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealSigninTask12 {

public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
			
	driver.get("https://www.snapdeal.com/");
	
	driver.manage().window().maximize();
	
	WebElement clkUserSigin = driver.findElement(By.className("accountInner"));
	clkUserSigin.click();
	
	WebElement ClkRegister = driver.findElement(By.className("newUserRegister"));
	ClkRegister.click();
	
	Thread.sleep(10000);
	WebElement txtMobileNo = driver.findElement(By.xpath("//input[@class=col-xs-24 clickOnceOnly"));
	txtMobileNo.sendKeys("7200290564");
	
	WebElement btnclick = driver.findElement(By.id("checkUser"));
	btnclick.click();
}
}
