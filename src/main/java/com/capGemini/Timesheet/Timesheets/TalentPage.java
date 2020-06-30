package com.capGemini.Timesheet.Timesheets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resource.CGTimeSheetBase;

public class TalentPage{
	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Time Card Application')]")
	private static WebElement timeCard_Link;
	
	@FindBy(xpath= "//a[@id='link_TimeCard']")
	private static WebElement openTimeCard;
	
	public TalentPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebElement clickTimeCardLink(){
		return timeCard_Link;
	}
	
	public static WebElement clickTimeCard_TalentPage(){
		return openTimeCard;
	}

}
