package com.first.framework.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * TODO Put here a description of what this class does.
 *
 * @author Pooja.
 *         Created 21-Oct-2020.
 */
public class Base {

	/**
	 * TODO Declaring the WebDriver.
	 */
	public static WebDriver driver = null;

	/**
	 * TODO This method navigate us to the site.
	 * @param browser 
	 * @throws IOException 
	 *
	 */
	
	public static void openURL(String browser) throws IOException
	{
		if(browser.equalsIgnoreCase("firefox")) {
			//Mention path for geckodriver.exe at "----"
			System.setProperty("webdriver. gecko. driver","----");
			driver = new FirefoxDriver();
			driver.get(Base.propertyFile("Url"));
			driver.manage().window().maximize();
		}
		
		else if(browser.equalsIgnoreCase("chrome")) {
		
			try{
				//Mention path for chromedriver.exe at "---"
	    System.setProperty("webdriver.chrome.driver","---");
	    //Initializing Chromedriver
	    driver = new ChromeDriver();
	    driver.get(Base.propertyFile("Url"));
	    driver.manage().window().maximize();
			}catch(Exception E)

	    {
	        E.printStackTrace();

	    }
	
	}
	}
	
	
	/**
	 * TODO This method load the File to get its element.
	 *
	 * @param Key
	 * @return Element
	 * @throws IOException
	 */
	public static String propertyFile(String Key) throws IOException {
		//Mention path of File.properties at "---"
		File file = new File("---");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		return prop.getProperty(Key);

	}
	
	
	 }
	
	

	

