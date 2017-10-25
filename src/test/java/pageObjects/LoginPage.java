package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends ParentPage {

	private  final By Obj_txt_username	  			= By.xpath("//*[@id=\"login-form\"]/fieldset/label[1]/input");
	private  final By Obj_txt_password	  			= By.xpath("//*[@id=\"login-form\"]/fieldset/label[2]/input");
	private  final By Obj_btn_loginButton	  		= By.xpath("//*[@id=\"login-form\"]/fieldset/button");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void logon(String Username, String Password)throws Exception{
		enterValue(Obj_txt_username,"username text box",Username);
		enterValue(Obj_txt_password,"Password text box",Password);
		clickElement(Obj_btn_loginButton,"Login Button");
	}

}
