package com.marchbatch.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTwo {
	@Test
	public void demo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully....");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Navigated to "+currentUrl);
		driver.close();
		System.out.println("Browser closed successfully....");
	}
}
