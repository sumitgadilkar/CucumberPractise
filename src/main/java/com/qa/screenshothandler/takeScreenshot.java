package com.qa.screenshothandler;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.base.testBase;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class takeScreenshot extends testBase {

	public static void webScreen(WebDriver driver, WebElement webel, String filename) throws IOException {
		
		byte[] b = webel.getScreenshotAs(OutputType.BYTES);
		
		File f1 = OutputType.FILE.convertFromPngBytes(b);
		
		FileUtils.copyFile(f1, new File("/CucumberPractise/src/main/java/com/qa/screenshots/Screenshots"+filename+".jpeg"));
		
			
	}
	
	
	public static void fullPageScreenshot(WebDriver driver, String Filename) throws IOException {
		
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("E:/Selenium Projects/CucumberPractise/src/main/java/com/qa/screenshots/Screenshots"+Filename+".jpg"));
		
	}
	
}
