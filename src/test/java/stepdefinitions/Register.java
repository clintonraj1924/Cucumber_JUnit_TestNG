package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	@Given("^Users navigate to register account page$")
	public void users_navigate_to_register_account_page() {
		System.out.println("hi");
	}

	@When ("User enter below details into the fields")
	public void User_enter_below_details_into_the_fields(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		System.out.println("User Enter the first name as "+map.get("FirstName"));
		System.out.println("User Enter the last name as "+map.get("LasttName"));
		System.out.println("User Enter the email address as "+map.get("email"));
		System.out.println("User Enter the phone Number as "+map.get("phoneNumber"));
		System.out.println("User Enter the email passwod as "+map.get("passwod"));
		System.out.println("User Enter the conform Password as "+map.get("conformPassword"));
		
	}

	@When("^User enter firstName into the first name fields \"(.+)\"$")
	public void user_enter_first_name_into_the_first_name_fields(String FirstName) {
		System.out.println("hi");
	}

	@When("^Ender the lastName into the last name fields \"(.+)\"$")
	public void ender_the_last_name_into_the_last_name_fields(String LastName) {
		System.out.println("hi");
	}

	@When("^Enter the email address into email fields \"(.+)\"$")
	public void enter_the_email_address_into_email_fields(String Email) {
		System.out.println("hi");
	}

	@When("^Enter the phone number into the phone number fields \"(.+)\"$")
	public void enter_the_phone_number_into_the_phone_number_fields(String PhoneNumber) {
		System.out.println("hi");
	}

	@When("^Enter the password into the password field \"(.+)\"$")
	public void enter_the_password_into_the_password_field(String PW) {
		System.out.println("hi");
	}

	@When("^Enter the conform password into the conform password fields \"(.+)\"$")
	public void enter_the_conform_password_into_the_conform_password_fields(String ConformPW) {
		System.out.println("hi");
	}

	@When("^Select Privacy Policy fields$")
	public void select_Privacy_policy_fields() {
		System.out.println("hi");
	}

	@When("^Click on Continue button$")
	public void click_on_continue_button() {
		System.out.println("hi");
	}

	@Then("^Account should be create succesfully$")
	public void account_should_be_create_succesfully() {
		System.out.println("hi");
	}

	@When("^Enter the passwod into the password field \"(.+)\"$")
	public void enter_the_passwod_into_the_password_field(String Password) {
		System.out.println("hi");
	}

	@When("^Select Pivacy Policy fields$")
	public void select_pivacy_policy_fields() {
		System.out.println("hi");
	}

	@Then("^Account should be create successfully$")
	public void account_should_be_create_successfully() {
		System.out.println("hi");
	}

	@When("^Select yes on NewsLetter fields$")
	public void select_yes_on_news_letter_fields() {
		System.out.println("hi");
	}

	@When("^User dont enter any fields$")
	public void user_dont_enter_any_fields() {
		System.out.println("hi");
	}

	@Then("^Warning message should dispaly for the mandatory fields$")
	public void warning_message_should_dispaly_for_the_mandatory_fields() {
		System.out.println("hi");
	}

}
