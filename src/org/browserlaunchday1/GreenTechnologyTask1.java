package org.browserlaunchday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechnologyTask1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://www.greenstechnologys.com/");
	
	
	
	
	
	}

}
