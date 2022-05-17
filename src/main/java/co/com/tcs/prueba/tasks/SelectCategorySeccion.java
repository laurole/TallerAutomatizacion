package co.com.tcs.prueba.tasks;

import co.com.tcs.prueba.usersinterfaces.LinioPage;
import co.com.tcs.prueba.usersinterfaces.HomeCategoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SelectCategorySeccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LinioPage.MENU_CATEGORY),
                Click.on(LinioPage.CATEGORY),
                Scroll.to(HomeCategoryPage.SECCION),
                Click.on(HomeCategoryPage.SECCION));
    }

    public static SelectCategorySeccion select(){
        return Tasks.instrumented(SelectCategorySeccion.class);
    }
}
