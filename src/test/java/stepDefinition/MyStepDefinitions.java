package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	public class MyStepDefinitions {
	

    @When("^Chrome Driver is opened$")
    public void chrome_driver_is_opened() throws Throwable {
    	System.out.println("Background:Driver is opened");
    }

    @Then("^Go to login Page$")
    public void go_to_login_page() throws Throwable {
    	System.out.println("Background: Get login page");
    }


	    @Given("^User is on correct login page$")
	    public void user_is_on_correct_login_page() throws Throwable {
	     System.out.println("Given User is on correct login page");
	    
	    }

	    @When("^User inputs corrects username$")
	    public void user_inputs_corrects_username() throws Throwable {
		     System.out.println("When User inputs corrects username");

	    }

	    @When("^User inputs incorrects username$")
	    public void user_inputs_incorrects_username() throws Throwable {
	    	System.out.println("When User inputs incorrects username");
	    }
	    
	    @When("^Inputs correct password$")
	    public void inputs_correct_password() throws Throwable {
	    	System.out.println("And Inputs correct password");
	    }

	    @When("^Inputs incorrect password$")
	    public void inputs_incorrect_password() throws Throwable {
	    		System.out.println("And Inputs incorrect password");
	    }

	    @Then("^User able to go to dashboard$")
	    public void user_able_to_go_to_dashboard() throws Throwable {
	        System.out.println(" Then User able to go to dashboard");
	        System.out.println();
	    }

	    @Then("^User not able to go to dashboard$")
	    public void user_not_able_to_go_to_dashboard() throws Throwable {
	    	System.out.println("Then User not able to go to dashboard");
	    	System.out.println();
	        
	    }

}
