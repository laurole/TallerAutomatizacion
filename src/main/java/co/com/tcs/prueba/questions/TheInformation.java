package co.com.tcs.prueba.questions;

import co.com.tcs.prueba.usersinterfaces.CartPage;
import co.com.tcs.prueba.utils.Archive;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;

public class TheInformation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String nameProduct=CartPage.NAME_PRODUCT.resolveAllFor(actor).get(0).getText();
        String priceTotal = CartPage.SUBTOTAL.resolveAllFor(actor).get(0).getText().
                substring(1).replace(".","");
        int total = Integer.parseInt(priceTotal);
        String nameArchive = name();
        System.out.println(nameProduct);
        int unitsArchive = units();
        int priceUnitArchive = priceUnits();
        int totalArchive =priceUnitArchive*unitsArchive;

        if(nameProduct.equals(nameArchive) && total == totalArchive){
            return true;
        }
        return false;
    }

    public String name(){
        Archive a = new Archive();
        ArrayList<String> list;
        list = a.readArchive();
        return list.get(0);
    }
    public int units(){
        Archive a = new Archive();
        ArrayList<String> list ;
        list = a.readArchive();
        String aux =list.get(1);
        return Integer.parseInt(aux);

    }
    public int priceUnits(){
        Archive a = new Archive();
        ArrayList<String> list;
        list = a.readArchive();
        String aux= list.get(2);
        return Integer.parseInt(aux);

    }

    public static TheInformation isCorrect(){
        return new TheInformation();
    }
}
