package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by p715762d on 9/11/2016.
 */
public class XplanHomePage extends ParentPage {

    private  final By Obj_img_HomePageLogo	  	= By.id("mf-toplogo");
    private  final By Obj_lst_searchSelect	  	= By.id("mfts-select");
    private  final By Obj_txt_searchBox	  		= By.name("q");
    private  final By Obj_lst_selectClient	  	= By.xpath("//*[@id=\"popupdiv-0\"]/div/ul/li[1]/button");
    private  final By Obj_lk_logout	  			= By.id("mfts-logout");
    private  final By Obj_tbl_searchResults	  	= By.xpath("//*[@id=\"list_table\"]/tbody[1]/tr/td[3]/a");
    public XplanHomePage(WebDriver driver) {
        super(driver);
    }

    public void mlcLogo() throws Exception {
        elementDisplayed(Obj_img_HomePageLogo,"Home Page logo image");
    }
    public void VerifyHomePage() throws Exception {
        elementDisplayed(Obj_img_HomePageLogo,"Home Page logo image");
    }

    public void logout() throws Exception {
        clickElement(Obj_lk_logout,"logout Link");
    }

    public void topSearchList() throws Exception {
        clickElement(Obj_lst_searchSelect,"top search list down arrow button");
        clickElement(Obj_lst_selectClient,"top search list Client");
    }

    public void topSearchBox(String CLientSurname) throws Exception {
        enterValue(Obj_txt_searchBox,"top search box",CLientSurname);
        keyboardEnter(Obj_txt_searchBox,"top search box");
    }

    public void searchResult() throws Exception{
        SwitchTodefaultContent();
        SwitchToFrame("search_frame");
        clickLink(Obj_tbl_searchResults,"select client link in serach results table");
        SwitchTodefaultContent();
    }
}
