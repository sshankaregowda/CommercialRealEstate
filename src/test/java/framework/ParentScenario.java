package framework;


import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import pageObjects.*;

import java.util.HashMap;
import java.util.Map;

/*
* Filename      	             Created By       Date
* ParentScenario.java            Shruthi          05/11/2017
*
* Java class containing methods for driving specific browser type and operating system and closing the browser
*/

public class ParentScenario {
    private WebDriver driver;
    protected DataDrivenPage dataDrivenPage;
    protected CommercialRealEstateHomePage commercialRealEstateHomePage;

    //method to driver specific browser and O.S
    protected void startBrowser(String browsertype, String osType) throws Exception {

        if (browsertype.equalsIgnoreCase("chrome") && osType.equalsIgnoreCase("mac")) {

            try {

                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
               // options.addArguments("--headless");
                options.addArguments("--window-size=1920,1080");

                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("credentials_enable_service", false);
                prefs.put("profile.password_manager_enabled", false);
                options.setExperimentalOption("prefs", prefs);

                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);

                driver = new ChromeDriver(capabilities);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browsertype.equalsIgnoreCase("chrome") && osType.equalsIgnoreCase("windows")) {

            try {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                // options.addArguments("--headless");
                options.addArguments("--window-size=1920,1080");

                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("credentials_enable_service", false);
                prefs.put("profile.password_manager_enabled", false);
                options.setExperimentalOption("prefs", prefs);

                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);

                driver = new ChromeDriver(capabilities);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (browsertype.equalsIgnoreCase("Mozilla") && osType.equalsIgnoreCase("mac") ) {

            try {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }  else if (browsertype.equalsIgnoreCase("Mozilla") && osType.equalsIgnoreCase("windows") ) {

            try {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }  else if(browsertype.equalsIgnoreCase("Initializing Execution")){

        }else{
            Assert.fail("Browser Not Specified Properly");
        }

        commercialRealEstateHomePage              = new CommercialRealEstateHomePage(driver);
        dataDrivenPage         = new DataDrivenPage(driver);

    }

    //method to navigate to the URL
    protected void navigateTo(String ApplicationURL) {
        driver.navigate().to(ApplicationURL);
    }

    //method to close browser and take screenshot if scenario is failed
    protected void closeBrowser(Scenario scenario) throws Exception {
        Thread.sleep(5000);
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        driver.quit();
    }

}