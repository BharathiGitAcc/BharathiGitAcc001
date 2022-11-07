package org.draganddropday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OmrBranchDragandDropTask1 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
	driver.manage().window().maximize();
	
	WebElement a = driver.findElement(By.id("credit2"));
	WebElement b = driver.findElement(By.id("java-class"));
	
	Actions actions = new Actions(driver);
	actions.dragAndDrop(a, b).perform();
	
	WebElement c = driver.findElement(By.id("fourth"));
	WebElement d = driver.findElement(By.id("java-interface"));
	
	Actions actions1 = new Actions(driver);
	actions.dragAndDrop(c, d).perform();
	
	WebElement e = driver.findElement(By.id("fifth"));
	WebElement f = driver.findElement(By.id("selenium-class"));
	
	Actions actions2 = new Actions(driver);
	actions.dragAndDrop(e, f).perform();
	
	WebElement h = driver.findElement(By.id("credit1"));
	WebElement i = driver.findElement(By.id("selenium-interface"));
	
	Actions actions3 = new Actions(driver);
	actions.dragAndDrop(h, i).perform();
	
	Thread.sleep(3000);
	WebElement txtParagragh = driver.findElement(By.className("button-green"));
	String k = txtParagragh.getText();
	System.out.println(k);
	
	
	
	
	
	

















}
}
