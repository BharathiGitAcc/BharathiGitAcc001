package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinOrderNumberTask1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();

		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("BharathiYuvaraj");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("pavi@yuvi");
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();	
		
		WebElement dropdown = driver.findElement(By.id("location"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("London");
		
		WebElement dd = driver.findElement(By.id("hotels"));
		Select s1 = new Select(dd);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement dd1 = driver.findElement(By.id("room_type"));
		Select s2 = new Select(dd1);
		s2.selectByValue("Double");
		
		WebElement btnsubmit = driver.findElement(By.id("Submit"));
		btnsubmit.click();
		
		WebElement btnclk = driver.findElement(By.id("radiobutton_0"));
		btnclk.click();
		
		WebElement btnclick = driver.findElement(By.id("continue"));
		btnclick.click();
		
		WebElement txtFirstname = driver.findElement(By.id("first_name"));
		txtFirstname.sendKeys("Bharathi");
		
		WebElement txtLastname = driver.findElement(By.id("last_name"));
		txtLastname.sendKeys("Yuvaraj");
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("No:111, 10th Street,Chennai-600097");

		WebElement txtCredit = driver.findElement(By.id("cc_num"));
		txtCredit.sendKeys("1234567890123456");
		
		WebElement dd2 = driver.findElement(By.id("cc_type"));
		Select s3 = new Select(dd2);
		s3.selectByValue("VISA");
		
		WebElement dd3 = driver.findElement(By.id("cc_exp_month"));
		Select s4 = new Select(dd3);
		s4.selectByValue("1");

		WebElement dd4 = driver.findElement(By.id("cc_exp_year"));
		Select s5 = new Select(dd4);
		s5.selectByValue("2022");
		
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		txtCvv.sendKeys("345");
		
		WebElement btnBooking = driver.findElement(By.id("book_now"));
		btnBooking.click();

		Thread.sleep(30000);
		WebElement txtOrderNo = driver.findElement(By.id("order_no"));
		String attribute = txtOrderNo.getAttribute("value");
		System.out.println(attribute);
	}
}
