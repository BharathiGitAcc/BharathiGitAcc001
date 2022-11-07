package org.xpathandcheckboxday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggySignupTask14 {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://www.swiggy.com/") ; 
	driver.manage().window().maximize();

	Thread.sleep(3000) ;
	WebElement txtsignup = driver.findElement(By.className("r2iyh")) ;
	txtsignup.click();

	Thread.sleep(5000) ;
	WebElement txtmobile = driver.findElement(By.id("mobile")) ;
	txtmobile.sendKeys("8072930346") ;
	
	WebElement txtname = driver.findElement(By.id("name")) ;
	txtname.sendKeys("Bharathi") ;
	
	WebElement txtemail = driver.findElement(By.id("email")) ;
	txtemail.sendKeys("bharathimurugesan0412@gmail.com") ;
	
	WebElement txtpass = driver.findElement(By.id("password")) ;
	txtpass.sendKeys("Bharathi@123") ;
	
	WebElement btnclick = driver.findElement(By.className("a-ayg")) ;
	btnclick.click();
	
	System.out.println("signup was done") ;

	}
}
