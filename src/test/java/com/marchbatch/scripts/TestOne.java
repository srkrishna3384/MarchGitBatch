package com.marchbatch.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOne {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully....");
		driver.manage().window().maximize();
		driver.get("https://www.rameshsoft.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Navigated to "+currentUrl);
		driver.close();
		System.out.println("Browser closed successfully....");
		System.out.println("Person 2 updates");
		
	}

}
