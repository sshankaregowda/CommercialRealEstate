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

    @Given("^I am on CafeTownSend Login page using browser$")
    public void iAmOnCafeTownSendLoginPageUsingBrowser() throws Throwable {
        startBrowser("Initializing Execution", "operating system");

        String browserType = dataDrivenPage.driveData("scenarioOne", "BROWSER_TYPE");
        String osType = dataDrivenPage.driveData("scenarioOne", "OS_TYPE");
        String applicationURL = dataDrivenPage.driveData("scenarioOne", "URL");

        startBrowser(browserType, osType);
        navigateTo(applicationURL);
    }

    @Then("^Login to the CafeTownSend application using Valid credentials$")
    public void loginToTheCafeTownSendApplicationUsingValidCredentials() throws Throwable {

        String userName = dataDrivenPage.driveData("scenarioOne", "Username");
        String password = dataDrivenPage.driveData("scenarioOne", "Password");

        loginpage.logon(userName,password);
    }

    @Then("^create customers$")
    public void createCustomers() throws Throwable {
        String firstName = dataDrivenPage.driveData("scenarioOne", "firstName");
        String lastName = dataDrivenPage.driveData("scenarioOne", "lastName");
        String startDate = dataDrivenPage.driveData("scenarioOne", "startDate");
        String email = dataDrivenPage.driveData("scenarioOne", "email");

        Thread.sleep(2000);
        homePage.create();
        createPage.keyInCreateDetails(firstName, lastName, startDate, email);
    }

    @Then("^edit customers$")
    public void editCustomers() throws Throwable {
        String firstName = dataDrivenPage.driveData("scenarioTwo", "firstName");
        String lastName = dataDrivenPage.driveData("scenarioTwo", "lastName");
        String startDate = dataDrivenPage.driveData("scenarioTwo", "startDate");
        String email = dataDrivenPage.driveData("scenarioTwo", "email");
        Thread.sleep(2000);
        editPage.selectClient();
        homePage.edit();
        editPage.keyInUpdateDetails(firstName, lastName, startDate, email);
    }

    @Then("^delete customers$")
    public void deleteCustomers() throws Throwable {
        Thread.sleep(2000);
        deletePage.selectClient();
        deletePage.deleteCustomer();
    }
}
