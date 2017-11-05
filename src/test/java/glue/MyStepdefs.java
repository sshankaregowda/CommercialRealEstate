package glue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.ParentScenario;
import org.testng.Assert;
/*
* Filename      	         Created By       Date
* MyStepdefs.java            Shruthi          05/11/2017
*
* Java class containing step definition methods
*/


public class MyStepdefs extends ParentScenario {

    Boolean value;
    String text;

    @After
    public void afterScenario(Scenario scenario) throws Exception {
        closeBrowser(scenario);
    }


    @Given("^I am on Commercial Real Estate Home page$")
    public void iAmOnCommercialRealEstateHomePage() throws Throwable {
        startBrowser("Initializing Execution", "operating system");

        String browserType = dataDrivenPage.driveData("scenarioOne", "BROWSER_TYPE");
        String osType = dataDrivenPage.driveData("scenarioOne", "OS_TYPE");
        String applicationURL = dataDrivenPage.driveData("scenarioOne", "URL");

        startBrowser(browserType, osType);
        navigateTo(applicationURL);
    }

    @Then("^Verify Property Page successfully loaded$")
    public void verifyPropertyPageSuccessfullyLoaded() throws Throwable {
        value =commercialRealEstateHomePage.property();
        Assert.assertTrue(value);
    }

    @Then("^Verify BusinessForSale Page successfully loaded$")
    public void verifyBusinessForSalePageSuccessfullyLoaded() throws Throwable {
        text = commercialRealEstateHomePage.BusinessForSale();
        Assert.assertEquals(text,"Be your own boss.");
    }

    @Then("^Verify Franchise Page successfully loaded$")
    public void verifyFranchisePageSuccessfullyLoaded() throws Throwable {
        value=commercialRealEstateHomePage.Franchise();
        Assert.assertTrue(value);
    }

    @Then("^Verify News Page successfully loaded$")
    public void verifyNewsPageSuccessfullyLoaded() throws Throwable{
        value = commercialRealEstateHomePage.News();
        Assert.assertTrue(value);
    }

}
