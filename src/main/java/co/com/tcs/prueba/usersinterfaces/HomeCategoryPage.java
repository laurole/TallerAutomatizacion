package co.com.tcs.prueba.usersinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomeCategoryPage extends PageObject {

    public static final Target SECCION = Target.the("seccion").
            locatedBy("//img[@alt='Colchones y Base Cama']");

}
