package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePage extends ParentPage {

    public DeletePage(WebDriver driver) {
        super(driver);
    }

    private  final By Obj_wbe_selectClient	  	= By.xpath("//*[@id=\"employee-list\"]/li[1]");
    private  final By Obj_btn_deleteButton	  		= By.xpath("//*[@id=\"bDelete\"]");

    public void selectClient()throws Exception{
        clickElement(Obj_wbe_selectClient,"Select Client From List");
    }


    public void deleteCustomer()throws Exception{
        clickElement(Obj_btn_deleteButton,"Add Button");
        acceptAlert();
    }
}
