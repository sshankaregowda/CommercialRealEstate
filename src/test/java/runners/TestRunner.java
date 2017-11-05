package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/*
* Filename      	         Created By       Date
* TestRunner.java            Shruthi          05/11/2017
*
* Java class used for running cucumber tests
*/

@CucumberOptions( features = "src/test/resources/features/CommercialRealEstate.feature",
        plugin = {"json:target/CommercialEstate.json","html:target/html/"},
        glue = "glue",
        format = {"pretty"},
        tags={"@CommercialRealEstate"}
        )

public class TestRunner extends AbstractTestNGCucumberTests {

}