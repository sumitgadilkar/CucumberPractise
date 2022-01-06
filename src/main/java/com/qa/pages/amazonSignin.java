package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testBase;

public class amazonSignin extends testBase {

	
	
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement createbtn;
	
	
	
	
	public amazonSignin() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public amazonRegisterPage userclicksCreateBtn() {
		createbtn.click();
		return new amazonRegisterPage();
	}
	
}
