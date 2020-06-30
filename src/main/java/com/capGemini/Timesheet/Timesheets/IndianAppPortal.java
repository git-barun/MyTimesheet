package com.capGemini.Timesheet.Timesheets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndianAppPortal {
	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'FINANCE')]")
	private WebElement finance_tab;
	
	@FindBy(xpath="//ul[@id='Menu_CAP:submenu:63']/li/following-sibling::li/following-sibling::li/following-sibling::li/a[contains(text(),'Timecard')]")
	private WebElement timecard_Option;
	
	@FindBy(xpath="//a[contains(text(),'Timecard Summary')]")
	private WebElement timeCard_Summary;
	
	public IndianAppPortal(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement finance()
	{
		return finance_tab;
	}
	
	public WebElement timecard_dropdown()
	{
		return timecard_Option;				
	}
	
	public WebElement timecardSummary_dropdown()
	{
		return timeCard_Summary;			
	}
	
}
