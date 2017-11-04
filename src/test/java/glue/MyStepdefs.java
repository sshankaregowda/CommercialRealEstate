package glue;

//import cucumber.api.PendingException;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.ParentScenario;

public class MyStepdefs extends ParentScenario {

    @After
    public void afterScenario(Scenario scenario) throws Exception {
        closeBrowser(scenario);
    }


    @Given("^I am on Commericial Real Estate Home page using browser$")
    public void iAmOnCommericialRealEstateHomePageUsingBrowser() throws Throwable {
        startBrowser("Initializing Execution", "operating system");

        String browserType = dataDrivenPage.driveData("scenarioOne", "BROWSER_TYPE");
        String osType = dataDrivenPage.driveData("scenarioOne", "OS_TYPE");
        String applicationURL = dataDrivenPage.driveData("scenarioOne", "URL");

        startBrowser(browserType, osType);
        navigateTo(applicationURL);
    }

    @Then("^Verify Property Page successfully loaded$")
    public void verifyPropertyPageSuccessfullyLoaded() throws Throwable {
        commercialRealEstateHomePage.property();
    }

    @Then("^Verify BusinessForSale Page successfully loaded$")
    public void verifyBusinessForSalePageSuccessfullyLoaded() throws Throwable {
        commercialRealEstateHomePage.BusinessForSale();
    }

    @Then("^Verify Franchise Page successfully loaded$")
    public void verifyFranchisePageSuccessfullyLoaded() throws Throwable {
        commercialRealEstateHomePage.Franchise();
    }
}
