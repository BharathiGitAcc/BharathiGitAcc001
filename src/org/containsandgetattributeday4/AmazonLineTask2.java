package org.containsandgetattributeday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLineTask2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement txtPrint = driver.findElement(By.xpath("//a[contains(text(),'Conditions')]"));
		String a = txtPrint.getText();
		System.out.println(a);

	
}
}
