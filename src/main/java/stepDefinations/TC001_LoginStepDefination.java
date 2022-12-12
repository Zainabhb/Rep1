package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
	@Given("when user is on home page")
	public void when_user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Home Page");
	}
	@Then("user clicks on signin link check title")
	public void user_clicks_on_signin_link_check_title() {
	    System.out.println("Sign in");
	}
	@When("user enters user name and password clicks on submit")
	public void user_enters_user_name_and_password_clicks_on_submit() {
	   System.out.println("Enter user name and password click on Submit...");
	}
	@Then("check user is valid and display message as Login Successful")
	public void check_user_is_valid_and_display_message_as_login_successful() {
	    System.out.println("Login Successful...");
	}
	@Then("Close the Browser")
	public void close_the_browser() {
	   System.out.println("Close Chrome..");
	}



}
