package com.bd.ExamAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserEnvironmentSetting {
WebDriver driver;
	
	@BeforeSuite
	public void Start() {
		String browser = System.getProperty("browser","chrome");
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}
		else {
			WebDriverManager.edgedriver().setup();
		}
	}
	
	@AfterSuite
	public void stop() {
		driver.quit();
	}


}
