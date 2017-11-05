package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
* Filename      	                           Created By       Date
* CommercialRealEstateHomePage.java            Shruthi          05/11/2017
*
* Java class containing page objects and operations on those page objects
*/


public class CommercialRealEstateHomePage extends ParentPage {

    private final By propertytab = By.xpath(".//div[@class='top-nav__menu']/ul/li/a[contains(text(),'Property')]");
    private final By propertySearchBox = By.xpath(".//span[@class='search-box__placeholder']");

    private final By businessForSaleTab = By.xpath(".//div[@class='top-nav__menu']/ul/li/a[contains(text(),'Business for Sale')]");
    private final By businessPageHeadline = By.xpath(".//div[@class='business-home__headline']");

    private final By franchiseTab = By.xpath(".//div[@class='nav-bar has-no-bottom-line']/ul/li/a[contains(text(),'Franchise')]");
    private final By franchiseSearchButton = By.xpath(".//button[@class='touchable search-filters__search-button']");

    private final By newsTab = By.xpath(".//div[@class='nav-bar has-no-bottom-line']/ul/li/a[contains(text(),'News')]");
    private final By newsPageSubscribeLink = By.xpath(".//div[@class='subscribe']");


    public CommercialRealEstateHomePage(WebDriver driver) {
        super(driver);
    }

    //method to click property tab
    public Boolean property() throws Exception{
        clickElement(propertytab,"property Tab");
        return elementDisplayed(propertySearchBox,"property Page search box");
    }

    //method to click business for sale tab
    public String BusinessForSale() throws Exception{
        clickElement(businessForSaleTab,"BusinessForSale Tab");
         return elementGetText(businessPageHeadline,"BusinessForSale Page Headline");
    }

    //method to click franchise tab
    public Boolean Franchise() throws Exception{
        clickElement(franchiseTab,"Franchise Tab");
        return elementDisplayed(franchiseSearchButton,"Franchise Page Search Button");
    }

    //method to click news tab
    public Boolean News() throws Exception{
        clickElement(newsTab,"News Tab");
        return elementDisplayed(newsPageSubscribeLink, " Subscribe Link");
    }

}