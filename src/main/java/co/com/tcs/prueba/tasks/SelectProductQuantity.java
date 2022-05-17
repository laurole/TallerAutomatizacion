package co.com.tcs.prueba.tasks;


import co.com.tcs.prueba.usersinterfaces.SeccionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class SelectProductQuantity implements Task {
    String product;
    String quantity;

    public SelectProductQuantity(String product, String quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SeccionPage.TITLE_PRODUCT.of(product)),
               Click.on(SeccionPage.DROPDOWN_QUANTITY),
               Click.on(SeccionPage.LIST_OPTIONS.of(quantity)));
                //Click.on(SeccionPage.BUTTON_BUY));
    }
    public static SelectProductQuantity chooseProductQuantity(String product, String quantity){
        return Tasks.instrumented(SelectProductQuantity.class, product, quantity);
    }
}
