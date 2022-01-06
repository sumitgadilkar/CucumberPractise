package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testBase;

public class amazonCreateAcntPage extends testBase {

	
	
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	WebElement signBtn;
	
	
	public amazonCreateAcntPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public amazonSignin usersignin() {
		signBtn.click();		
		return new amazonSignin();
	}
	
	
}
