package com.bd.ExamAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.testng.annotations.Test;

/*Write a test script for the following scenario
1. Launch a new browser
2. Open URL https://itera-qa.azurewebsites.net/home/automation
3. Type Name, Mobile number, Email address, Password, Address (Use ID locator )
4. Click on Submit button (Use Name locator)
5. Close the browser
*/
public class QuestionNumber1 extends BrowserEnvironmentSetting {
	static String Url ="https://itera-qa.azurewebsites.net/home/automation";
	
	@Test (priority = 0)
	public void EnterBrowser() throws InterruptedException{
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	@Test (priority = 1)
	public void Textarea() throws InterruptedException{
		
		//by using id locator(by.id)
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Sakif");
		Thread.sleep(2000);
		WebElement MobileNumber = driver.findElement(By.id("phone"));
		MobileNumber.sendKeys("01535421765");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("Sakifrockz@gmail.com");
		Thread.sleep(2000);
		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("3982");
		Thread.sleep(2000);
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("Dhanmondi");
		Thread.sleep(2000);
		
		
		//by using name locator(By.name)
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);

		
	}
	

}
