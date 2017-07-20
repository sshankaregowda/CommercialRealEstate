package framework;

/**
 * Created by P737084 on 5/11/2016.
 */

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import pageObjects.*;

import java.net.MalformedURLException;
import java.net.URL;

public class ParentScenario {
    private WebDriver driver;
    public final String EXEC_SELENIUM_GRID = "http://localhost:4444/wd/hub";

    protected DataDrivenPage dataDrivenPage;
    protected XplanLoginPage xplanloginpage;
    protected XplanHomePage xplanHomepage;
    protected XplanClientMenuPage xplanClientMenuPage;
    protected ClientDetailsPage clientDetailsPage;


    protected void startBrowser(String browsertype) throws Exception {

        if (browsertype.equalsIgnoreCase("chrome")) {

            try {
                System.setProperty("webdriver.chrome.driver", "C:\\Resource\\ChromeDriver\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browsertype.equalsIgnoreCase("Mozilla")) {

            try {
                System.setProperty("webdriver.firefox.marionette", "C:\\Resource\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browsertype.equalsIgnoreCase("Explorer")) {

            try {
                System.setProperty("webdriver.ie.driver", "C:\\Resource\\IEDriverServer\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.manage().window().maximize();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browsertype.equalsIgnoreCase("safari")) {

            try {
                driver = new SafariDriver();
                driver.manage().window().maximize();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browsertype.equalsIgnoreCase("remoteChrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Resource\\ChromeDriver\\chromedriver.exe");
            DesiredCapabilities p_chromeCapabilities = DesiredCapabilities.chrome();

            try {
                driver = new RemoteWebDriver(new URL(EXEC_SELENIUM_GRID), p_chromeCapabilities);
                driver.manage().window().maximize();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        } else if (browsertype.equalsIgnoreCase("remoteMozilla")) {

            System.setProperty("webdriver.gecko.driver", "C:\\Resource\\geckodriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", false);

            try {
                driver = new RemoteWebDriver(new URL(EXEC_SELENIUM_GRID), capabilities);
                driver.manage().window().maximize();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        } else if (browsertype.equalsIgnoreCase("remoteExplorer")) {

            System.setProperty("webdriver.ie.driver", "C:\\Resource\\IEDriverServer\\IEDriverServer.exe");
            DesiredCapabilities p_ieCapabilities = DesiredCapabilities.internetExplorer();

            try {
                driver = new RemoteWebDriver(new URL(EXEC_SELENIUM_GRID), p_ieCapabilities);
                driver.manage().window().maximize();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else if(browsertype.equalsIgnoreCase("Initializing Execution")){

        }else{
            Assert.fail("Browser Not Specified Properly");
        }

        xplanloginpage              = new XplanLoginPage(driver);
        xplanHomepage               = new XplanHomePage(driver);
        xplanClientMenuPage         = new XplanClientMenuPage(driver);
        dataDrivenPage              = new DataDrivenPage(driver);
        clientDetailsPage           = new ClientDetailsPage(driver);
    }

    protected void navigateTo(String ApplicationURL) {
        driver.navigate().to(ApplicationURL);
    }

    protected void closeBrowser(Scenario scenario) throws Exception {
        Thread.sleep(5000);
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        driver.quit();
    }

}