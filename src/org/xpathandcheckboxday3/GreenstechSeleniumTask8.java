package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenstechSeleniumTask8 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("http://greenstech.in/selenium-course-content.html");

	driver.manage().window().maximize();
	
	WebElement btnClick = driver.findElement(By.xpath("//h2[contains(text(),'Model Resume')]"));
	btnClick.click();
	
	Thread.sleep(5000);
	WebElement btnclk = driver.findElement(By.xpath("//a[contains(text(),'Resume Model-1')]"));
	btnclk.click();

	}
}
