package co.com.tcs.prueba.questions;

import co.com.tcs.prueba.usersinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheNameProduct implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return CartPage.NAME_PRODUCT.resolveAllFor(actor).get(0).getText();
    }

    public static TheNameProduct isCorrect(){
        return new TheNameProduct();
    }
}
