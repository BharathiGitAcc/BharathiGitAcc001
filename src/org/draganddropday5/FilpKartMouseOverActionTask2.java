package org.draganddropday5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FilpKartMouseOverActionTask2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		
		WebElement btnMore = driver.findElement(By.className("exehdJ"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(btnMore).perform();
		
		WebElement btnSupport = driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"));
		btnSupport.click();
		
		WebElement txtBecome = driver.findElement(By.xpath("(//span[@class='hDTmm5'])[1]"));
		String c = txtBecome.getText();
		System.out.println(c);







}
}
