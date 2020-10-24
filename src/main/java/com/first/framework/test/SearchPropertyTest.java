package com.first.framework.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.first.framework.base.Base;
import com.first.framework.page.SearchProperty;



/**
 * TODO This Test Class calls method from page class.
 *
 * @author Pooja.
 *         Created 21-Oct-2020.
 */
public class SearchPropertyTest {

/**
 * TODO Declaring driver.
 */
public static WebDriver driver;
	
	/**
	 * TODO This method navigates to the site.
	 * @param browser 
	 *
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	@BeforeTest
	@Parameters("browser")
	public void openUrl(String browser) throws InterruptedException, IOException {
		if(browser.equalsIgnoreCase("firefox")) {
			Base.openURL("firefox");
		}else if(browser.equalsIgnoreCase("chrome")) {
			Base.openURL("chrome");
		}else if(browser.equalsIgnoreCase("IE")) {
			Base.openURL("IE");
		}
	
		Base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	/**
	 * TODO This contains method for selecting property.
	 *
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test(priority=1)
	public void abc() throws IOException, InterruptedException
{
		Base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SearchProperty.selectProperty();
		}
	
	/**
	 * TODO This method calls method for selecting bhk types.
	 *
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test(priority=2)
	public void bhk() throws IOException, InterruptedException {
		SearchProperty.selectBHKtype();

	}
	
	
	/**
	 * TODO This method for searching 4th property.
	 *
	 * @throws InterruptedException
	 */
	@Test(priority=3)
	public void description() throws InterruptedException {
		SearchProperty.select4thProperty();
	}
}
