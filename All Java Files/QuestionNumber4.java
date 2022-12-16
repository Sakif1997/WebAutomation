package com.bd.ExamAutomation;
/*
 * Write a test script for the following scenario
1. Launch a new browser
2. Open URL https://itera-qa.azurewebsites.net/home/automation
3. Select the Gender(Use ID locator)
4. Check the Check Box "Tuesday" and "Friday" for the category ‘Which days of the week are best to start something new?'(Use ID locator)
5. Close the browser
*
After Completing, please upload your code on GitHub and provide a repository link in the Answer section.
 */

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class QuestionNumber4 extends BrowserEnvironmentSetting {
	static String Url ="https://the-internet.herokuapp.com/javascript_alerts";
	
	@Test
	public void EnterBrowser() throws InterruptedException{
			driver.get(Url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
				
	}
	@Test
	public void Q4Answer() throws InterruptedException{
		WebElement JsAlert= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		JsAlert.click();
		Thread.sleep(2000);
		//to click ok in alert 
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement JsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		JsConfirm.click();
		Thread.sleep(2000);		
		driver.switchTo().alert().accept();		
		WebElement JsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		JsPrompt.click();
		Thread.sleep(2000);		
		driver.switchTo().alert().sendKeys("My name is sakif");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//
		WebElement Resulttxt = driver.findElement(By.xpath("//p[@id='result']"));
		String txt= Resulttxt.getText();
		Assert.assertEquals(txt, "My name is sakif");
		Thread.sleep(2000);		
	}

}
