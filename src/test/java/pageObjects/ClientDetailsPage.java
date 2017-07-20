package pageObjects;

import framework.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by P715762d on 5/06/2017.
 */
public class ClientDetailsPage extends ParentPage {

    public ClientDetailsPage(WebDriver driver) {
        super(driver);
    }

    private final By Obj_btnClientDetailsDirectorEditButton            = By.xpath("html/body/div[1]/table/tbody[1]/tr/td[1]/span[1]");
    private final By Obj_btnClientDetailsCEOEditButton                 = By.xpath("html/body/div[1]/table/tbody[1]/tr/td[1]/span[1]");
    private final By Obj_btn_yourClientDetailsEditButton               = By.id("btn_edit");
    private final By Obj_ddl_ClientDetailTitle	  	                   = By.name("entity:title:0:");
    private final By Obj_ddl_ClientDetailGender                        = By.name("entity:sex:0:");
    private final By Obj_txt_ClientDetailDOB	  	                   = By.name("entity:dob:0:");
    private final By Obj_txt_ClientDetailMaidenName	  	               = By.name("entity:maiden_name:0:");
    private final By Obj_txt_ClientDetailSurName	  	               = By.name("entity:last_name:0:");
    private final By Obj_txt_ClientDetailFirstName	  	               = By.name("entity:first_name:0:");
    private final By Obj_txt_ClientDetailLastPreviousName              = By.name("entity:last_previous_name:0:");
    private final By Obj_txt_ClientDetailSecondName                    = By.name("entity:middle_name:0:");
    private final By Obj_txt_ClientDetailPreferredName                 = By.name("entity:preferred_name:0:");
    private final By Obj_ddl_ClientDetailMaritalStatus                 = By.name("entity:marital_status:0:");
    private final By Obj_ddl_ClientDetailExternalID                    = By.name("entity:external_id:0:");
    private final By Obj_txt_ClientTradingName                         = By.name("entity:trading_name:0:");
    private final By Obj_ddl_ClientDetailCompanyType                   = By.name("entity:company_type:0:");
    private final By Obj_txt_ClientDetailsABN                          = By.name("entity:abn:0:");
    private final By Obj_txt_ClientDetailsCompanyNumber                = By.name("entity:company_number:0:");
    private final By Obj_txt_ClientDetailsDateOfIncorporation          = By.name("entity:dob:0:");
    private final By Obj_ddl_ClientDetailsDirectorPrimaryContactFlag   = By.name("entity:primary_account_contact:0:");
    private final By Obj_txt_ClientDetailsDirectorSurname              = By.name("entity:lname:0:");
    private final By Obj_txt_ClientDetailsDirectorFirstname            = By.name("entity:fname:0:");
    private final By Obj_txt_ClientDetailsDirectorDOB                  = By.name("entity:date_of_birth:0:");
    private final By Obj_txt_ClientDetailsClientComment                = By.name("entity:comment:0:");
    private final By Obj_txt_ClientDetailsPartnerComment               = By.name("entity:comment:1:");
    private final By Obj_txt_ClientDetailsCompanyName                  = By.name("entity:company_name:0:");

    public void yourClientDetailEditButton() throws Exception {
        clickElement(Obj_btn_yourClientDetailsEditButton,"Your Client Details Edit button");
    }

    public void yourClientDetailDirectorEditButton() throws Exception {
        SwitchToFrame("entity_director_custom");
        clickElement(Obj_btnClientDetailsDirectorEditButton,"Your Client Details Director Edit button");
    }

    public void yourClientDetailCEOEditButton() throws Exception {
        SwitchToFrame("keyperson");
        clickElement(Obj_btnClientDetailsCEOEditButton,"Your Client Details CEO Edit button");
    }

    public void yourClientDetailsTitle(String ClientDetailsTitle) throws Exception {
        compareSelectedDropDownText(Obj_ddl_ClientDetailTitle,"Your Client Title",ClientDetailsTitle);
    }

    public void yourClientDetailsGender(String ClientDetailsGender) throws Exception {
        compareSelectedDropDownText(Obj_ddl_ClientDetailGender,"Your Client Gender",ClientDetailsGender);
    }

    public void yourClientDetailsDOB(String ClientDetailsDOB) throws Exception {
        compareText(Obj_txt_ClientDetailDOB,"Your Client Date of Birth",ClientDetailsDOB);
    }

    public void yourClientDetailsMaidenName(String ClientDetailsMaidenName) throws Exception {
        compareText(Obj_txt_ClientDetailMaidenName,"Your Client Maiden Name",ClientDetailsMaidenName);
    }

    public void yourClientDetailsSurName(String ClientDetailsSurName)throws Exception {
        compareText(Obj_txt_ClientDetailSurName,"Your Client SurName",ClientDetailsSurName);
    }

    public void yourClientDetailsFirstName(String ClientDetailsFirstName) throws Exception{
        compareText(Obj_txt_ClientDetailFirstName,"Your Client First name", ClientDetailsFirstName);
    }

    public void yourLastPreviousName(String lastPreviousName) throws Exception{
        compareText(Obj_txt_ClientDetailLastPreviousName,"Your Client Last Previous name", lastPreviousName);
    }

    public void yourSecondName(String secondName) throws Exception{
        compareText(Obj_txt_ClientDetailSecondName,"Your Client Second name", secondName);
    }

    public void yourPreferredName(String preferredName) throws Exception{
        compareText(Obj_txt_ClientDetailPreferredName,"Your Client Preferred name", preferredName);
    }

    public void yourClientDetailsMaritalStatus(String maritalStatus) throws Exception{
        compareSelectedDropDownText(Obj_ddl_ClientDetailMaritalStatus,"Your Client Details Marital Status", maritalStatus);
    }

    public void yourClientDetailsExternalIdentifier(String externalIdentifier) throws Exception{
        compareSelectedDropDownText(Obj_ddl_ClientDetailExternalID,"Your Client Details External Identifier", externalIdentifier);
    }

    public void yourClientDetailsCompanyName(String companyName) throws Exception{
        compareText(Obj_txt_ClientDetailsCompanyName,"Your Client Details Company Name", companyName);
    }

    public void yourClientDetailsTradingName(String tradingName) throws Exception{
        compareText(Obj_txt_ClientTradingName,"Your Client Details Trading name", tradingName);
    }

    public void yourClientDetailsCompanyType(String companyType) throws Exception{
        compareSelectedDropDownText(Obj_ddl_ClientDetailCompanyType,"Your Client Details Company Type", companyType);
    }

    public void yourClientDetailsABN(String abn) throws Exception{
        compareText(Obj_txt_ClientDetailsABN,"Your Client Details ABN", abn);
    }

    public void yourClientDetailsCompanyNumber(String companyNumber) throws Exception{
        compareText(Obj_txt_ClientDetailsCompanyNumber,"Your Client Details Company Number", companyNumber);
    }


    public void yourClientDetailsDateOfIncorporation(String dateOfIncorporation) throws Exception{
        compareText(Obj_txt_ClientDetailsDateOfIncorporation,"Your Client Details Date of Incorporation",dateOfIncorporation);
    }

    public void yourClientDetailDirectorPrimaryContactFlag(String primaryContactFlag) throws Exception{
        compareSelectedDropDownText(Obj_ddl_ClientDetailsDirectorPrimaryContactFlag,"Your Client Details Director Primary Contact Flag",primaryContactFlag);
    }

    public void yourClientDetailDirectorSurname(String surname) throws Exception {
        compareText(Obj_txt_ClientDetailsDirectorSurname,"Your Client Director Surname",surname);
    }

    public void yourClientDetailDirectorFirstname(String firstName) throws Exception {
        compareText(Obj_txt_ClientDetailsDirectorFirstname,"Your Client Director Firstname",firstName);
    }


    public void yourClientDetailDirectorDOB(String dob) throws Exception {
        compareText(Obj_txt_ClientDetailsDirectorDOB,"Your Client Director DOB",dob);
    }

    public void yourClientDetailClientComment(String clientComment) throws Exception{
        compareText(Obj_txt_ClientDetailsClientComment,"Your Client Detail Comment",clientComment);
    }

    public void yourClientDetailPartnerComment(String clientComment) throws Exception{
        compareText(Obj_txt_ClientDetailsPartnerComment,"Your Client Detail Comment",clientComment);
    }

    public String yourClientDetailGetDirectorSurname() throws Exception{
        String name = elementGetText(Obj_txt_ClientDetailsDirectorSurname, "Client Details Director SurName") +" "+ elementGetText(Obj_txt_ClientDetailsDirectorFirstname, "Client Details Director FirstName");
        return name;
    }

     /*
     Client Partner
     */

    private final By Obj_ddl_ClientPartnerDetailTitle	  	          = By.name("entity:title:1:");
    private final By Obj_ddl_ClientPartnerDetailGender                = By.name("entity:sex:1:");
    private final By Obj_txt_ClientPartnerDetailDOB	  	              = By.name("entity:dob:1:");
    private final By Obj_txt_ClientPartnerDetailMaidenName	  	      = By.name("entity:maiden_name:1:");
    private final By Obj_txt_ClientPartnerDetailSurName	  	          = By.name("entity:last_name:1:");
    private final By Obj_txt_ClientPartnerDetailFirstName	  	      = By.name("entity:first_name:1:");
    private final By Obj_txt_ClientPartnerDetailLastPreviousName      = By.name("entity:last_previous_name:1:");
    private final By Obj_txt_ClientPartnerDetailSecondName            = By.name("entity:middle_name:1:");
    private final By Obj_txt_ClientPartnerDetailPreferredName         = By.name("entity:preferred_name:1:");
    private final By Obj_ddl_ClientPartnerDetailMaritalStatus         = By.name("entity:marital_status:1:");
    private final By Obj_ddl_ClientPartnerDetailExternalID            = By.name("entity:external_id:1:");
    private final By Obj_txt_ClientPartnerTradingName                 = By.name("entity:trading_name:1:");
    private final By Obj_ddl_ClientPartnerDetailCompanyType           = By.name("entity:company_type:1:");
    private final By Obj_txt_ClientPartnerDetailsABN                  = By.name("entity:abn:1:");
    private final By Obj_txt_ClientPartnerDetailsCompanyNumber        = By.name("entity:company_number:1:");
    private final By Obj_txt_ClientPartnerDetailsDateOfIncorporation  = By.name("entity:dob:1:");



    public void yourClientPartnerDetailsTitle(String ClientPartnerDetailsTitle) throws Exception {
        if (!elementNotDisplayedPositiveScenario(Obj_ddl_ClientPartnerDetailTitle, "Partner Detail Title")) {
            compareSelectedDropDownText(Obj_ddl_ClientPartnerDetailTitle,"Your ClientPartner Title",ClientPartnerDetailsTitle);
        }
    }

    public void yourClientPartnerDetailsGender(String ClientPartnerDetailsGender) throws Exception {
        if (!elementNotDisplayedPositiveScenario(Obj_ddl_ClientPartnerDetailGender, "Partner Detail Gender")) {
            compareSelectedDropDownText(Obj_ddl_ClientPartnerDetailGender, "Your ClientPartner Gender", ClientPartnerDetailsGender);
        }
    }

    public void yourClientPartnerDetailsDOB(String ClientPartnerDetailsDOB) throws Exception {
        if (!elementNotDisplayedPositiveScenario(Obj_txt_ClientPartnerDetailDOB, "Partner Detail DOB")) {
            compareText(Obj_txt_ClientPartnerDetailDOB, "Your ClientPartner Date of Birth", ClientPartnerDetailsDOB);
        }
    }

    public void yourClientPartnerDetailsMaidenName(String ClientPartnerDetailsMaidenName) throws Exception {
        if (!elementNotDisplayedPositiveScenario(Obj_txt_ClientPartnerDetailMaidenName, "Partner Maiden Name")) {
            compareText(Obj_txt_ClientPartnerDetailMaidenName, "Your ClientPartner Maiden Name", ClientPartnerDetailsMaidenName);
        }
    }

    public void yourClientPartnerDetailsSurName(String ClientPartnerDetailsSurName)throws Exception {
        if (!elementNotDisplayedPositiveScenario(Obj_txt_ClientPartnerDetailSurName, "Partner SurName")) {
            compareText(Obj_txt_ClientPartnerDetailSurName, "Your ClientPartner SurName", ClientPartnerDetailsSurName);
        }
    }

    public void yourClientPartnerDetailsFirstName(String ClientPartnerDetailsFirstName) throws Exception{
        if (!elementNotDisplayedPositiveScenario(Obj_txt_ClientPartnerDetailFirstName, "Partner First Name")) {
            compareText(Obj_txt_ClientPartnerDetailFirstName, "Your ClientPartner First name", ClientPartnerDetailsFirstName);
        }
    }

    public void yourClientPartnerLastPreviousName(String lastPreviousName) throws Exception{
        if (!elementNotDisplayedPositiveScenario(Obj_txt_ClientPartnerDetailLastPreviousName, "Partner Last Previous Name")) {
            compareText(Obj_txt_ClientPartnerDetailLastPreviousName, "Your ClientPartner Last Previous name", lastPreviousName);
        }
    }

    public void yourClientPartnerSecondName(String secondName) throws Exception{
        if (!elementNotDisplayedPositiveScenario(Obj_txt_ClientPartnerDetailSecondName, "Partner Second Name")) {
            compareText(Obj_txt_ClientPartnerDetailSecondName, "Your ClientPartner Second name", secondName);
        }
    }

    public void yourClientPartnerPreferredName(String preferredName) throws Exception{
        if (!elementNotDisplayedPositiveScenario(Obj_txt_ClientPartnerDetailPreferredName, "Partner Preferred Name")) {
            compareText(Obj_txt_ClientPartnerDetailPreferredName, "Your ClientPartner Preferred name", preferredName);
        }
    }

    public void yourClientPartnerDetailsMaritalStatus(String maritalStatus) throws Exception{
        if (!elementNotDisplayedPositiveScenario(Obj_ddl_ClientPartnerDetailMaritalStatus, "Partner Marital Status")) {
            compareSelectedDropDownText(Obj_ddl_ClientPartnerDetailMaritalStatus, "Your ClientPartner Details Marital Status", maritalStatus);
        }
    }

    public void yourClientPartnerDetailsExternalIdentifier(String externalIdentifier) throws Exception{
        if (!elementNotDisplayedPositiveScenario(Obj_ddl_ClientPartnerDetailExternalID, "Partner External Identifier")) {
            compareSelectedDropDownText(Obj_ddl_ClientPartnerDetailExternalID, "Your ClientPartner Details External Identifier", externalIdentifier);
        }
    }

    public void yourClientPartnerDetailsTradingName(String tradingName) throws Exception{
        compareText(Obj_txt_ClientPartnerTradingName,"Your ClientPartner Details Trading name", tradingName);
    }

    public void yourClientPartnerDetailsCompanyType(String companyType) throws Exception{
        compareSelectedDropDownText(Obj_ddl_ClientPartnerDetailCompanyType,"Your ClientPartner Details Company Type", companyType);
    }

    public void yourClientPartnerDetailsABN(String abn) throws Exception{
        compareText(Obj_txt_ClientPartnerDetailsABN,"Your ClientPartner Details ABN", abn);
    }

    public void yourClientPartnerDetailsCompanyNumber(String companyNumber) throws Exception{
        compareText(Obj_txt_ClientPartnerDetailsCompanyNumber,"Your ClientPartner Details Company Number", companyNumber);
    }


    public void yourClientPartnerDetailsDateOfIncorporation(String dateOfIncorporation) throws Exception{
        compareText(Obj_txt_ClientPartnerDetailsDateOfIncorporation,"Your ClientPartner Details Date of Incorporation",dateOfIncorporation);
    }

    /*
    For Trust Client
     */



    private final By Obj_txt_yourTrustClientDetailsExternalIdentifier    =By.name("entity:external_id:0:");
    private final By Obj_txt_yourTrustClientDetailsTrustName             =By.name("entity:trust_name:0:");
    private final By Obj_txt_yourTrustClientDetailsBusinessName          =By.name("entity:business_name:0:");
    private final By Obj_txt_yourTrustClientDetailsCountryEstablishment  =By.name("entity:country_establish:0:");
    private final By Obj_dd1_yourTrustClientDetailsTrustType             =By.name("entity:trust_type:0:");
    private final By Obj_txt_yourTrustClientDetailsTrustNumber           =By.name("entity:trust_number:0:");
    private final By Obj_txt_yourTrustClientDetailsReferenceNumber       =By.name("entity:reference_file_number:0:");
    private final By Obj_txt_yourTrustClientDetailsABN                   =By.name("entity:abn:0:");
    private final By Obj_txt_yourTrustClientDetailsComment               =By.name("entity:comment:0:");

    public void yourTrustClientDetailExternalIdentifier(String trustClientDetailExternalIdentifier) throws Exception{
        compareText(Obj_txt_yourTrustClientDetailsExternalIdentifier,"Your Trust CLient External Identifier",trustClientDetailExternalIdentifier);
    }

    public void yourTrustClientDetailTrustName(String trustClientDetailTrustName) throws Exception{
        compareText(Obj_txt_yourTrustClientDetailsTrustName,"Your Trust CLient Trust Name",trustClientDetailTrustName);
    }

    public void yourTrustClientDetailTrustType(String trustClientDetailTrustType) throws Exception{
        compareSelectedDropDownText(Obj_dd1_yourTrustClientDetailsTrustType,"Your Trust Client Trust Type",trustClientDetailTrustType);
    }

    public void yourTrustClientDetailTrustNumber(String trustClientDetailTrustNumber) throws Exception{
        compareText(Obj_txt_yourTrustClientDetailsTrustNumber,"Your Trust Client Trust Number",trustClientDetailTrustNumber);
    }

    public void yourTrustClientDetailReferenceNumber(String trustClientDetailReferenceNumber) throws Exception{
        compareText(Obj_txt_yourTrustClientDetailsReferenceNumber,"Your Trust CLient External Name",trustClientDetailReferenceNumber);
    }

    public void yourTrustClientDetailABN(String trustClientDetailABN) throws Exception{
        compareText(Obj_txt_yourTrustClientDetailsABN,"Your Trust CLient ABN",trustClientDetailABN);
    }

    public void yourTrustClientDetailCountryEstablishment(String trustClientDetailCountryEstablishment) throws Exception{
        compareText(Obj_txt_yourTrustClientDetailsCountryEstablishment,"Your Trust CLient Country Establishment",trustClientDetailCountryEstablishment);
    }

    public void yourTrustClientDetailBusinessName(String trustClientDetailBusinessName) throws Exception{
        compareText(Obj_txt_yourTrustClientDetailsBusinessName,"Your Trust CLient ABN",trustClientDetailBusinessName);
    }

    public void yourTrustClientDetailComments(String trustClientDetailComments) throws Exception{
        compareText(Obj_txt_yourTrustClientDetailsComment,"Your Trust CLient Comments",trustClientDetailComments);
    }



    /*
    Trustees
     */

    private final By Obj_btn_yourTrusteesDetailEditButton           =By.xpath(".//*[@id='tbody_1']/tr/td[1]/span[1]");
    private final By Obj_btn_yourTrusteesDetailAddButton             =By.name("add_list_entity_trustee_custom");
    private final By Obj_btn_yourClientDetailSaveButton                    =By.id("save_button");
    private final By Obj_dd1_yourTrusteesDetailEntity                =By.id("entitylookup-select-0");
    private final By Obj_txt_yourSearchEntityDetail                  =By.id("entitylookup-search-input");
    private final By Obj_btn_yourSearchEntityButton                  =By.id("entitylookup-search-button");
    private final By Obj_btn_yourSelectEntityButton                  =By.xpath("html/body/div[7]/div[11]/div/button[1]");
    private final By Obj_txt_yourSelectEntity                        =By.xpath("//*[@id='entitylookup-search-result']/tbody/tr/td[1]");
    private final By Obj_txt_yourTrusteeDetailFirstName              =By.name("entity:fname:0:");
    private final By Obj_txt_yourTrusteeDetailSurName                =By.name("entity:lname:0:");
    private final By Obj_txt_yourTrusteeDetailCompanyName            =By.name("entity:companyname:0:");
    private final By Obj_dd1_yourTrusteesDetailTrusteeType           =By.name("entity:trustee_type:0:");
    private final By Obj_txt_yourTrusteeDetailPreferredName          =By.name("entity:preferred_name:0:");
    private final By Obj_txt_yourTrusteeDetailABN                    =By.name("entity:australian_business_number__abn_:0:");
    private final By Obj_txt_yourTrusteeDetailACN                    =By.name("entity:australian_company_number__acn_:0:");
    private final By Obj_txt_yourTrusteeDetailARBN                   =By.name("entity:australian_registered_body_number__arbn_:0:");
    private final By Obj_txt_yourTrusteeDetailDateOfBirth            =By.name("entity:date_of_birth:0:");
    private final By Obj_dd1_yourTrusteeDetailGender                 =By.name("entity:gender:0:");


    public void yourTrusteesDetailEditButton(String trusteeDetailTrusteeType) throws Exception {
        SwitchToFrame("entity_trustee_custom");
        clickElement(Obj_btn_yourTrusteesDetailEditButton, "Your Trustees Detail Edit button");
    }

    public void yourTrusteesDetailAddButton() throws Exception {
        SwitchToFrame("entity_trustee_custom");
        clickElement(Obj_btn_yourTrusteesDetailAddButton, "Your Trustees Detail Add button");
    }

    public void yourTrusteesDetailEntity(String trusteeDetailEntity) throws Exception{
        compareText(Obj_dd1_yourTrusteesDetailEntity,"Your Trustee Detail Entity",trusteeDetailEntity);
    }

    public void clickYourTrusteesDetailEntity() throws Exception{
        clickElement(Obj_dd1_yourTrusteesDetailEntity,"Your Trustee Detail Entity");
    }

    public void yourClientDetailSaveButton() throws Exception{
        clickElement(Obj_btn_yourClientDetailSaveButton,"Your Trustee Detail saved successfully");
    }

    public void yourSearchEntityDetail(String entityDetailName) throws Exception{
        enterValue(Obj_txt_yourSearchEntityDetail,"Search and enter Entity name",entityDetailName);
    }

    public void yourSearchEntityDetailButton() throws Exception{
        clickElement(Obj_btn_yourSearchEntityButton,"Search Entity Detail");
    }

    public void yourSelectEntityDetailButton() throws Exception{
        clickElement(Obj_btn_yourSelectEntityButton,"Select entity  details");
    }

    public void yourChoseEntityDetail() throws Exception{
        clickElement(Obj_txt_yourSelectEntity,"ABC");
    }

    public void yourTrusteesDetailFirstName(String trusteeDetailFirstName) throws Exception{
        compareText(Obj_txt_yourTrusteeDetailFirstName,"Your Trustee Detail First Name",trusteeDetailFirstName);
    }

    public void yourTrusteesDetailSurName(String trusteeDetailSurName) throws Exception{
        compareText(Obj_txt_yourTrusteeDetailSurName,"Your Trustee Detail Sur Name",trusteeDetailSurName);
    }

    public void yourTrusteesDetailCompanyName(String trusteeDetailCompanyName) throws Exception{
        compareText(Obj_txt_yourTrusteeDetailCompanyName,"Your Trustee Detail Company Name",trusteeDetailCompanyName);
    }

    public void yourTrusteesDetailTrusteeType(String trusteeDetailTrusteeType) throws Exception{
        compareSelectedDropDownText(Obj_dd1_yourTrusteesDetailTrusteeType,"Your Trustee Detail Trustee Type",trusteeDetailTrusteeType);
    }

    public void yourTrusteesDetailPreferredName(String trusteeDetailPreferredName) throws Exception{
        compareText(Obj_txt_yourTrusteeDetailPreferredName,"Your Trustee Detail Preferred Name",trusteeDetailPreferredName);
    }

    public void yourTrusteesDetailABN(String trusteeDetailABN) throws Exception{
        compareText(Obj_txt_yourTrusteeDetailABN,"Your Trustee Detail Australia Business Number",trusteeDetailABN);
    }

    public void yourTrusteesDetailACN(String trusteeDetailACN) throws Exception{
        compareText(Obj_txt_yourTrusteeDetailACN,"Your Trustee Detail Australia Company Number",trusteeDetailACN);
    }

    public void yourTrusteesDetailARBN(String trusteeDetailARBN) throws Exception{
        compareText(Obj_txt_yourTrusteeDetailARBN,"Your Trustee Detail Australia Registered Business Number",trusteeDetailARBN);
    }

    public void yourTrusteesDetailDOB(String trusteeDetailDOB) throws Exception{
        compareText(Obj_txt_yourTrusteeDetailDateOfBirth,"Your Trustee Detail Date Of Birth",trusteeDetailDOB);
    }

    public void yourTrusteesDetailGender(String trusteeDetailGender) throws Exception{
        compareSelectedDropDownText(Obj_dd1_yourTrusteeDetailGender,"Your Trustee Detail Gender",trusteeDetailGender);
    }

    public void verifyYourTrusteesDetailFirstName() throws Exception{
        ElementHasAnyText(Obj_txt_yourTrusteeDetailFirstName,"FirstName");
    }

    public void verifyYourTrusteesDetailSurName() throws Exception{
        ElementHasAnyText(Obj_txt_yourTrusteeDetailSurName,"Your Trustee Detail Sur Name");
    }

    public void enterYourTrusteesDetailDOB(String trusteeDetailDOB) throws Exception{
        enterValue(Obj_txt_yourTrusteeDetailDateOfBirth,"Your Trustee Detail Date Of Birth",trusteeDetailDOB);
    }

    public void enterYourTrusteesDetailGender(String trusteeDetailGender) throws Exception{
        selectByValue(Obj_dd1_yourTrusteeDetailGender,"Your Trustee Detail Gender",trusteeDetailGender);
    }


    /*
    Settlors
     */
    private  final By Obj_btn_yourSettlorsDetailEditButton           =By.xpath(".//*[@id='tbody_1']/tr/td[1]/span[1]");
    private  final By Obj_btn_yourSettlorsDetailAddButton           =By.name("add_list_entity_settlor_custom");
    private final By Obj_dd1_yourSettlorsDetailEntity                =By.id("entitylookup-select-0");
    private final By Obj_txt_yourSettlorsDetailFirstName              =By.name("entity:fname:0:");
    private final By Obj_txt_yourSettlorsDetailSurName                =By.name("entity:lname:0:");
    private final By Obj_txt_yourSettlorsDetailCompanyName            =By.name("entity:companyname:0:");
    private final By Obj_txt_yourSettlorsDetailPreferredName          =By.name("entity:preferred_name:0:");


    public void yourSettlorsDetailEditButton() throws Exception {
        SwitchToFrame("entity_settlor_custom");
        clickElement(Obj_btn_yourSettlorsDetailEditButton, "Your Settlor Detail Edit button");
    }

    public void yourSettlorsDetailAddButton() throws Exception {
        SwitchToFrame("entity_settlor_custom");
        clickElement(Obj_btn_yourSettlorsDetailAddButton, "Your Settlor Detail Add button");
    }

    public void yourSettlorsDetailEntity(String settlorsDetailEntity) throws Exception{
        compareSelectedDropDownText(Obj_dd1_yourSettlorsDetailEntity,"Your Settlors Detail Entity",settlorsDetailEntity);
    }

    public void clickYourSettlorsDetailEntity() throws Exception{
        clickElement(Obj_dd1_yourSettlorsDetailEntity, "Your Settlor Detail Entity");
    }

    public void yourSettlorsDetailFirstName(String settlorsDetailFirstName) throws Exception{
        compareText(Obj_txt_yourSettlorsDetailFirstName,"Your Settlors Detail First Name",settlorsDetailFirstName);
    }

    public void yourSettlorsDetailSurName(String settlorsDetailSurName) throws Exception{
        compareText(Obj_txt_yourSettlorsDetailSurName,"Your Settlors Detail Sur Name",settlorsDetailSurName);
    }

    public void yourSettlorsDetailCompanyName(String settlorsDetailCompanyName) throws Exception{
        compareText(Obj_txt_yourSettlorsDetailCompanyName,"Your Settlors Detail Company Name",settlorsDetailCompanyName);
    }

    public void yourSettlorsDetailPreferredName(String settlorsDetailPreferredName) throws Exception{
        compareText(Obj_txt_yourSettlorsDetailPreferredName,"Your Settlors Detail Preferred Name",settlorsDetailPreferredName);
    }

    public void verifyYourSettlorsDetailFirstName() throws Exception{
        ElementHasAnyText(Obj_txt_yourSettlorsDetailFirstName,"Your Settlors Detail First Name");
    }

    public void verifyYourSettlorsDetailSurName() throws Exception{
        ElementHasAnyText(Obj_txt_yourSettlorsDetailSurName,"Your Settlors Detail Sur Name");
    }

    /*
    Beneficiary
     */
    private  final By Obj_btn_yourBeneficiaryDetailEditButton           =By.xpath(".//*[@id='tbody_1']/tr/td[1]/span[1]");
    private  final By Obj_btn_yourBeneficiaryDetailAddButton            =By.name("add_list_entity_beneficiary_custom");
    private final By Obj_dd1_yourBeneficiaryDetailEntity                =By.id("entitylookup-select-0");
    private final By Obj_txt_yourBeneficiaryDetailFirstName              =By.name("entity:fname:0:");
    private final By Obj_txt_yourBeneficiaryDetailSurName                =By.name("entity:lname:0:");
    private final By Obj_txt_yourBeneficiaryDetailCompanyName            =By.name("entity:companyname:0:");
    private final By Obj_txt_yourBeneficiaryDetailPreferredName          =By.name("entity:preferred_name:0:");
    private final By Obj_txt_yourBeneficiaryDetailDateOfBirth            =By.name("entity:date_of_birth:0:");


    public void yourBeneficiaryDetailEditButton() throws Exception {
        SwitchToFrame("entity_beneficiary_custom");
        clickElement(Obj_btn_yourBeneficiaryDetailEditButton, "Your Beneficiary Detail Edit button");
    }

    public void yourBeneficiaryDetailAddButton() throws Exception {
        SwitchToFrame("entity_beneficiary_custom");
        clickElement(Obj_btn_yourBeneficiaryDetailAddButton, "Your Beneficiary Detail Add button");
    }

    public void clickYourBeneficiaryDetailEntity() throws Exception{
        clickElement(Obj_dd1_yourBeneficiaryDetailEntity,"Your Beneificary Detail Entity");
    }

    public void yourBeneficiaryDetailFirstName(String BeneficiaryDetailFirstName) throws Exception{
        compareText(Obj_txt_yourBeneficiaryDetailFirstName,"Your Beneficiary Detail First Name",BeneficiaryDetailFirstName);
    }

    public void yourBeneficiaryDetailSurName(String BeneficiaryDetailSurName) throws Exception{
        compareText(Obj_txt_yourBeneficiaryDetailSurName,"Your Beneficiary Detail Sur Name",BeneficiaryDetailSurName);
    }

    public void yourBeneficiaryDetailCompanyName(String BeneficiaryDetailCompanyName) throws Exception{
        compareText(Obj_txt_yourBeneficiaryDetailCompanyName,"Your Beneficiary Detail Company Name",BeneficiaryDetailCompanyName);
    }

    public void yourBeneficiaryDetailPreferredName(String BeneficiaryDetailPreferredName) throws Exception{
        compareText(Obj_txt_yourBeneficiaryDetailPreferredName,"Your Beneficiary Detail Preferred Name",BeneficiaryDetailPreferredName);
    }

    public void yourBeneficiaryDetailDOB(String BeneficiaryDetailDOB) throws Exception{
        compareText(Obj_txt_yourBeneficiaryDetailDateOfBirth,"Your Beneficiary Detail Date Of Birth",BeneficiaryDetailDOB);
    }

    public void verifyYourBeneficiaryDetailFirstName() throws Exception{
        ElementHasAnyText(Obj_txt_yourBeneficiaryDetailFirstName,"Your Beneficiary Detail First Name");
    }

    public void verifyYourBeneficiaryDetailSurName() throws Exception{
        ElementHasAnyText(Obj_txt_yourBeneficiaryDetailSurName,"Your Beneficiary Detail Sur Name");
    }

    public void enterYourBeneficiaryDetailDOB(String BeneficiaryDetailDOB) throws Exception{
        enterValue(Obj_txt_yourBeneficiaryDetailDateOfBirth,"Your Beneficiary Detail Date Of Birth",BeneficiaryDetailDOB);
    }

    /*
    Beneficial Owner
    */


    private final By Obj_btn_yourBeneficialOwnerDetailEditButton             =By.xpath(".//*[@id='tbody_1']/tr/td[1]/span[1]");
    private final By Obj_btn_yourBeneficialOwnerDetailAddButton             =By.name("add_list_entity_beneficial_owners_custom");
    private final By Obj_dd1_yourBeneficialOwnerDetailEntity                 =By.id("entitylookup-select-0");
    private final By Obj_txt_yourBeneficialOwnerDetailFirstName              =By.name("entity:fname:0:");
    private final By Obj_txt_yourBeneficialOwnerDetailSurName                =By.name("entity:lname:0:");

    public void yourBeneficialOwnerDetailEditButton() throws Exception {
        SwitchToFrame("entity_beneficial_owners_custom");
        clickElement(Obj_btn_yourBeneficialOwnerDetailEditButton, "Your Beneficial Owner Detail Edit button");
    }

    public void yourBeneficialOwnerDetailAddButton() throws Exception {
       // SwitchToFrame("entity_beneficial_owners_custom");
        clickLink(Obj_btn_yourBeneficialOwnerDetailAddButton, "Your Beneficial Owner Detail Add button");
    }

    public void clickYourBeneficialOwnerDetailEntity() throws Exception{
        clickElement(Obj_dd1_yourBeneficialOwnerDetailEntity,"Your Beneificial Owner Detail Entity");
    }

    public void yourBeneficialOwnerDetailFirstName(String BeneficialOwnerDetailFirstName) throws Exception{
        compareText(Obj_txt_yourBeneficialOwnerDetailFirstName,"Your Beneficial Owner Detail First Name",BeneficialOwnerDetailFirstName);
    }

    public void yourBeneficialOwnerDetailSurName(String BeneficialOwnerDetailSurName) throws Exception{
        compareText(Obj_txt_yourBeneficialOwnerDetailSurName,"Your Benficial Owner Detail Sur Name",BeneficialOwnerDetailSurName);
    }

    public void verifyYourBeneficialOwnerDetailFirstName() throws Exception{
        ElementHasAnyText(Obj_txt_yourBeneficialOwnerDetailFirstName,"Your Beneficial Owner Detail First Name");
    }

    public void verifyYourBeneficialOwnerDetailSurName() throws Exception{
        ElementHasAnyText(Obj_txt_yourBeneficialOwnerDetailSurName,"Your Beneficial Owner Detail Sur Name");
    }

    /*
    Membership Classes
    */

    private final By Obj_txt_yourMembershipClasses             =By.name("entity:membershipclass:0:");

    public void yourMembershipClasses(String MembershipClass) throws Exception{

        compareText(Obj_txt_yourMembershipClasses,"Your Client Membership Class",MembershipClass);
    }

}
