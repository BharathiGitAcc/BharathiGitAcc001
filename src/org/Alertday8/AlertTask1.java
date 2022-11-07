package org.Alertday8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement lnk = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		lnk.click();
		
		WebElement btnlnk = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		btnlnk.click();
		
		Alert txt = (Alert) driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Bharathi");
		String a = driver.switchTo().alert().getText();
		System.out.println("Bharathi");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
}
}
