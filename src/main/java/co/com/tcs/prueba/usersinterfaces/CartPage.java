package co.com.tcs.prueba.usersinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage extends PageObject {

    public static final Target DELETED = Target.the("remove completely").
            locatedBy("//a[@ng-click='cart.removeItem(item.sku)']");
    public static final Target EMPTY_CAR_MESSAGE = Target.the("Empty car message").
            locatedBy("//h2[@class='highlight col-md-6 offset-md-3']");

    public static final Target NAME_PRODUCT = Target.the("name product").
            locatedBy("//a[contains(text(),'Super Mega Combo Azul Queen 160x190 Resortado Mars')]");
    public static final Target SUBTOTAL = Target.the("Subtotal").
            locatedBy("//span[@class='price-main-sm float-right subtotal-price ml-auto']");
}