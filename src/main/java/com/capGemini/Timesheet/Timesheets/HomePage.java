package com.capGemini.Timesheet.Timesheets;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	static WebDriver driver;

	
	@FindBy(xpath="//input[@id='loginButton_0']")
	 private static WebElement login_button;
	
	public HomePage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public static WebElement login()
	{
		return login_button;
	
		
		//driver.findElement(By.xpath("//input[@id='loginButton_0']")).click();
	}

			
		
}
