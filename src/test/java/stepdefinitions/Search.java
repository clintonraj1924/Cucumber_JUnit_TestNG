package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
    @Given("^User open the application$")
    public void user_open_the_application() {
    	System.out.println("hi");
    }
    @When("^User enter the valid product on search feilds$")
    public void user_enter_the_valid_product_on_search_feilds() {
    	System.out.println("hi");
    }
    @When("^User click on search button$")
    public void user_click_on_search_button() {
    	System.out.println("hi");
    }
    @Then("^Valid product should get displayed in search results$")
    public void valid_product_should_get_displayed_in_search_results() {
    	System.out.println("hi");
    }
    @When("^User enter the non valid product on search feilds$")
    public void user_enter_the_non_valid_product_on_search_feilds() {
    	System.out.println("hi");
    }
    @Then("^Proper text informing the user about the product matching should be displayed$")
    public void proper_text_informing_the_user_about_the_product_matching_should_be_displayed() {
    	System.out.println("hi");
    }
    @When("^User dont enter any product on search feilds$")
    public void user_dont_enter_any_product_on_search_feilds() {
    	System.out.println("hi");
    }
}
