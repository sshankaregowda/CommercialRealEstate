package pageObjects;

import framework.DSL;
import org.openqa.selenium.WebDriver;

/**
 * Created by P737084 on 1/06/2017.
 */
public class DataDrivenPage extends DSL {

    public DataDrivenPage(WebDriver driver) {
        super(driver);
    }

    public String driveData(String Module,String Field) throws Exception{
        String Data=getData(Module,Field,1);
        return Data;
    }
}
