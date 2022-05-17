package co.com.tcs.prueba.usersinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.linio.com.co/")
public class LinioPage extends PageObject {


    public static final Target MENU_CATEGORY = Target.the("menu_category").
            locatedBy("//div[@id='open-left-menu']/div");
    public static final Target CATEGORY = Target.the("category").
            locatedBy("//div[@id='main-menu']/nav/ul/li[8]/a");


}
