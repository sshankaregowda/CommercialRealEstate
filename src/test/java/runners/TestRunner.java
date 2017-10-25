package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions( features = "src/test/resources/features/cafeTownsend.feature",
        plugin = {"json:target/cafeTown.json","html:target/html/"},
        glue = "glue",
        format = {"pretty"},
        tags={"@CafeTownSend"}
        )

public class TestRunner extends AbstractTestNGCucumberTests {

}