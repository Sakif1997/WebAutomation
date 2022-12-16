package com.bd.ExamAutomation;
/*
 * Write a test script for the following scenario
1. Launch a new browser
2. Open URL https://itera-qa.azurewebsites.net/home/automation
3. Select the Gender(Use ID locator)
4. Check the Check Box "Tuesday" and "Friday" for the category ‘Which days of the week are best to start something new?'(Use ID locator)
5. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class QuestionNumber3 extends BrowserEnvironmentSetting {
static String Url ="https://itera-qa.azurewebsites.net/home/automation";
	
	@Test (priority = 0)
	public void EnterBrowser() throws InterruptedException{
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	@Test (priority = 1)
	public void Q2Answer() throws InterruptedException{
		//By using ID locator
		WebElement Male = driver.findElement(By.id("male"));
		Male.click();
		Thread.sleep(2000);
		WebElement Female = driver.findElement(By.id("female"));
		Female.click();
		Thread.sleep(2000);
		
		//By using Id locator
		WebElement Tuesday = driver.findElement(By.id("tuesday"));
		Tuesday.click();
		Thread.sleep(2000);
		WebElement Friday = driver.findElement(By.id("friday"));
		Friday.click();
		Thread.sleep(2000);
		
	}

}
