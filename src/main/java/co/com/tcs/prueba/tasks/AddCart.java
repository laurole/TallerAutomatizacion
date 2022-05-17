package co.com.tcs.prueba.tasks;

import co.com.tcs.prueba.usersinterfaces.SeccionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SeccionPage.BUTTON_BUY),
                Click.on(SeccionPage.GO_TO_CART));
    }

    public static AddCart goToCart(){
        return Tasks.instrumented(AddCart.class);
    }
}
