package framework;

import com.csvreader.CsvReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

/*
 * Filename      	   Created By       Date
 * DSL.java            Shruthi          05/11/2017
 *
 * Java class containing methods for obtaining data from csv sheet and all basic functions on web page
 */
public abstract class DSL {

    private WebDriver driver;
    static Dictionary dict = new Hashtable();
    static Dictionary dicttoread = new Hashtable();


    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    //method to obtain data from csv file
    public  String getData(String t_testcaseName,String t_field,int t_instance) throws Exception{
        try{
            int flag = 0;
            CsvReader csvreaderobj = new CsvReader(System.getProperty("user.dir")+"/src/test/resources/inputDataSheet/inputDataSheet.csv");
            csvreaderobj.readHeaders();
            while (csvreaderobj.readRecord())
            {

                String p_testcaseName = csvreaderobj.get("TestcaseName").trim();
                String p_testcaseInstance = csvreaderobj.get("TestcaseInstance").trim();
                if((t_testcaseName.equalsIgnoreCase(p_testcaseName)) && (t_instance == Integer.parseInt(p_testcaseInstance)))
                {
                    for(int i = 1;i<csvreaderobj.getColumnCount()/2+1;i++)
                    {
                        String p_field = csvreaderobj.get("Field"+i).trim();
                        String p_objproperty = csvreaderobj.get("Value"+i).trim();
                        dicttoread.put(p_field, p_objproperty);
                    }
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println("No data present for testname " +t_testcaseName);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (String) dicttoread.get(t_field);
    }

    //method to wait until element is loaded for different interval of time
    public WebElement fluentWait(By locator, int time) throws Exception {

        WebElement r_currentElement = null;
        Wait<WebDriver> p_wait = null;

        try {
            // Waiting for specified no of seconds for an element to be present on the page
            p_wait = new FluentWait<WebDriver>(driver).withTimeout(time, TimeUnit.SECONDS)
                    .pollingEvery(2, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class)
                    .ignoring(StaleElementReferenceException.class);

            r_currentElement = p_wait.until(ExpectedConditions.elementToBeClickable(locator));
            return r_currentElement;
        } catch (Exception e) {
            System.out.println("Waiting for element to display on DOM");
        }
        return r_currentElement;
    }

    //method to halt the thread
    public void fluentWait(int TIME) throws Exception {
        Thread.sleep(TIME);
    }

    //method to click the element
    public void clickElement(By by, String elementName) throws Exception {

        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            Thread.sleep(2000);
            element.click();
        }
    }

    //method to click the link
    public void clickLink(By by, String elementName) throws Exception {

        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            Thread.sleep(2000);
            element.sendKeys(Keys.ENTER);
        }
    }

    //method to move to the particular element
    public void actionBuilder(By by, String elementName)throws Exception{
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().perform();
        }
    }

    String mainWindow;

    //method which returns the window handle
    public void getMainWindowHandle() {
        mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
    }

    //method which returns the set of window handles
    public void getChildWindowHandleAndSwitch() {
        Set<String> myWindowHandles = driver.getWindowHandles();

        for (String myWindowHandle : myWindowHandles) {

            if (!myWindowHandle.equals(mainWindow)) {
                System.out.println(myWindowHandle);
                driver.switchTo().window(myWindowHandle);
            }
        }
    }

    //method to switch to the parent window
    public void switchToParentWindow() {
        driver.switchTo().window(mainWindow);
    }

    //method to click element using java script executor
    public void javascriptClick(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
        }
    }

    //method to clear the textbox
    public void clearTextBox(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.clear();
        }
    }

    //method to switch to frame
    public void SwitchToFrame(String frameName) throws Exception {
        Thread.sleep(5000);
        driver.switchTo().frame(frameName);
    }

    //method to switch to frame without locator
    public void frameWithoutLocator(By by, String elementName) throws Exception {
        WebElement Frame = fluentWait(by, 20);
        if (Frame == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            Thread.sleep(3000);
            driver.switchTo().frame(Frame);
        }
    }

    //method to switch to default content
    public void SwitchTodefaultContent() throws Exception {
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }

    //method to obtain the text
    public String elementGetText(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        String webElementText;
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            webElementText = element.getText();
        }
        return webElementText;
    }

    //method to obtain the get text by ignoring failure
    public String elementGetTextIgnoreFailure(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        String webElementText;
        if (element == null) {
            webElementText="NO Record Found";
        } else {
            webElementText = element.getText();
        }
        return webElementText;
    }


    //method to press ENTER
    public void keyboardEnter(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.click();
            element.sendKeys(Keys.ENTER);
        }
    }

    //method to press SEMICOLON
    public void keyboardSemiColon(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.click();
            element.sendKeys(Keys.SEMICOLON);
        }
    }

    //method to make Key DOWN
    public void keyboardDown(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.click();
            element.sendKeys(Keys.DOWN);
        }
    }

    //method to press TAB
    public void keyboardTab(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.click();
            element.sendKeys(Keys.TAB);
        }
    }

    //method to capture today date
    public String captureTodayDate() throws Exception {
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String todayDate = dateFormat.format(date);

        return todayDate;
    }

    //method to get past date
    public String GetPastDate() throws Exception {
        String formatted = "";
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            Date today = Calendar.getInstance().getTime();
            // Using DateFormat format method we can create a string
            // representation of a date with the defined format.
            String reportDate = df.format(today);
            calendar.setTime(df.parse(reportDate));
            //calendar.
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            formatted = simpleFormat.format(calendar.getTime());
            //System.out.println(formatted);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        return formatted;
    }

    //method to enter value
    public void enterValue(By by, String elementName, String text) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            Thread.sleep(1000);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }

    //method to enter value without clear
    public void enterValueWithoutClear(By by, String elementName, String text) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.click();
            Thread.sleep(1000);
            element.sendKeys(text);
        }
    }

    //method to clear the textbox
    public void textBoxClearClear(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.click();
            element.clear();
        }
    }

    //method to check if element is displayed
    public boolean elementDisplayed(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.isDisplayed();
        }
        return true;
    }

    //method to check if element is dispalyed and it returns boolean value
    public boolean elementNotDisplayedPositiveScenario(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 10);
        if (element == null) {
            return true;
        } else {
            return false;

        }
    }

    //method to scroll down
    public void webPageScrollDown() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
    }

    //method to scroll up
    public void webPageScrollUp() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -250);");
    }

    //method to scroll till bottom
    public void webPageScrollBottom() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
    }

    //method to select dropdown by visible text
    public void selectVisibleText(By by, String elementName, String visibleText) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate drop down text " + elementName);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(visibleText);
        }
    }

    //method to send the visible text
    public void selectVisible(By by, String elementName, String visibleText) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate" + elementName);
        } else {
            element.click();
            element.sendKeys(visibleText);
        }
    }

    //method to select by value
    public void selectByValue(By by, String elementName, String value) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate drop down text " + elementName);
        } else {
            Select dropdown = new Select(element);
            dropdown.selectByValue(value);
        }
    }


    //method to switch to alert
    public void switchToAlert() {
        //driver.switchTo().alert();
        driver.switchTo().activeElement();
    }

    //method to accept the alert
    public void acceptAlert() throws Exception {
        driver.switchTo().alert().accept();
    }

    //method to check if it has elements or not
    public boolean hasElement(By by) {

        return !driver.findElements(by).isEmpty();
    }

    //method to refresh page
    public void refreshPage() throws Exception {
        driver.navigate().refresh();
    }

    //method to check if radio button is selected
    public boolean IsRadioButtonSelected(By by, String elementName) throws Exception {
        WebElement element = fluentWait(by, 20);
        boolean selectValue;
        if (element == null) {
            throw new Exception("Unable to locate drop down text " + elementName);
        } else {
            selectValue = element.isSelected();
        }
        return selectValue;
    }

    //method to format the date
    public String generateRandomNumber() throws Exception {
        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("MMddyyyyHHmmss");
        // Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String reportDate = df.format(today);
        return reportDate;
    }

    //method to get future date
    public String GetFutureDate(int noOfdays) throws Exception {
        String formatted = "";
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            Date today = Calendar.getInstance().getTime();
            // Using DateFormat format method we can create a string
            // representation of a date with the defined format.
            String reportDate = df.format(today);
            calendar.setTime(df.parse(reportDate));
            //calendar.
            calendar.add(Calendar.DAY_OF_MONTH, noOfdays);
            formatted = simpleFormat.format(calendar.getTime());
            //System.out.println(formatted);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
        return formatted;
    }

    //method to select options for radio button
    public void selectOptionInputRadio(String strRadioGroupName, int option) throws Exception {
        List<WebElement> radios = driver.findElements(By.name(strRadioGroupName));
        if (option > 0 && option <= radios.size()) {
            radios.get(option - 1).click();
        } else {
            throw new NotFoundException("option " + option + " not found in Group" + strRadioGroupName);
        }
    }

    //method to switch to alert
    public boolean isAlertPresent() throws Exception {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            return false;
        }
    }

    //method to compare text
    public void compareText(By by, String elementName, String TextToBeCompared) throws Exception {
        WebElement element = fluentWait(by, 20);

        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.click();
            String applicationText = element.getAttribute("value");
            if (applicationText.equalsIgnoreCase(TextToBeCompared)) {
                System.out.println(applicationText+" "+"Applicaton Data  Matched with"+" " + TextToBeCompared);
            } else {
                throw new Exception(applicationText+" "+"Applicaton Data Not Matched with Expected Data"+" " + TextToBeCompared);
            }
        }
    }

    //method to compare selected dropdown text
    public void compareSelectedDropDownText(By by, String elementName, String TextToBeCompared) throws Exception {
        WebElement element = fluentWait(by, 20);

        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            String selectedOption = new Select(element).getFirstSelectedOption().getText();
            String applicationText = element.getText();
            if (selectedOption.equalsIgnoreCase(TextToBeCompared)) {
                System.out.println(applicationText+" "+"Applicaton Data  Matched with"+" " + TextToBeCompared);
            } else {
                throw new Exception(applicationText+" "+"Applicaton Data Not Matched with Expected Data"+" " + TextToBeCompared);
            }
        }
    }

    //method to iterate through table elements
    public int tableIterateClickCell(By by, String text) throws Exception {
        WebElement table = fluentWait(by, 20);
        WebElement previousCell = null;
        int flag = 0;
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        // And iterate over them, getting the cells
        outerloop:
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            for (WebElement cell : cells) {
                if (cell.getText().contains(text)) {

                    previousCell.click();
                    flag = flag + 1;
                    break outerloop;
                }
                previousCell = cell;
            }
        }
        return flag;
    }

    //method to iterate through table and compares the text
    public void  tableIterateVerifyText(By by, String text) throws Exception {
        WebElement table = fluentWait(by, 20);
        WebElement previousCell=null;
        int flag=0;
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        // And iterate over them, getting the cells
        outerloop:
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));

            for (WebElement cell : cells) {
                if (cell.getText().equalsIgnoreCase(text)) {

                    System.out.println("Expected Text Displayed" +" "+text);
                    flag=flag+1;
                    break outerloop;
                }
            }

        }
        if(flag==0)
        {
            throw new Exception("Excepted Text Not Displayed" + text);
        }
    }

    //method to clear the text box
    public void ClearTextBox(By by, String elementName,String text) throws Exception {
        WebElement element = fluentWait(by, 20);
        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            element.click();
            element.clear();
            element.sendKeys(Keys.CONTROL + "a");
            element.sendKeys(Keys.DELETE);
            element.sendKeys(String.valueOf(text));
        }
    }

    //method to set attribute
    public void setAttribute(By by, String elementName,String text) throws Exception {
        WebElement element = fluentWait(by, 20);
        if(element==null){
            throw new Exception("Unable to locate element " + elementName);
        }else{
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
            js.executeScript(scriptSetAttrValue, element, "value", text);
        }
    }

    //method to set attribute
    public void setAttribute(WebElement element, String elementName,String text) throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
        js.executeScript(scriptSetAttrValue, element, "value", text);
    }

    //method to find elements
    public void findParticularElementFromList(By by, int index) throws Exception {
        List<WebElement>  elements=driver.findElements(by);
        WebElement  element=elements.get(index);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
    }

    //method to iterate through table to check if it contains text
    public int  tableIterateVerifyTextReturnRow(By by, String text) throws Exception {
        WebElement table = fluentWait(by, 20);
        int rowCount=0;
        WebElement previousCell=null;
        int flag=0;
        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        // And iterate over them, getting the cells
        outerloop:
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            rowCount= rowCount+1;
            for (WebElement cell : cells) {
                if (cell.getText().contains(text)) {

                    System.out.println("Expected Text Displayed" +" "+text);
                    flag=flag+1;

                    break outerloop;
                }
            }

        }
        if(flag==0)
        {
            throw new Exception("Excepted Text Not Displayed" + text);
        }
        return  rowCount;
    }

    //method to read notepad
    public String ReadNotepad(String PathOfFile) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(PathOfFile));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                //sb.append("");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }

    }

    //method to check if element has text
    public void ElementHasText(By by, String elementName, String textToCheck) throws Exception{
        WebElement element = fluentWait(by, 20);

        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            String applicationText = element.getText();
            if (applicationText.toLowerCase().contains(textToCheck.toLowerCase())) {
                System.out.println(textToCheck+" "+"contains in application Data "+" " + applicationText);
            } else {
                throw new Exception(textToCheck+" "+"does Not contain in application Data "+" " + applicationText);
            }
        }

    }

    //method to check if element has any text
    public void ElementHasAnyText(By by, String elementName) throws Exception{
        WebElement element = fluentWait(by, 20);

        if (element == null) {
            throw new Exception("Unable to locate element " + elementName);
        } else {
            String applicationText = element.getText();
            if (applicationText.length()>0) {
                System.out.println("Application data is present "+" " + applicationText);
            } else {
                throw new Exception("Application data is not present "+" " + applicationText);
            }
        }

    }
}