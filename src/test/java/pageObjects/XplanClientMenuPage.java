package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XplanClientMenuPage extends ParentPage {

    public XplanClientMenuPage(WebDriver driver) {
        super(driver);
    }


    private  final By Obj_navBtn_FinancialDetails           = By.xpath(".//*[text()='Financial Details']");
    private  final By Obj_navBtn_ClientDetails              = By.xpath(".//*[text()='Client Details']");
    private  final By Obj_lnk_balanceSheet                  = By.xpath(".//*[text()='Balance Sheet']");
    private  final By Obj_lnk_keydetails                    = By.xpath(".//*[text()='Key Details']");
    private  final By Obj_lnk_employment                    = By.xpath(".//*[text()='Employment']");
    private  final By Obj_lnk_contact                       = By.xpath(".//*[text()='Contact']");
    private  final By Obj_lnk_cashflow                      = By.xpath(".//*[text()='Cashflow']");
    private  final By Obj_lnk_servicing                     = By.xpath(".//*[text()='Servicing']");
    private  final By Obj_lnk_referrers                     = By.xpath(".//*[text()='Referrers']");
    private  final By Obj_lnk_categoryandAdvisers           = By.xpath(".//*[text()='Category & Advisers']");

    public void financialDetails() throws Exception {
        clickElement(Obj_navBtn_FinancialDetails,"Financial Details Tab");
    }

    public void balanceSheet() throws Exception {
        clickElement(Obj_lnk_balanceSheet,"Balance sheet link");
    }

    public void keydetails() throws Exception {
        clickElement(Obj_lnk_keydetails,"Key details link");
    }

    public void Employment() throws Exception {
        clickElement(Obj_lnk_employment,"Employment link");
    }

    public void contact() throws Exception {
        clickElement(Obj_lnk_contact,"contact link");
    }

    public void cashflow() throws Exception{
        clickElement(Obj_lnk_cashflow,"Cashflow link");
    }

    public void clientdetails() throws Exception{
        clickElement(Obj_navBtn_ClientDetails,"Client Details link");
    }

    public void Servicing() throws Exception{
        clickElement(Obj_lnk_servicing,"Servicing link");
    }

    public void Referrers() throws Exception{
        clickElement(Obj_lnk_referrers,"Referrers link");
    }

    public void CategoryAdvisers() throws Exception{
        clickElement(Obj_lnk_categoryandAdvisers,"Category and Advisers link");
    }
}
