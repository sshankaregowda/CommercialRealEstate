package pageObjects;

import framework.DSL;
import org.openqa.selenium.WebDriver;

/*
* Filename      	             Created By       Date
* DataDrivenPage.java            Shruthi          05/11/2017
*
* Java class containing method to obtain data from csv sheet
*/
public class DataDrivenPage extends DSL {

    public DataDrivenPage(WebDriver driver) {
        super(driver);
    }

    //method to obtain data from csv sheet
    public String driveData(String Module,String Field) throws Exception{
        String Data=getData(Module,Field,1);
        return Data;
    }
}
