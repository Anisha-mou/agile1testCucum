package stepDefs;

import org.testng.asserts.SoftAssert;

import baseclasses.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class LoginSteps extends BaseTest {
	
	
	
	

	
	



	@Given("user is in the login page")
	public void user_login() {
		
		nav.clickSignup();
		
	}
	
	@When("user inserts email and password")
	public void user_inserts_email_and_password() {
	    login.insertEmail("twitt@gmail.com");
        login.insertPassword("125869sd");	}

	@When("user inserts invalid {string} and {string}")
	public void user_inserts_invalid_email_and_password(String email,String password) {
	    login.insertEmail(email);
	    login.insertPassword(password);
	}
	
	
	
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
	    login.clickLogin();
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
	   SoftAssert softAssert = new SoftAssert() ;
		   softAssert.assertTrue(false);
		   //softAssert.assertAll();
		   System.out.println("After Assert");
	   }
		   
	   
	   

	@And("user should be navigated to the dashboard")
	public void user_should_be_navigated_to_the_dashboard() {
	    
	}
	
	
	
	
	

}
