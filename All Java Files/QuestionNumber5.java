package com.bd.ExamAutomation;
/*
 * 1. Launch a new browser
2. Open URL https://www.daraz.com.bd/
3. Select Helmet option from the menu using Hover (Hints: Automotive & Motorbike -> Motorcycle Riding Gear-> Helmet)
4. Close the browser
*
After Completing, please upload your code on GitHub and provide a repository link in the Answer section.
 */

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class QuestionNumber5 extends BrowserEnvironmentSetting {
	static String Url ="https://www.daraz.com.bd/";
	
	@Test (priority = 0)
	public void EnterBrowser() throws InterruptedException{
			driver.get(Url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
				
	}
	@Test (priority = 1)
	public void QAnswer() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement AutomotiveMotorbike = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		action.moveToElement(AutomotiveMotorbike).perform();
		Thread.sleep(2000);
		WebElement MotorcycleRidingGear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		action.moveToElement(MotorcycleRidingGear).perform();
		Thread.sleep(2000);
		WebElement Helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		Helmet.click();
		Thread.sleep(4000);


		
	}
	
	

}
