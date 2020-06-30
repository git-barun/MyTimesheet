package com.capGemini.Timesheet.Timesheets;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import resource.CGTimeSheetBase;

public class LoginTest extends CGTimeSheetBase {
	HomePage p;
	Login l;
	TalentPage t;
	IndianAppPortal ip;

	@BeforeTest
	void setUp() throws IOException {
		driver = browserLaunch();
		p = new HomePage(driver);
		l = new Login(driver);
		t = new TalentPage(driver);
		ip =new IndianAppPortal(driver);
		driver.get(prop.getProperty("Cg_URL"));

	}

	
	  @AfterTest void tearDown() 
	  { 
		  driver.close(); 
		  driver.quit();
	  }
	 

	@Test
	void login() throws Throwable {

		p.login().click();
		l.CG_ID().sendKeys(prop.getProperty("UserName_Barun"));
		Thread.sleep(15000);
		l.login_Button().click();
		t.clickTimeCardLink().click();
		String parWindow = driver.getWindowHandle();
		SwitchWindowHandles(parWindow);
		moveTo(ip.finance());
		moveTo(ip.timecard_dropdown());
		moveTo(ip.timecardSummary_dropdown());
		ip.timecardSummary_dropdown().click();
	}

}
