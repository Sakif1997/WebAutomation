# WebAutomation

# Some Example of WebAutomation

A brief description of what this project does and who it's for


## NumberOne
1. Launch a new browser
2. Open URL https://itera-qa.azurewebsites.net/home/automation
3. Type Name, Mobile number, Email address, Password, Address (Use ID locator )
4. Click on Submit button (Use Name locator)
5. Close the browser
*
After Completing, please upload your code on GitHub and provide a repository link in the Answer section

 ```ruby
package com.bd.ExamAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.testng.annotations.Test;

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
```

## Number2
1. Launch a new browser
2. Open URL https://itera-qa.azurewebsites.net/home/automation
3. Select the "Norway" from for category "Where do you plan to travel this year?" (Use select method.)
4. Close the browser
 ```ruby
package com.bd.ExamAutomation;


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
 ``` 

## Number 3
package com.bd.ExamAutomation;
 * Write a test script for the following scenario
1. Launch a new browser
2. Open URL https://itera-qa.azurewebsites.net/home/automation
3. Select the Gender(Use ID locator)
4. Check the Check Box "Tuesday" and "Friday" for the category ‘Which days of the week are best to start something new?'(Use ID locator)
5. Close the browser

 ```ruby
package com.bd.ExamAutomation;

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

 ```

## Number 4

* Write a test script for the following scenario
1. Launch a new browser
2. Open URL https://itera-qa.azurewebsites.net/home/automation
3. Select the Gender(Use ID locator)
4. Check the Check Box "Tuesday" and "Friday" for the category ‘Which days of the week are best to start something new?'(Use ID locator)
5. Close the browser
*
After Completing, please upload your code on GitHub and provide a repository link in the Answer section.
 
 ```ruby
 package com.bd.ExamAutomation;

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

 ```ruby

## Number 5

* 1. Launch a new browser
2. Open URL https://www.daraz.com.bd/
3. Select Helmet option from the menu using Hover (Hints: Automotive & Motorbike -> Motorcycle Riding Gear-> Helmet)
4. Close the browser
*
After Completing, please upload your code on GitHub and provide a repository link in the Answer section.
 
 ```ruby

package com.bd.ExamAutomation;

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
 ```
