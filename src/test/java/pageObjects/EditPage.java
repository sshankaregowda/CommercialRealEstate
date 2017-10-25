package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage extends ParentPage {

    public EditPage(WebDriver driver) {
        super(driver);
    }

    private  final By Obj_wbe_selectClient	  	= By.xpath("//*[@id=\"employee-list\"]/li[1]");
    private  final By Obj_txt_firstName	  		= By.xpath("/html/body/div/div/div/form/fieldset/label[1]/input");
    private  final By Obj_txt_LastName	  		= By.xpath("/html/body/div/div/div/form/fieldset/label[2]/input");
    private  final By Obj_txt_startDate	  		= By.xpath("/html/body/div/div/div/form/fieldset/label[3]/input");
    private  final By Obj_txt_Email	  		    = By.xpath("/html/body/div/div/div/form/fieldset/label[4]/input");
    private  final By Obj_btn_update	  		= By.xpath("/html/body/div/div/div/form/fieldset/div/button[1]");

    public void selectClient()throws Exception{
        clickElement(Obj_wbe_selectClient,"Select Client From List");
    }

    public void keyInUpdateDetails(String firstName, String lastName,String startName,String Email)throws Exception{
        enterValue(Obj_txt_firstName,"first name text box",firstName);
        enterValue(Obj_txt_LastName,"last name text box",lastName);
        enterValue(Obj_txt_startDate,"start date text box",startName);
        enterValue(Obj_txt_Email,"EMAIL text box",Email);
        clickElement(Obj_btn_update,"Add Button");
    }
}
