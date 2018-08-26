package stepDefinition;


import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


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
    	System.out.println("User is on correct login page");
    }

    @When("^User inputs ([^\"]*) username$")
    public void user_inputs_something_username(String username) throws Throwable {
    	System.out.println("User inputs "+username+" username");
    }

    @And("^user enters age category$")
    public void user_enters_age_category(List<String> age) throws Throwable {

    System.out.println("user enters "+age.get(1)+" category");
    
    }
    
    
    @Then("^User \"([^\"]*)\" to go to dashboard$")
    public void user_something_to_go_to_dashboard(String validity) throws Throwable {
    	System.out.println("User "+validity+" to go to dashboard");
    	System.out.println();
    }

    @And("^Inputs \"([^\"]*)\" password$")
    public void inputs_something_password(String password) throws Throwable {
    	System.out.println("Inputs "+password+" password");
    }

}
