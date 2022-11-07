package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountsRegisterTask11 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	driver.manage().window().maximize();
	
	WebElement txtfirstname = driver.findElement(By.id("firstName"));
	txtfirstname.sendKeys("Bharathi");

	WebElement txtlastname = driver.findElement(By.id("lastName"));
	txtlastname.sendKeys("Yuvaraj");
	
	WebElement txtUsername = driver.findElement(By.id("username"));
	txtUsername.sendKeys("yuvarajbharathi468");
	
	WebElement txtPassword = driver.findElement(By.name("Passwd"));
	txtPassword.sendKeys("Pavi@1997");
	
	WebElement txtConfirmPassword = driver.findElement(By.name("ConfirmPasswd"));
	txtConfirmPassword.sendKeys("Pavi@1997");
	
	WebElement btnclick = driver.findElement(By.id("accountDetailsNext"));
	btnclick.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
