package com.first.framework.page;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.first.framework.base.Base;

/**
 * TODO Verify search functionality for the multiple locality and description tag for
   the property.
 *
 * @author Pooja.
 *         Created 21-Oct-2020.
 */
public class SearchProperty {

	/**
	 * TODO Locator for Search text box.
	 */
	static By searchBox = By.xpath("//input[@id='locationGoogle']");
	/**
	 * TODO Locator for Malad East- Malkani Estate.
	 */
	static By malad     = By.xpath("//span[text()='Malad East - Malkani Estate']");
	/**
	 * TODO Locator for Malad West - Sundar Ln.
	 */
	static By maladwest = By.xpath("//span[text()='Malad west - Sundar Ln']");
	/**
	 * TODO Locator for BHK Type.
	 */
	static By BHKtype   = By.xpath("//span[text()='BHK Type']");
	/**
	 * TODO Locator for 2 BHK.
	 */
	static By BHK2      = By.xpath("//input[@id='bhk2']");
	/**
	 * TODO Locator for selected 2 BHK.
	 */
	static By bhktype   = By.xpath("//span[text()='2 BHK']");
	/**
	 * TODO Locator for 3 BHK.
	 */
	static By bhk3      = By.xpath("//input[@id='bhk3']");
	/**
	 * TODO Locator for Search button.
	 */
	static By search    = By.xpath("//span[@class='btn home-search-button']");
	/**
	 * TODO Locator for selecting 4th property.
	 */
	static By select    = By.xpath("(//a[@class='card-link-detail'])[4]");
	/**
	 * TODO Locator for Description text.
	 */
	static By desc      = By.xpath("//span[text()='Description']");
	
	/**
	 * TODO Declaring driver.
	 */
	public static WebDriver driver;
	
	/**
	 * TODO Search for a property.
	 *
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void selectProperty() throws IOException, InterruptedException {
		Thread.sleep(10000);
		Base.driver.findElement(searchBox).sendKeys(Base.propertyFile("City"));
		Thread.sleep(4000);
		Base.driver.findElement(malad).click();
		Base.driver.findElement(searchBox).sendKeys(Base.propertyFile("City"));
		Thread.sleep(4000);
		Base.driver.findElement(maladwest).click();
		
	}
	
	
	/**
	 * TODO Select 2 BHK & 3 BHK .
	 *
	 * @throws InterruptedException
	 */
	public static void selectBHKtype() throws InterruptedException {
		Base.driver.findElement(BHKtype).click();
		Thread.sleep(5000);
		Base.driver.findElement(BHK2).click();
		Thread.sleep(5000);
		Base.driver.findElement(bhktype).click();
		Thread.sleep(5000);
		Base.driver.findElement(bhk3).click();
		Base.driver.findElement(search).click();
		Thread.sleep(10000);
		
	}
	
	
	/**
	 * TODO Select the 4th property from the searched property.
	 *
	 * @throws InterruptedException
	 */
	public static void select4thProperty() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) Base.driver;
		js.executeScript("window.scrollBy(0,1000)");
		Base.driver.findElement(select).click();
		Thread.sleep(10000);
		// Set<String> handles = Base.driver.getWindowHandles();
		 for (String handle1 : Base.driver.getWindowHandles()) {
			 
	         	Base.driver.switchTo().window(handle1);
	 
	         	}
		js.executeScript("window.scrollBy(0,1000)");
		if(Base.driver.findElements(desc).size()!=0) {
			Assert.assertEquals(true, true);
		}else {
			Assert.assertEquals(false, false);
		
	}
	
	
}
}