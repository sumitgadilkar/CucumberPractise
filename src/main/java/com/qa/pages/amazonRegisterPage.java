package com.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testBase;

public class amazonRegisterPage extends testBase {

	WebDriver driver;
	
	@FindBy(xpath="//input[@name='customerName']")
	WebElement name1;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email1;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pass1;
	
	@FindBy(xpath="//input[@name='passwordCheck']")
	WebElement passcheck1;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continueBtn;
	
	@FindBy(xpath="//div[@class='a-section a-padding-medium auth-workflow']")
	WebElement emailstate;
	
	public amazonRegisterPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public signinSuccess userEntry(String name, String email, String password, String passcheck) {
		
		name1.sendKeys(name);		
		email1.sendKeys(email);
		pass1.sendKeys(password);
		passcheck1.sendKeys(passcheck);
		
		continueBtn.click();
		return new signinSuccess();		
	}
	
	public void verifycorrectSignin() {
		
		emailstate.getText();
		
		
		
	}
	
}
