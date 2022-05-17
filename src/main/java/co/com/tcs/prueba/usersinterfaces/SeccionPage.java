package co.com.tcs.prueba.usersinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeccionPage extends PageObject {

    public static final Target TITLE_PRODUCT = Target.the("title_product").
            locatedBy("//meta[@content={0}]/..");
    public static final Target DROPDOWN_QUANTITY = Target.the("dropDown").
            locatedBy("//div[@class='select-dropdown select-dropdown-product-quantity']");
    public static final Target LIST_OPTIONS = Target.the("List_options").
            locatedBy("//ul[@id='select-dropdown-list-product-quantity']/li[@data-value={0}]");

    public static final Target PRICE = Target.the("price_product").
            locatedBy("//div[@class='product-price-lg']/div/span[@class='price-main-md'][1]");
    public static final Target BUTTON_BUY = Target.the("button_buy")
            .locatedBy("//button[@id='buy-now']");
    public static final Target GO_TO_CART = Target.the("go to cart").
            locatedBy("//a[@class='btn btn-sm btn-go-to-cart added-product']");
}
