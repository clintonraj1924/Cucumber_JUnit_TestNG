package stepdefinitions;

import io.cucumber.java.en.*;

public class Login {
	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page() {
		System.out.println(">>User got navigate to login page$");
	}

	@When("^User enter valid email address (.+)$") // .+ is the regular expression
	public void user_enter_valid_email_address(String email) {
		System.out.println(">>User entered valid email address: " + email);
	}

	@When("^Enter valid password (.+)$")
	public void enter_valid_password(String validPassWord) {
		System.out.println(">>User has entered valid password:" + validPassWord);
	}

	@When("^Click the login button$")
	public void click_the_login_button() {
		System.out.println(">>User has click login btn");
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() {
		System.out.println(">> User login in sucessfully");
	}

	@When("^User enter invalid email address \"(.+)\"$")
	public void user_enter_invalid_email_address(String invalidUserName) {
		System.out.println(">> User has entered invalid email addtess");
	}

	@When("^Enter invalid password \"(.+)\"$")
	public void enter_invalid_password(String invalidPassWord) {
		System.out.println("User entered invalid PW : ");
	}

	@Then("^User should get a proper warning message$")
	public void user_should_get_a_proper_warning_message() {
		System.out.println("User got proper warning message");
	}

}
