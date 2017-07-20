package glue;

//import cucumber.api.PendingException;
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

    @Given("^I am on XPlan home page using browser$")
    public void iAmOnXPlanHomePageUsingBrowser() throws Throwable {

        startBrowser("Initializing Execution");

        String browserType = dataDrivenPage.driveData("login", "BROWSER_TYPE");
        String applicationURL = dataDrivenPage.driveData("login", "URL");

        startBrowser(browserType);
        navigateTo(applicationURL);
    }

    @Then("^Login to the XPlan application using Valid credentials$")
    public void loginToTheXPlanApplicationUsingValidCredentials() throws Throwable {
        String username = dataDrivenPage.driveData("login", "Username");
        String password = dataDrivenPage.driveData("login", "Password");

        xplanloginpage.logonXplan(username, password);
        xplanloginpage.duplicateLoginMessage(password);
    }

    @And("^Search for client ID Individual for which podium already passed the data$")
    public void searchForClientIDIndividualForWhichPodiumAlreadyPassedTheData() throws Throwable {
        String ClientID = dataDrivenPage.driveData("Individual", "ClientID");

        xplanHomepage.topSearchBox(ClientID);
    }

    @And("^Search for client ID Company for which podium already passed the data$")
    public void searchForClientIDCompanyForWhichPodiumAlreadyPassedTheData() throws Throwable {
        String ClientID = dataDrivenPage.driveData("Company", "ClientID");

        xplanHomepage.topSearchBox(ClientID);
    }

    @And("^Search for client ID Trust for which podium already passed the data$")
    public void searchForClientIDTrustForWhichPodiumAlreadyPassedTheData() throws Throwable {
        String ClientID = dataDrivenPage.driveData("Trust", "ClientID");

        xplanHomepage.topSearchBox(ClientID);
    }

    @And("^Select the ID from the search result$")
    public void selectTheIDFromTheSearchResult() throws Throwable {
        xplanHomepage.searchResult();
    }

    @And("^Click on Financial Details tab$")
    public void clickOnFinancialDetailsTab() throws Throwable {
        xplanClientMenuPage.financialDetails();
    }

    @And("^Click on Balance Sheet$")
    public void clickOnBalanceSheet() throws Throwable {
        xplanClientMenuPage.balanceSheet();
    }
}
