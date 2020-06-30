package com.capGemini.Timesheet.Timesheets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resource.CGTimeSheetBase;

public class Login{
	
public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='idToken1']")
	private static WebElement userName_field;
	
	@FindBy(xpath = "//input[@id='idToken2']")
	private WebElement MobilePassCode_field;
	
	@FindBy(xpath = "//input[@id='loginButton_0']")
	private static WebElement loginButton;
	
	public Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
	
	public static WebElement CG_ID() throws Exception
	{
		return userName_field;
	}
	
	public static WebElement login_Button()
	{
		return loginButton;
	}


}
