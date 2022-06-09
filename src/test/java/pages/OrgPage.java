package pages;

import config.extent_reports.ExtentReportsSetUp;
import org.openqa.selenium.By;
import pages.Records.ActionsPage;
import pages.Records.StudentStatusPage;

import java.util.HashMap;

public class OrgPage extends BasePage{
    public static final String HEADER_RECORD_STATUS_ELEMENT = "orgHeaderRecordStatusButton";
    public static final String HEADER_OK_TO_CONTACT_ELEMENT = "personHeaderContactButton";
    public static final String HEADER_ORG_CATEGORY_ELEMENT = "orgHeaderCategoryButton";
    public static final String DATATABLE_EMPTY = "organizationManagerTable_row_0_col_0";
    public static final String WHO_ADDED_ID_DROPDOWN_LIST = "#select2-drop";
    public static final String ORG_ACTION_COMMENTS_FIELD = "org_action_comments";
    public static final String EMAIL_OPT_DROP_DOWN = "#entity_email_0_org_opt_in_method_id_toggle";
    private static final String EMAIL_ADDRESS_FIELD = "#entity_email_0_org_email_address";
    private static final String EMAIL_TYPE_DROP_DOWN = "#entity_email_0_org_email_type_toggle";
    private static final String EMAIL_TYPE_DROP_DOWN_LIST = "#entity_email_0_org_email_type_dropdown_menu";
    private static final String EMAIL_OPT_DROP_DOWN_LIST = "#entity_email_0_org_opt_in_method_id_dropdown_menu";
    private static final String ORG_BASIC_SAVE_CHANGES_BUTTON = "saveChangesBtnOrgContact";
    private static final String ORGANIZATION_NAME_FIELD = "#org_name_0_org_name_formal";
    private static final String TYPE_DROPDOWN = "#select2-chosen-6";
    private static final String TYPE_DROPDOWN_LIST = "#select2-drop";
    private static final String ID_NUMBER_FIELD = "#entity_external_id_0_org_id_number";
    private static final String ID_RECORDED_DATE_FIELD = "#entity_external_id_0_org_id_date";
    private static final String WHO_ADDED_ID_DROPDOWN = "#select2-chosen-7";
    private static final String COMMENTS_FIELD = "#entity_external_id_0_org_id_comments";
    private static final String PLUS_BUTTON_EXTERNAL_ID = "//*[@id='entity_external_id_0_add']";
    private static final String SAVE_CHANGES_BTN_ORG_ID_TYPES = "saveChangesBtnOrgIdTypes";
    private static final String ORG_STATUS_SAVE_CHANGES_BUTTON = "saveChangesBtnOrgStatus";
    private static final String ORG_HEADER_DELETE_BUTTON = "orgHeaderDeleteButton";
    private static final String DELETE_ORG_MODAL_DELETE_BUTTON = "modalSubmitButtondeleteOrganizationConfirm";
    private static final String ORGANIZATION_MANAGER_TABLE = "organizationManagerTable";
    private static final String ORGANIZATION_MANAGER_TABLE_SEARCH_FIELD = "#organizationManagerTableControlsTableSearch";
    private static final String HEADER_ORG_ID_DISPLAY = "descriptionObjectOrgIdValue";
    private static final String SUMMARY_FIELD_DROPDOWN = "s2id_summaryFieldPickerEntityType2";
    private static final String SUMMARY_FIELD_DROPDOWN_LIST = "#select2-results-3";
    private static final String SUMMARY_DISPLAY_ORG_INFORMAL_NAME = "//*[@for='summaryPanelField_520']";
    private static final String SUMMARY_DISPLAY_ORG_PHONE_NUMBER = "//*[@for='summaryPanelField_368']";
    private static final String SUMMARY_DISPLAY_ORG_PHONE_TIME_ZONE = "//*[@for='summaryPanelField_509']";
    private static final String SUMMARY_DISPLAY_ORG_FIREWORKS_ID = "//*[@for='summaryPanelField_436']";
    private static final String SUMMARY_DISPLAY_ORG_INFORMAL_NAME_DELETE_BUTTON = "//div[@id='summaryPanelFieldBlock_520']/div[2]/div/div/button";
    private static final String SUMMARY_DISPLAY_ORG_PHONE_NUMBER_DELETE_BUTTON = "//div[@id='summaryPanelFieldBlock_368']/div[2]/div/div/button";
    private static final String SUMMARY_DISPLAY_ORG_PHONE_TIME_ZONE_DELETE_BUTTON = "//div[@id='summaryPanelFieldBlock_509']/div[2]/div/div/button";
    private static final String SUMMARY_DISPLAY_ORG_FIREWORKS_ID_DELETE_BUTTON = "//div[@id='summaryPanelFieldBlock_436']/div[2]/div/div/button";
    private static final String ORG_ACTION_CATEGORY_DROPDOWN = "s2id_org_action_category_id";
    private static final String ORG_ACTION_DROPDOWN = "s2id_org_action_id";
    private static final String ORG_ACTION_STAFF_DROPDOWN = "s2id_org_action_staff";
    private static final String ORG_ACTION_DATE_FIELD = "#org_action_date";
    private static final String CREATE_ACTION_PANEL_TITLE = "div#actions span.panel-title.responsive-pull-left";
    private static final String ACTION_STAFF_DROPDOWN = "div#s2id_org_action_staff.select2-container.form-control.select2.required a.select2-choice";
    private static final String ACTION_DATE_FIELD = "#org_action_date";
    private static final String ACTION_COMMENTS_FIELD = "#org_action_comments";
    private static final String ACTION_CATEGORY_DROPDOWN = "div#s2id_org_action_category_id.select2-container.form-control.parentSelect.select2.required a.select2-choice";
    private static final String ACTION_DROPDOWN = "div#s2id_org_action_id.select2-container.form-control.childSelect.select2.required a.select2-choice";
    private static final String ACTION_TYPE_DISABLED_DROPDOWN = "div#s2id_org_action_type_id.select2-container.form-control.actionTypeIdSelector.select2.select2-container-disabled a.select2-choice";
    private static final String ACTION_VISIBILITY_DISABLED_DROPDOWN = "div#s2id_org_action_visibility_id.select2-container.form-control.actionVisibilityIdSelector.select2.select2-container-disabled a.select2-choice";
    private static final String BASIC_ORG_ROLE_DROPDOWN = "div#s2id_org_role.select2-container.form-control.select2.required a.select2-choice";
    private static final String BASIC_ORG_TYPE_DROPDOWN = "div#s2id_org_type.select2-container.form-control.select2 a.select2-choice";
    private static final String BASIC_ORG_WEBSITE_FIELD = "#org_website";
    private static final String BASIC_PRIMARY_CONTACT_PICK_BUTTON = "#recordPickerTrigger_0";
    private static final String PERSON_PICKER_MODAL_SEARCH_FIELD = "#personPickerModalTableControlsTableSearch";
    private static final String PERSON_PICKER_MODAL_ROW1_LAST_NAME = "#personPickerModalTable_row_0_col_1_link_0";
    private static final String PERSON_PICKER_MODAL_ROW1_CHECKBOX = "#personPickerModalTable_row_0_col_0 div.checkbox.checkbox-primary-color input.rowSelectCheckbox";
    private static final String BASIC_ORG_TIME_ZONE_DROPDOWN = "div#s2id_org_time_zone.select2-container.form-control.select2 a.select2-choice";
    private static final String BASIC_ORG_ASSIGNED_COUNSELOR_DROPDOWN = "div#s2id_org_assigned_counselor.select2-container.form-control.select2 a.select2-choice";
    private static final String BASIC_SAVE_CHANGES_BUTTON_FOR_ORGANIZATION = "saveChangesBtnOrgBasic";

    private static String statusPlusSignElement(String index){
        return String.format("#org_status_%s_add",index);
    }
    private static String orgStatusStatusDropdown(String index){
        return String.format("#s2id_org_status_%s_org_status_value",index);
    }
    private static String orgStatusStatusDate(String index){
        return String.format("#org_status_%s_org_status_date",index);
    }
    private static String orgStatusStatusComments(String index){
        return String.format("#org_status_%s_org_status_comments",index);
    }

    public static void verifyBasicContextValues(String orgTimeZone,String assignedCounselor){
        try {
            int verifyBasicIdentificationValuesDelay = 20;
            boolean orgTimeZoneValidation = false;
            boolean assignedCounselorValidation = false;
            scrollToElement(By.cssSelector(BASIC_ORG_WEBSITE_FIELD));
            String orgTimeZoneText = getText(By.cssSelector(BASIC_ORG_TIME_ZONE_DROPDOWN));
            String assignedCounselorText = getText(By.cssSelector(BASIC_ORG_ASSIGNED_COUNSELOR_DROPDOWN));

            if(orgTimeZone!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_ROLE_DROPDOWN),verifyBasicIdentificationValuesDelay);
                orgTimeZoneValidation = orgTimeZoneText.equals(orgTimeZone);
            }else{
                orgTimeZoneValidation=true;
            }
            if(assignedCounselor!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_ASSIGNED_COUNSELOR_DROPDOWN),verifyBasicIdentificationValuesDelay);
                assignedCounselorValidation = assignedCounselorText.equals(assignedCounselor);
            }else{
                assignedCounselorValidation=true;
            }
            if(orgTimeZoneValidation && assignedCounselorValidation){
                ExtentReportsSetUp.testingPass(LogPage.VERIFY_BASIC_CONTEXT_VALUES_PASS);
            }else{
                FailureDelegatePage.handlePageException(LogPage.VERIFY_BASIC_CONTEXT_VALUES_PASS);
            }
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.VERIFY_BASIC_CONTEXT_VALUES_FAIL);
        }
    }
    public static void verifyBasicIdentificationValues(String role,String orgType,String website,String primaryContact){
        try {
            int verifyBasicIdentificationValuesDelay = 20;
            boolean roleValidation = false;
            boolean orgTypeValidation = false;
            boolean websiteValidation = false;
            boolean primaryContactValidation = false;

            String roleText = getText(By.cssSelector(BASIC_ORG_ROLE_DROPDOWN));
            String orgTypeText = getText(By.cssSelector(BASIC_ORG_TYPE_DROPDOWN));
            String websiteText = getAtribute(By.cssSelector(BASIC_ORG_WEBSITE_FIELD),"value");
            String primaryContactText = getText(By.cssSelector(BASIC_PRIMARY_CONTACT_PICK_BUTTON));

            if(role!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_ROLE_DROPDOWN),verifyBasicIdentificationValuesDelay);
                roleValidation = roleText.equals(role);
            }else{
                roleValidation=true;
            }
            if(orgType!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_TYPE_DROPDOWN),verifyBasicIdentificationValuesDelay);
                orgTypeValidation = orgTypeText.equals(orgType);
            }else{
                orgTypeValidation=true;
            }
            if(website!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_WEBSITE_FIELD),verifyBasicIdentificationValuesDelay);
                websiteValidation = websiteText.equals(website);
            }else{
                websiteValidation=true;
            }
            if(primaryContact!=""){
                waitElementBy(By.cssSelector(BASIC_PRIMARY_CONTACT_PICK_BUTTON),verifyBasicIdentificationValuesDelay);
                primaryContactValidation = primaryContactText.equals(primaryContact);
            }else{
                primaryContactValidation=true;
            }
            if(roleValidation && orgTypeValidation && websiteValidation && primaryContactValidation){
                ExtentReportsSetUp.testingPass(LogPage.VERIFY_BASIC_IDENTIFICATION_VALUES_PASS);
            }else{
                FailureDelegatePage.handlePageException(LogPage.VERIFY_BASIC_IDENTIFICATION_VALUES_FAIL);
            }
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.VERIFY_BASIC_IDENTIFICATION_VALUES_FAIL);
        }
    }
    public static void basicSaveChangesButtonForOrganization(){
        try {
            waitElementBy(By.id(BASIC_SAVE_CHANGES_BUTTON_FOR_ORGANIZATION),20);
            scrollToTheBottom();
            BasePage.click(By.id(BASIC_SAVE_CHANGES_BUTTON_FOR_ORGANIZATION));
            ExtentReportsSetUp.testingPass(LogPage.SAVE_CHANGES_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.SAVE_CHANGES_FAIL);
        }
    }
    public static void updateBasicContextValues(String orgTimeZone,String assignedCounselor){
        try {
            if(orgTimeZone!=""){
                scrollToElement(By.cssSelector(BASIC_ORG_WEBSITE_FIELD));
                waitElementBy(By.cssSelector(BASIC_ORG_TIME_ZONE_DROPDOWN),20);
                BasePage.click(By.cssSelector(BASIC_ORG_TIME_ZONE_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(StudentStatusPage.CHECKBOX_LIST), "a");
                wait(1000);
                clickOnListOfElements(orgTimeZone);
            }
            if(assignedCounselor!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_ASSIGNED_COUNSELOR_DROPDOWN),20);
                BasePage.click(By.cssSelector(BASIC_ORG_ASSIGNED_COUNSELOR_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(StudentStatusPage.CHECKBOX_LIST), "a");
                wait(1000);
                clickOnListOfElements(assignedCounselor);
            }
            ExtentReportsSetUp.testingPass(LogPage.UPDATE_BASIC_CONTEXT_VALUES_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.UPDATE_BASIC_CONTEXT_VALUES_FAIL);
        }
    }
    public static void updateBasicIdentificationValues(String role,String orgType,String website,String primaryContact){
        int updateBasicIdentificationValuesDelay=20;
        try {
            if(role!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_ROLE_DROPDOWN),updateBasicIdentificationValuesDelay);
                BasePage.click(By.cssSelector(BASIC_ORG_ROLE_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(StudentStatusPage.CHECKBOX_LIST), "a");
                wait(1000);
                clickOnListOfElements(role);
            }
            if(orgType!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_TYPE_DROPDOWN),updateBasicIdentificationValuesDelay);
                BasePage.click(By.cssSelector(BASIC_ORG_TYPE_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(StudentStatusPage.CHECKBOX_LIST), "a");
                wait(1000);
                clickOnListOfElements(orgType);
            }
            if(website!=""){
                waitElementBy(By.cssSelector(BASIC_ORG_WEBSITE_FIELD),updateBasicIdentificationValuesDelay);
                write(By.cssSelector(BASIC_ORG_WEBSITE_FIELD),website);
            }
            if(primaryContact!=""){
                waitElementBy(By.cssSelector(BASIC_PRIMARY_CONTACT_PICK_BUTTON),updateBasicIdentificationValuesDelay);
                click(By.cssSelector(BASIC_PRIMARY_CONTACT_PICK_BUTTON));
                searchForPrimaryContact(primaryContact);
            }
            ExtentReportsSetUp.testingPass(LogPage.UPDATE_BASIC_IDENTIFICATION_VALUES_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.UPDATE_BASIC_IDENTIFICATION_VALUES_FAIL);
        }
    }
    public static void searchForPrimaryContact(String contactLastName){
        try {
            waitElementBy(By.cssSelector(PERSON_PICKER_MODAL_SEARCH_FIELD),20);
            write(By.cssSelector(PERSON_PICKER_MODAL_SEARCH_FIELD),contactLastName);
            waitElementBy(By.cssSelector(PERSON_PICKER_MODAL_ROW1_LAST_NAME),20);
            String contactLastNameText = getText(By.cssSelector(PERSON_PICKER_MODAL_ROW1_LAST_NAME));
            if(contactLastNameText.equals(contactLastName)){
                waitElementBy(By.cssSelector(PERSON_PICKER_MODAL_ROW1_CHECKBOX),20);
                click(By.cssSelector(PERSON_PICKER_MODAL_ROW1_CHECKBOX));
            }else{
                FailureDelegatePage.handlePageException(LogPage.SEARCH_FOR_PRIMARY_CONTACT_FAIL);
            }
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.SEARCH_FOR_PRIMARY_CONTACT_FAIL);
        }
    }
    public static void verifyOrgActionValues(int organizationIndex){
        try {
            if(verifyActionAttributes(organizationIndex) && verifyActionDetails(organizationIndex)){
                ExtentReportsSetUp.testingPass(LogPage.VERIFY_ORG_ACTION_VALUES_PASS);
            }else{
                FailureDelegatePage.handlePageException(LogPage.VERIFY_ORG_ACTION_VALUES_FAIL);
            }
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.VERIFY_ORG_ACTION_VALUES_FAIL);
        }
    }


    public static boolean verifyActionAttributes(int indexNumber)throws Exception{
        boolean staffValidation = false;
        boolean actionDateTimeValidation = false;
        boolean commentsValidation = false;
        waitElementBy(By.cssSelector(CREATE_ACTION_PANEL_TITLE),20);

        if(mass.get(indexNumber).get("Staff") !=null){
            String staffText = getText(By.cssSelector(ACTION_STAFF_DROPDOWN));
            staffValidation = staffText.contains(mass.get(indexNumber).get("Staff"));
        }else{
            staffValidation=true;
        }
        if(mass.get(indexNumber).get("ActionDateField") !=null){
            String actionDateTimeText = getAtribute(By.cssSelector(ACTION_DATE_FIELD),"value");
            actionDateTimeValidation = actionDateTimeText.contains(mass.get(indexNumber).get("ActionDateField"));
        }else{
            actionDateTimeValidation=true;
        }
        if(mass.get(indexNumber).get("Comments") !=null){
            String commentsText = getAtribute(By.id(ACTION_COMMENTS_FIELD),"value");
            commentsValidation = commentsText.contains(mass.get(indexNumber).get("Comments"));
        }else{
            commentsValidation=true;
        }
        return staffValidation && actionDateTimeValidation && commentsValidation;
    }

    public static boolean verifyActionDetails(int indexNumber)throws Exception{

        boolean categoryValidation = false;
        boolean actionValidation = false;
        boolean actionTypeValidation = false;
        boolean actionVisibilityValidation = false;
        waitElementBy(By.cssSelector(CREATE_ACTION_PANEL_TITLE),20);

        if(mass.get(indexNumber).get("Category") !=null){
            String categoryText = getText(By.cssSelector(ACTION_CATEGORY_DROPDOWN));
            categoryValidation = categoryText.contains(mass.get(indexNumber).get("Category"));
        }else{
            categoryValidation=true;
        }
        if(mass.get(indexNumber).get("Action") !=null){
            String actionText = getText(By.cssSelector(ACTION_DROPDOWN));
            actionValidation = actionText.contains(mass.get(indexNumber).get("Action"));
        }else{
            actionValidation=true;
        }
        if(mass.get(indexNumber).get("ActionType") !=null){
            String actionTypeText = getText(By.cssSelector(ACTION_TYPE_DISABLED_DROPDOWN));
            actionTypeValidation = actionTypeText.contains(mass.get(indexNumber).get("ActionType"));
        }else{
            actionTypeValidation=true;
        }
        if(mass.get(indexNumber).get("ActionVisibility") !=null){
            String actionVisibilityText = getText(By.cssSelector(ACTION_VISIBILITY_DISABLED_DROPDOWN));
            actionVisibilityValidation = actionVisibilityText.contains(mass.get(indexNumber).get("ActionVisibility"));
        }else{
            actionVisibilityValidation=true;
        }
        return categoryValidation && actionValidation && actionTypeValidation && actionVisibilityValidation;
    }
    public static void updateOrgAction(int organizationIndex){
        try {
            if (mass.get(organizationIndex).get("Category") != null) {
                scrollToElement(By.xpath(ActionsPage.DETAILS_LABEL));
                waitUntilElementToBeSelected(By.id(ORG_ACTION_CATEGORY_DROPDOWN), 20);
                BasePage.click(By.id(ORG_ACTION_CATEGORY_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(StudentStatusPage.CHECKBOX_LIST), "a");
                wait(1000);
                clickOnListOfElements(mass.get(organizationIndex).get("Category"));
            }
            if (mass.get(organizationIndex).get("Action") != null) {
                scrollToElement(By.xpath(ActionsPage.DETAILS_LABEL));
                waitUntilElementToBeSelected(By.id(ORG_ACTION_DROPDOWN), 20);
                BasePage.click(By.id(ORG_ACTION_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(StudentStatusPage.CHECKBOX_LIST), "a");
                wait(1000);
                clickOnListOfElements(mass.get(organizationIndex).get("Action"));
            }
            if (mass.get(organizationIndex).get("Staff") != null) {
                scrollToElement(By.xpath(ActionsPage.DETAILS_LABEL));
                waitUntilElementToBeSelected(By.id(ORG_ACTION_STAFF_DROPDOWN), 20);
                BasePage.click(By.id(ORG_ACTION_STAFF_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(StudentStatusPage.CHECKBOX_LIST), "a");
                wait(1000);
                clickOnListOfElements(mass.get(organizationIndex).get("Staff"));
            }
            if (mass.get(organizationIndex).get("ActionDateField") != null) {
                scrollToElement(By.xpath(ActionsPage.DETAILS_LABEL));
                waitUntilElementToBeSelected(By.cssSelector(ORG_ACTION_DATE_FIELD), 20);
                KeyPage.erase(By.cssSelector(ORG_ACTION_DATE_FIELD));
                BasePage.write(By.cssSelector(ORG_ACTION_DATE_FIELD),mass.get(organizationIndex).get("ActionDateField"));
            }
            if (mass.get(organizationIndex).get("Comments") != null) {
                scrollToElement(By.xpath(ActionsPage.DETAILS_LABEL));
                waitUntilElementToBeSelected(By.id(ORG_ACTION_COMMENTS_FIELD), 20);
                BasePage.write(By.id(ORG_ACTION_COMMENTS_FIELD),mass.get(organizationIndex).get("Comments"));
            }
            ExtentReportsSetUp.testingPass(LogPage.UPDATE_ORG_ACTION_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.UPDATE_ORG_ACTION_FAIL);
        }
    }
    private static String deleteSummaryList(String summary) {
        HashMap<String, String> deleteSummaryItem = new HashMap<>();
        deleteSummaryItem.put("Org Informal Name", SUMMARY_DISPLAY_ORG_INFORMAL_NAME_DELETE_BUTTON);
        deleteSummaryItem.put("Phone Number", SUMMARY_DISPLAY_ORG_PHONE_NUMBER_DELETE_BUTTON);
        deleteSummaryItem.put("Time Zone", SUMMARY_DISPLAY_ORG_PHONE_TIME_ZONE_DELETE_BUTTON);
        deleteSummaryItem.put("Organization Fireworks ID", SUMMARY_DISPLAY_ORG_FIREWORKS_ID_DELETE_BUTTON);
        return deleteSummaryItem.get(summary);
    }

    public static void deleteSummaryFields(String deleteSummaryField){
        String passMessage = String.format(LogPage.DELETE_SUMMARY_FIELDS_PASS, deleteSummaryField);
        String failMessage = String.format(LogPage.DELETE_SUMMARY_FIELDS_FAIL, deleteSummaryField);
        try {
            scrollToElement(By.id(PersonPage.SUMMARY_LABEL));
            waitUntilElementToBeSelected(By.xpath(deleteSummaryList(deleteSummaryField)),20);
            click(By.xpath(deleteSummaryList(deleteSummaryField)));
            ExtentReportsSetUp.testingPass(passMessage);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(failMessage);
        }
    }

    public static String summaryList(String summary){
        HashMap<String,String> summaryItem = new HashMap<>();
        summaryItem.put("Org Informal Name",SUMMARY_DISPLAY_ORG_INFORMAL_NAME);
        summaryItem.put("Phone Number",SUMMARY_DISPLAY_ORG_PHONE_NUMBER);
        summaryItem.put("Time Zone",SUMMARY_DISPLAY_ORG_PHONE_TIME_ZONE);
        summaryItem.put("Organization Fireworks ID",SUMMARY_DISPLAY_ORG_FIREWORKS_ID);
        return summaryItem.get(summary);
    }
    public static void verifySummaryData(String summaryData){
        String passMessage = String.format(LogPage.VERIFY_SUMMARY_DATA_PASS, summaryData);
        String failMessage = String.format(LogPage.VERIFY_SUMMARY_DATA_FAIL, summaryData);

        try {
            waitElementBy(By.xpath(summaryList(summaryData)),20);
            String summaryText = getText(By.xpath(summaryList(summaryData)));
            if(summaryText.contains(summaryData)){
                ExtentReportsSetUp.testingPass(passMessage);
            }else{
                FailureDelegatePage.handlePageException(failMessage);
            }
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(failMessage);
        }
    }

    public static void addSummaryOrganizationField(String summary){
        String passMessage = String.format(LogPage.ADD_SUMMARY_FIELD_PASS, summary);
        String failMessage = String.format(LogPage.ADD_SUMMARY_FIELD_FAIL, summary);
        try {
            waitUntilElementToBeSelected(By.id(SUMMARY_FIELD_DROPDOWN),20);
            click(By.id(SUMMARY_FIELD_DROPDOWN));
            waitElementBy(By.cssSelector(SUMMARY_FIELD_DROPDOWN_LIST),20);
            BasePage.selectElementsList(By.cssSelector(SUMMARY_FIELD_DROPDOWN_LIST), "a");
            wait(1000);
            clickOnListOfElements(summary);
            wait(500);
            ExtentReportsSetUp.testingPass(passMessage);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(failMessage);
        }
    }
    public static void openPeopleRecord(String search){
        searchOrganizationManager(search);
        String passMessage = String.format(LogPage.OPEN_ORGANIZATION_RECORD_PASS, search);
        String failMessage = String.format(LogPage.OPEN_ORGANIZATION_RECORD_FAIL, search);
        try {
            waitElementBy(By.cssSelector(ORGANIZATION_MANAGER_TABLE_SEARCH_FIELD),20);
            click(By.cssSelector(ORGANIZATION_MANAGER_TABLE_SEARCH_FIELD));
            ExtentReportsSetUp.testingPass(passMessage);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(failMessage);
        }
    }

    public static void verifyOrgId(String orgId){
        try {
            scrollToElement(By.id(QuickSearchPage.OBJECT_TITLE_ELEMENT));
            waitElementBy(By.id(QuickSearchPage.OBJECT_TITLE_ELEMENT),20);
            String orgIdText = getText(By.id(HEADER_ORG_ID_DISPLAY));
            if(orgIdText.contains(orgId)){
                ExtentReportsSetUp.testingPass(LogPage.VERIFY_ORG_ID_PASS);
            }else{
                FailureDelegatePage.handlePageException(LogPage.VERIFY_ORG_ID_FAIL);
            }
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.VERIFY_ORG_ID_FAIL);
        }
    }
    public static void verifyRecordHeader(String name, String oktoContact, String recordStatus, String orgCategory){

        try {
            scrollToElement(By.id(QuickSearchPage.OBJECT_TITLE_ELEMENT));
            waitElementBy(By.id(QuickSearchPage.OBJECT_TITLE_ELEMENT),20);
            String fullNameText = getText(By.id(QuickSearchPage.OBJECT_TITLE_ELEMENT));
            String okToContactText = getText(By.id(HEADER_OK_TO_CONTACT_ELEMENT));
            String recordStatusText = getText(By.id(HEADER_RECORD_STATUS_ELEMENT));
            String orgCategoryText = getText(By.id(HEADER_ORG_CATEGORY_ELEMENT));
            if(fullNameText.contains(name)
                && okToContactText.contains(oktoContact)
                && recordStatusText.contains(recordStatus)
                && orgCategoryText.contains(orgCategory)){
                ExtentReportsSetUp.testingPass(LogPage.VERIFY_RECORD_HEADER_PASS);
            }else{
                FailureDelegatePage.handlePageException(LogPage.VERIFY_RECORD_HEADER_FAIL);
            }
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.VERIFY_RECORD_HEADER_FAIL);
        }

    }

    public static void validateOrganizationDatatableMessage(String message){
        String errorMessage = String.format(LogPage.VALIDATE_ORG_REQUIRED_FIELDS_MESSAGE_FAIL, message);
        String passMessage = String.format(LogPage.VALIDATE_ORG_REQUIRED_FIELDS_MESSAGE_PASS, message);
        try {
            wait(2000);
            String messageDatatableEmpty = getText(By.id(DATATABLE_EMPTY));
            if(messageDatatableEmpty.equals(message)){
                ExtentReportsSetUp.testingPass(passMessage);
            }else{
                FailureDelegatePage.handlePageException(errorMessage);
            }
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(errorMessage);
        }
    }

    public static void searchOrganizationManager(String search){
        String passMessage = String.format(LogPage.SEARCH_ORGANIZATION_MANAGER_PASS, search);
        String failMessage = String.format(LogPage.SEARCH_ORGANIZATION_MANAGER_FAIL, search);
        try {
            waitElementBy(By.id(ORGANIZATION_MANAGER_TABLE),20);
            write(By.cssSelector(ORGANIZATION_MANAGER_TABLE_SEARCH_FIELD),search);
            ExtentReportsSetUp.testingPass(passMessage);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(failMessage);
        }
    }

    public static void deleteOrganization(){
        try {
            waitUntilElementToBeSelected(By.id(ORG_HEADER_DELETE_BUTTON),20);
            BasePage.click(By.id(ORG_HEADER_DELETE_BUTTON));

            waitUntilElementToBeSelected(By.id(DELETE_ORG_MODAL_DELETE_BUTTON),20);
            BasePage.click(By.id(DELETE_ORG_MODAL_DELETE_BUTTON));

            ExtentReportsSetUp.testingPass(LogPage.DELETE_ORGANIZATION_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.DELETE_ORGANIZATION_FAIL);
        }
    }

    public static void clickOnAddOrgStatus(String index){
        try {
            waitUntilElementToBeSelected(By.cssSelector(statusPlusSignElement(index)),20);
            BasePage.click(By.cssSelector(statusPlusSignElement(index)));
            ExtentReportsSetUp.testingPass(LogPage.CLICK_ON_ADD_ORG_STATUS_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.CLICK_ON_ADD_ORG_STATUS_FAIL);
        }
    }

    public static void updateStatusOrg(String index, int person){
        String errorMessage = String.format(LogPage.UPDATE_STATUS_ORG_FAIL, index,person);
        String passMessage = String.format(LogPage.UPDATE_STATUS_ORG_PASS, index,person);
        try {
            if (mass.get(person).get("OrgStatus") != null) {
                scrollToElement(By.cssSelector(statusPlusSignElement(index)));
                waitUntilElementToBeSelected(By.cssSelector(orgStatusStatusDropdown(index)),20);
                BasePage.click(By.cssSelector(orgStatusStatusDropdown(index)));
                BasePage.selectElementsList(By.cssSelector(StudentStatusPage.CHECKBOX_LIST), "a");
                clickOnListOfElements(mass.get(person).get("OrgStatus"));
            }
            if (mass.get(person).get("OrgStatusDate") != null) {
                scrollToElement(By.cssSelector(statusPlusSignElement(index)));
                waitElementBy(By.cssSelector(orgStatusStatusDate(index)),20);
                BasePage.write(By.cssSelector(orgStatusStatusDate(index)),mass.get(person).get("OrgStatusDate"));
            }
            if (mass.get(person).get("OrgStatusComments") != null) {
                scrollToElement(By.cssSelector(statusPlusSignElement(index)));
                waitElementBy(By.cssSelector(orgStatusStatusComments(index)),20);
                BasePage.write(By.cssSelector(orgStatusStatusComments(index)),mass.get(person).get("OrgStatusComments"));
            }
            ExtentReportsSetUp.testingPass(passMessage);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(errorMessage);
        }
    }

    public static void organizationStatusSaveChanges(){
        try {
            waitUntilElementToBeSelected(By.id(ORG_STATUS_SAVE_CHANGES_BUTTON),20);
            BasePage.click(By.id(ORG_STATUS_SAVE_CHANGES_BUTTON));
            ExtentReportsSetUp.testingPass(LogPage.ORGANIZATION_STATUS_SAVE_CHANGES_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.ORGANIZATION_STATUS_SAVE_CHANGES_FAIL);
        }
    }

    /*
     * to update email address in Contact tab on records
     */
    public static void updateEmailAddress(String emailAddress,String emailType,String emailOpt, String optStatus, String optDate, String emailStatus, String emailContent){
        int updateEmailAddressDelay = 20;
        try {
            waitElementBy(By.cssSelector(EMAIL_ADDRESS_FIELD),updateEmailAddressDelay);
            BasePage.scrollToElement(By.cssSelector(ORGANIZATION_NAME_FIELD));
            if (mass.get(0).get(emailAddress) != null) {
                waitElementBy(By.cssSelector(EMAIL_ADDRESS_FIELD),updateEmailAddressDelay);
                BasePage.write(By.cssSelector(EMAIL_ADDRESS_FIELD), mass.get(0).get(emailAddress));
            }
            if (mass.get(0).get(emailType) != null) {
                waitElementBy(By.cssSelector(EMAIL_TYPE_DROP_DOWN),updateEmailAddressDelay);
                BasePage.click(By.cssSelector(EMAIL_TYPE_DROP_DOWN));
                BasePage.selectElementsList(By.cssSelector(EMAIL_TYPE_DROP_DOWN_LIST), "a");
                clickOnListOfElements(mass.get(0).get(emailType));
            }
            if (mass.get(0).get(emailOpt) != null) {
                waitElementBy(By.cssSelector(EMAIL_OPT_DROP_DOWN),updateEmailAddressDelay);
                BasePage.click(By.cssSelector(EMAIL_OPT_DROP_DOWN));
                BasePage.selectElementsList(By.cssSelector(EMAIL_OPT_DROP_DOWN_LIST), "a");
                clickOnListOfElements(mass.get(0).get(emailOpt));
            }
            saveChangesBtnOrgContact();
            ExtentReportsSetUp.testingPass(LogPage.UPDATE_EMAIL_ADDRESS_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.UPDATE_EMAIL_ADDRESS_FAIL);
        }
    }


    /*
     * to save changes in Contact tab on records
     */
    public static void saveChangesBtnOrgContact(){
        try {
            waitElementBy(By.id(ORG_BASIC_SAVE_CHANGES_BUTTON),20);
            BasePage.scrollToElement(By.id(ORG_BASIC_SAVE_CHANGES_BUTTON));
            BasePage.click(By.id(ORG_BASIC_SAVE_CHANGES_BUTTON));
            ExtentReportsSetUp.testingPass(LogPage.SAVE_CHANGES_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.SAVE_CHANGES_FAIL);
        }
    }
    /*
     * to update Id Types in contact tab on records
     */
    public static void updateExternalIdTypes(String type,String idNumber,String idRecordedDate,String whoAddedId, String comments){
        try {
            waitElementBy(By.xpath(PLUS_BUTTON_EXTERNAL_ID),20);
            BasePage.scrollToElement(By.xpath(PLUS_BUTTON_EXTERNAL_ID));
            if (mass.get(0).get(type) != null) {
                BasePage.click(By.cssSelector(TYPE_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(TYPE_DROPDOWN_LIST), "a");
                clickOnListOfElements(mass.get(0).get(type));
            }
            if (mass.get(0).get(idNumber) != null) {
                BasePage.write(By.cssSelector(ID_NUMBER_FIELD), mass.get(0).get(idNumber));
            }
            if (mass.get(0).get(idRecordedDate) != null) {
                BasePage.write(By.cssSelector(ID_RECORDED_DATE_FIELD), mass.get(0).get(idRecordedDate));
            }
            if (mass.get(0).get(whoAddedId) != null) {
                BasePage.click(By.cssSelector(WHO_ADDED_ID_DROPDOWN));
                BasePage.selectElementsList(By.cssSelector(WHO_ADDED_ID_DROPDOWN_LIST), "a");
                clickOnListOfElements(mass.get(0).get(whoAddedId));
            }
            if (mass.get(0).get(comments) != null) {
                BasePage.write(By.cssSelector(COMMENTS_FIELD), mass.get(0).get(comments));
            }
            saveChangesBtnPersonIdTypes();
            ExtentReportsSetUp.testingPass(LogPage.UPDATE_EXTERNAL_ID_TYPES_PASS);

        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.UPDATE_EXTERNAL_ID_TYPES_FAIL);
        }
    }

    /*
     * to save changes in Id Types tab on records
     */
    public static void saveChangesBtnPersonIdTypes(){
        try {
            waitElementBy(By.id(SAVE_CHANGES_BTN_ORG_ID_TYPES),20);
            BasePage.scrollToElement(By.id(SAVE_CHANGES_BTN_ORG_ID_TYPES));
            BasePage.click(By.id(SAVE_CHANGES_BTN_ORG_ID_TYPES));
            ExtentReportsSetUp.testingPass(LogPage.SAVE_CHANGES_PASS);
        } catch (Exception e) {
            FailureDelegatePage.handlePageException(LogPage.SAVE_CHANGES_FAIL);
        }
    }
}