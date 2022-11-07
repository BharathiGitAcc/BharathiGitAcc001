package org.draganddropday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuruTaskRobot {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
	
		WebElement a = driver.findElement(By.id("credit2"));
	
		WebElement b = driver.findElement(By.id("bank"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(a, b).perform();
		System.out.println("drag and drop was done on bank ");
		
		WebElement c =driver.findElement(By.xpath("//*[@id='fourth']/a"));					
	        
	    //Element(DEBIT SIDE) on which need to drop.		
	    WebElement d =driver.findElement(By.xpath("//*[@id='amt7']/li"));	
	
		Actions drag = new Actions(driver);
		actions.dragAndDrop(c, d).perform();
		System.out.println("drag and drop was done on amount");
		
		WebElement x = driver.findElement(By.id("credit1"));
		
		WebElement y = driver.findElement(By.id("loan"));
		
		Actions dra = new Actions(driver);
		actions.dragAndDrop(x, y).perform();
		System.out.println("drag and drop was done on sales");
	
		WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
        
        //Element(CREDIT SIDE) on which need to drop.		
     	WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));
		
     	Actions dr = new Actions(driver);
		actions.dragAndDrop(From4, To4).perform();
		System.out.println("drag and drop was done on amount");	
}	

}
