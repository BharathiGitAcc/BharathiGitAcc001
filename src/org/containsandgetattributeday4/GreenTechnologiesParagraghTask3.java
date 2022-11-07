package org.containsandgetattributeday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechnologiesParagraghTask3 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		
		WebElement btnclick = driver.findElement(By.id("overview-tab"));
		btnclick.click();
		System.out.println("overview was clicked successfully");
		
		Thread.sleep(5000);
		
		WebElement txtPrint = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Sel')]"));
		String text = txtPrint.getText();
		System.out.println(text);
		
		System.out.println("paragragh was Printed");	
	}
}
