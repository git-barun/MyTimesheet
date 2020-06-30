package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CGTimeSheetBase {

	public Properties prop;
	public WebDriver driver;

	// ---------- Read value from Properties File ----------------------
	public Properties propFile() {
		FileInputStream fis;
		try {
			prop = new Properties();
			fis = new FileInputStream(
					"C:\\Users\\91979\\workspace\\Timesheets\\src\\main\\java\\resource\\Data.properties");

			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	// ---------- Launch Browser ----------------------

	public WebDriver browserLaunch() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	// ----------------- Actions Method------

	public void  moveTo(WebElement option) {
		Actions ac = new Actions(driver);
		ac.moveToElement(option).build().perform();		
		
	}
	// ----------------- window Handles------

	public void SwitchWindowHandles(String parentWH) {
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String childHandle = it.next();
			if(childHandle.equalsIgnoreCase(parentWH))
			{
				
				String switchTo= it.next();
				driver.switchTo().window(switchTo);
				
			}	
			else 
			{
				driver.switchTo().window(childHandle);
			}

		}
		
	}

}
