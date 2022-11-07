package org.browserlaunchday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpKartTask3 {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://www.flipkart.com/");
		
	// print title
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
