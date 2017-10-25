package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage {

    private  final By Obj_btn_Create	  		= By.id("bAdd");
    private  final By Obj_btn_edit	  			= By.id("bEdit");
    private  final By Obj_btn_delete	  		= By.id("bDelete");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void create()throws Exception{
        clickElement(Obj_btn_Create,"create Button");
    }

    public void edit()throws Exception{
        clickElement(Obj_btn_edit,"edit Button");
    }

    public void delet()throws Exception{
        clickElement(Obj_btn_delete,"delete Button");
    }

}
