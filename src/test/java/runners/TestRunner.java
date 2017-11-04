package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions( features = "src/test/resources/features/CommercialRealEstate.feature",
        plugin = {"json:target/cafeTown.json","html:target/html/"},
        glue = "glue",
        format = {"pretty"},
        tags={"@CommercialRealEstate"}
        )

public class TestRunner extends AbstractTestNGCucumberTests {

}