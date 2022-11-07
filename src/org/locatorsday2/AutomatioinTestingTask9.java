package org.locatorsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatioinTestingTask9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTraining\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html\r\n");
		
		driver.manage().window().maximize();
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		txtfirstname.sendKeys("Bharathi");
		
		WebElement txtLastname = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		txtLastname.sendKeys("Y");
		
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAddress.sendKeys("Chennai");
	
		WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		txtEmail.sendKeys("bharathimurugesan97@gmail.com");
		
		WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		txtPhone.sendKeys("7200290564");
		
		WebElement txtfirst = driver.findElement(By.id("firstpassword"));
		txtfirst.sendKeys("03031997");
		
		WebElement txtSecond = driver.findElement(By.id("secondpassword"));
		txtSecond.sendKeys("04122022");
		
	}
}
