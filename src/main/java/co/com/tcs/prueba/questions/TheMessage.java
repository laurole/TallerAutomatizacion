package co.com.tcs.prueba.questions;

import co.com.tcs.prueba.usersinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return CartPage.EMPTY_CAR_MESSAGE.resolveAllFor(actor).get(0).getText();
    }

    public static TheMessage isVisible(){
        return new TheMessage();
    }
}
