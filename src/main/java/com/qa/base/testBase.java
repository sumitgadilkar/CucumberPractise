package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.EventLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.excelreader.excelReader;

public class testBase {

	public static Properties prop;
	public static FileInputStream fip;
	public static WebDriver driver;

	Logger log = LogManager.getLogger(testBase.class);
	
	
	public testBase() {

		prop = new Properties();
		try {
			fip = new FileInputStream(
					"E:/Selenium Projects/CucumberPractise/src/main/java/com/qa/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			prop.load(fip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		log.info("-------------This is a message-----------"); 
		log.warn("-------------This is warning message ------");

		
		 

	}

	public static void initialize() {

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"E:/Selenium Projects/CucumberDemo2/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}

		driver.get(prop.getProperty("website"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// WebDriverWait w = new WebDriverWait(driver, 40);
		// w.until(ExpectedConditions.elementToBeSelected(driver.findElement(null)));

	}

}
