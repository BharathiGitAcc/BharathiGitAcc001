package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensSeleniumCourseTask5 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();

		WebElement IntrwQues = driver.findElement(By.id("heading20"));
		IntrwQues.click();
		
		Thread.sleep(5000);
		WebElement c = driver.findElement(By.xpath("//a[@title='Interview Questions'])"));
		c.click();
		
		
		
		
		
		
		
		
		
}

}
