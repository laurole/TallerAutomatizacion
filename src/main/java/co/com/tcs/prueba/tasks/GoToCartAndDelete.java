package co.com.tcs.prueba.tasks;

import co.com.tcs.prueba.usersinterfaces.CartPage;
import co.com.tcs.prueba.usersinterfaces.SeccionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCartAndDelete implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SeccionPage.BUTTON_BUY),
                Click.on(SeccionPage.GO_TO_CART),
                Click.on(CartPage.DELETED));
    }

    public static GoToCartAndDelete DeleteProduct(){
        return Tasks.instrumented(GoToCartAndDelete.class);
    }
}
