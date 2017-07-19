package com.github.step_definitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// import junit.framework.Assert;

public class github_signin_step_definition {

	WebDriver driver;
	
	@Given("^user is on github homepage$")
	public void user_is_on_github_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException(); ---comment because we are not yet ready to put code for exceptions
		
		String  BrowserToRun = "webdriver.gecko.driver" ;
		String  BrowserDriverLocation ="C:\\071717\\All Jars\\geckodriver.exe";
		String baseURL = "https://github.com/";
		
		System.setProperty(BrowserToRun, BrowserDriverLocation);
		
		driver = new FirefoxDriver();
		driver.get(baseURL);
		
		String openedURL = driver.getCurrentUrl();
		System.out.println("\nOpened URL is:  " + openedURL);
		
	}

	@When("^A user clicks on the Signin link$")
	public void a_user_clicks_on_the_Signin_link() throws Throwable {
	
		//Obtain the signin link using firebug and copy the xpath value
		
		driver.findElement(By.xpath("html/body/div[1]/header/div/div/div/a[1]")).click();
		
		
	} 

	/*
	@When("^enters username or email address$")
	public void enters_username_or_email_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		
		
		 driver.findElement(By.id("login_field")).clear();
		    driver.findElement(By.id("login_field")).sendKeys("reachfast@yahoo.com");
		
	} */

	@When("^enters \"([^\"]*)\" or email address$")
	public void enters_or_email_address(String username) throws Throwable {
			Thread.sleep(3000);
			
			
			driver.findElement(By.id("login_field")).clear();
		    driver.findElement(By.id("login_field")).sendKeys(username);	
	}
	
	
	
	/*@When("^enters password$")
	public void enters_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		
		driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("sairam2017");
	    
	}*/
	
	@When("^enters password as \"([^\"]*)\"$")
	public void enters_password(String pwd) throws Throwable {
	 		
		driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    
	}
	

	@When("^Clicks on signin button$")
	public void clicks_on_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		
		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
	}

//	@SuppressWarnings("deprecation")
	@Then("^user should see Start a project button$")
	public void user_should_see_Start_a_project_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new PendingException();
		
		
	//	String expectedValue ="Start a project";
		  String actualValue = "";
		  actualValue = driver.findElement(By.xpath("//*[@id='js-pjax-container']/div[1]/div/div/a[2]")).getText();
	//	  Assert.assertEquals(actualValue, expectedValue);
		  System.out.println("\nActual Value on the button is: " + actualValue);
		  
		  
		  if(actualValue.equals("Start a project")){
			  System.out.println("\nTest Passed");
		  }
		  else {
			  System.out.println("Something went wrong...TEST FAILED");
		  }
		  driver.quit();
	}
	
	
	@Then("^user is displayed Incorrect username or password message$")
	public void user_is_displayed_Incorrect_username_or_password_message() throws Throwable {
	Thread.sleep(3000);
	String BadLogin = driver.findElement(By.xpath("//*[@id='js-flash-container']/div/div")).getText();
	System.out.println("\nvalue of bad login is " + BadLogin);
	if (BadLogin.equals("Incorrect username or password.")){
		System.out.println("\nIt is all GOOD");
		
	}
			
		
	}

	
	
}
