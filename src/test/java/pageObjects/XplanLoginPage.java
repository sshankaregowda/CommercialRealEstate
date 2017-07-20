package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class XplanLoginPage extends ParentPage {

	private  final By Obj_txt_username	  			= By.name("userid");
	private  final By Obj_txt_password	  			= By.name("passwd");
	private  final By Obj_btn_loginButton	  		= By.id("btn_login");
	private  final By Obj_msg_duplicateLoginMessage = By.id("duplicate_login_message");

	public XplanLoginPage(WebDriver driver) {
		super(driver);
	}

	public void logonXplan(String Username, String Password)throws Exception{
		enterValue(Obj_txt_username,"username text box",Username);
		enterValue(Obj_txt_password,"Password text box",Password);
		clickElement(Obj_btn_loginButton,"Login Button");
	}

	public void logonXplan1()throws Exception{
		enterValue(Obj_txt_username,"username text box","test3.auto");
		enterValue(Obj_txt_password,"Password text box","Password1");
		clickElement(Obj_btn_loginButton,"Login Button");
	}

	public void duplicateLoginMessage(String Password) throws Exception {
		WebElement element =fluentWait(Obj_msg_duplicateLoginMessage,5);
		if(element!=null){
			enterValue(Obj_txt_password,"Password text box",Password);
			clickElement(Obj_btn_loginButton,"Login Button");
		}
	}
}
