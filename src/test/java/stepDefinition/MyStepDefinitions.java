package stepDefinition;


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
	     System.out.println("Given User is on correct login page");
	    
	    }


	    @When("^User inputs ([a-zA-Z]{1,}) username$")
	    public void user_inputs_correct_incorrecrt_username(String validity) throws Throwable {
	    	System.out.println("When User inputs "+ validity+" username");
	    }
	    
	    @When("^Inputs (\"[a-zA-Z]{1,}\") password$")
	    public void inputs_correct_password(String keyword) throws Throwable {
	    	System.out.println("And Inputs "+keyword+" password");
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
