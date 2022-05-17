package co.com.tcs.prueba.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\validate_cart_data.feature",
        glue ="co.com.tcs.prueba.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@scenario2"
)
public class ValidateCartData {

}
