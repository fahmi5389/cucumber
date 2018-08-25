package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	public class MyStepDefinitions {

	    @Given("^User is on correct login page$")
	    public void user_is_on_correct_login_page() throws Throwable {
	     
	    }

	    @When("^User inputs corrects username$")
	    public void user_inputs_corrects_username() throws Throwable {
	       
	    }

	    @When("^User inputs incorrects username$")
	    public void user_inputs_incorrects_username() throws Throwable {
	        
	    }
	    
	    @And("^Inputs_correct_password$")
	    public void Inputs_correct_password() throws Throwable {
	       
	    }
	    
	    @And("^Inputs_incorrect_password$")
	    public void Inputs_incorrect_password() throws Throwable {
	       
	    }

	    @Then("^User able to go to dashboard$")
	    public void user_able_to_go_to_dashboard() throws Throwable {
	        
	    }

	    @Then("^User not able to go to dashboard$")
	    public void user_not_able_to_go_to_dashboard() throws Throwable {
	        
	    }

}
