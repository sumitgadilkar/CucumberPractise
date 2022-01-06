package StepDefinitions;

import com.qa.base.testBase;
import com.qa.excelreader.excelReader;
import com.qa.pages.amazonCreateAcntPage;
import com.qa.pages.amazonSignin;
import com.qa.screenshothandler.takeScreenshot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.junit.Assert;

public class createAccount extends testBase{

	//WebDriver driver;
	amazonSignin amzsign;
	amazonCreateAcntPage amzpage;
	
	@Given("user navigates to amazon website")
	public void navigate() {
		
		testBase.initialize();
		
		/*
		 * try { Object data [][] = excelReader.testDatReader();
		 * 
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */	
		
		System.out.println("in Given method after initialize");
		
		
	}
	
	@When("user clicks on Signin link")
	public void signinBtn() throws IOException {
		 amzpage = new amazonCreateAcntPage();
		 amzsign = new amazonSignin();	
		 takeScreenshot.fullPageScreenshot(driver, "signin");
		 amzsign = amzpage.usersignin();
	}
	
	@Then("Amazon signin page opens")
	public void amazonsign() throws IOException{
		takeScreenshot.fullPageScreenshot(driver, "createBtnPage");
		amzsign.userclicksCreateBtn();
		
	}
	
	@Then("user clicks on create a new account")
	public void user_clicks_on_create_a_new_account() {
		System.out.println("im in 2 then scenario");
	}

	@Then("user provides \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"")
	public void user_provides_and_and_and(String string, String string2, String string3, String string4) {
	  
	}

	@Then("user clicks on Continue button")
	public void user_clicks_on_Continue_button() {
		System.out.println("im in parameters scenario");
	   
	}

	
}
