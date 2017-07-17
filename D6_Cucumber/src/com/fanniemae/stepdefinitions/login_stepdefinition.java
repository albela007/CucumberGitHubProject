package com.fanniemae.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_stepdefinition {


@Given("^user is on SDETtraining\\.com Home page$")
public void user_is_on_SDETtraining_com_Home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  //  throw new PendingException();
    
    System.out.println("Code to implement the GIVEN STEP will come here");
}

@When("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	
	System.out.println("Code to implement the WHEN STEP will come here");
}

@Then("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	
	System.out.println("Code to implement the THEN STEP will come here");
}
}
