package co.com.tcs.stepsdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateCartDataStepsDefinitions {
    @Given("^the user is on the page(.*)$")
    public void theUserIsOnThePage(String url) {

    }
    @When("^the user selects the Home category and then the section Mattresses, bed bases and pillows\\.$")
    public void theUserSelectsTheHomeCategoryAndThenTheSectionMattressesBedBasesAndPillows() {

    }
    @When("^the user selects the product(.*)(.*)\"$")
    public void theUserSelectsTheProduct(String product, String quality) {

    }
    @Then("^the user click on add to cart$")
    public void theUserClickOnAddToCart() {

    }
    @Then("^the user should see in the cart the product, the quantity and the new value match the total of products$")
    public void theUserShouldSeeInTheCartTheProductTheQuantityAndTheNewValueMatchTheTotalOfProducts(DataTable arg1) {

    }
    @Then("^the user goes to the cart and removes the products$")
    public void theUserGoesToTheCartAndRemovesTheProducts() {

    }

    @Then("^the user should see the message (.*)$")
    public void theUserShouldSeeTheMessage(String arg1) {
  ;
    }



}
