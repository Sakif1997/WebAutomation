package com.bd.ExamAutomation;
/*
1. Launch a new browser
2. Open URL https://itera-qa.azurewebsites.net/home/automation
3. Select the "Norway" from for category "Where do you plan to travel this year?" (Use select method.)
4. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class QuestionNumber2 extends BrowserEnvironmentSetting {
	
	static String Url ="https://itera-qa.azurewebsites.net/home/automation";
			
	@Test (priority = 0)
	public void EnterBrowser() throws InterruptedException{
			driver.get(Url);
			driver.manage().window().maximize();
			Thread.sleep(2000);
				
	}
	@Test (priority = 1)
	public void QAnswer() throws InterruptedException{
		WebElement travelcountry = driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select select =new Select(travelcountry);
		Thread.sleep(2000);
		select.selectByValue("1");
		Thread.sleep(4000);
	   }
}
