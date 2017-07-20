package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions( features = "src/test/resources/features/Individual.feature",
        plugin = {"json:target/Individual.json","html:target/htmlIndividual/"},
        glue = "glue",
        format = {"pretty"},
        tags={"@Individual"}
        )

public class TestRunnerIndividual extends AbstractTestNGCucumberTests {

}