package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommercialRealEstateHomePage extends ParentPage {

    private  final By Obj_tab_Property	  			= By.xpath("/html/body/div[4]/div/ul/li[1]/a");
    private  final By Obj_wbe_Property	  			= By.xpath("//*[@id=\"home-index\"]/section[1]/div[2]/div/h1");

    private  final By Obj_tab_BusinessForSale	    = By.xpath("/html/body/div[4]/div/ul/li[2]/a");
    private  final By Obj_wbe_BusinessForSale	    = By.xpath("//*[@id=\"bf-app\"]/div/div[2]/div[2]/div[1]/div");

    private  final By Obj_tab_Franchise	  		    = By.xpath("//*[@id=\"bf-app\"]/div/header/div[2]/ul/li[3]/a");
    private  final By Obj_wbe_Franchise	  		    = By.xpath("//*[@id=\"bf-app\"]/div/div[2]/div[2]/div[1]/h1");


    public CommercialRealEstateHomePage(WebDriver driver) {
        super(driver);
    }

    public void property() throws Exception{
        Thread.sleep(2000);
        clickElement(Obj_tab_Property,"property Tab");
        elementDisplayed(Obj_wbe_Property,"property Page");
    }

    public void BusinessForSale() throws Exception{
        Thread.sleep(2000);
        clickElement(Obj_tab_BusinessForSale,"BusinessForSale Tab");
        elementDisplayed(Obj_wbe_BusinessForSale,"BusinessForSale Page");
    }

    public void Franchise() throws Exception{
        Thread.sleep(2000);
        clickElement(Obj_tab_Franchise,"Franchise Tab");
        elementDisplayed(Obj_wbe_Franchise,"Franchise Page");
    }

}