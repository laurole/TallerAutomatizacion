package co.com.tcs.prueba.stepsdefinitions;

import co.com.tcs.prueba.questions.TheMessage;
import co.com.tcs.prueba.tasks.AddCart;
import co.com.tcs.prueba.tasks.GoToCartAndDelete;
import co.com.tcs.prueba.tasks.SelectCategorySeccion;
import co.com.tcs.prueba.tasks.SelectProductQuantity;
import co.com.tcs.prueba.usersinterfaces.LinioPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


public class ValidateCartDataStepsDefinitions {

    LinioPage linioPage;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Laura");
    }

    @Given("^the user is on the page(.*)$")
    public void theUserIsOnThePage(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(linioPage));
    }
    @When("^the user selects the Home category and then the section Mattresses, bed bases and pillows\\.$")
    public void theUserSelectsTheHomeCategoryAndThenTheSectionMattressesBedBasesAndPillows() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectCategorySeccion.select());
    }
    @When("^the user selects the product (.*) (.*)$")
    public void theUserSelectsTheProduct(String product, String quality) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProductQuantity.chooseProductQuantity(product, quality));
    }
    @Then("^the user click on add to cart$")
    public void theUserClickOnAddToCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddCart.goToCart());
    }
    @Then("^the user should see in the cart the product, the quantity and the new value match the total of products$")
    public void theUserShouldSeeInTheCartTheProductTheQuantityAndTheNewValueMatchTheTotalOfProducts() {

    }
    @Then("^the user goes to the cart and removes the products$")
    public void theUserGoesToTheCartAndRemovesTheProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCartAndDelete.DeleteProduct());
    }
    @Then("^the user should see the message (.*)$")
    public void theUserShouldSeeTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheMessage.isVisible(),
                Matchers.equalTo(message)));
    }



}
