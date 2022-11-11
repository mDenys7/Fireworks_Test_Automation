package steps;

import io.cucumber.java.en.When;
import pages.EmailPage;

public class EmailSteps {

    @When("I click on create a new email button and select type {string}")
    public static void createNewEmail(String type) {
        EmailPage.createNewEmail(type);
    }
//    @When("I search email by api on mail trap {string}")
//    public static void searchEmailSubjectByApiOnMailTrap(String subject) {
//        EmailPage.searchEmailSubjectByApiOnMailTrap(subject);
//    }
    @When("I verify if email was sent correctly {string}, {string}, {string}, {string}")
    public static void validateEmailOnMailTrap(String subject,String fromEmail,String fromName,String toName) {
        EmailPage.validateEmailOnMailTrap(subject,fromEmail,fromName,toName);
    }
    @When("I verify email content on mail trap is {string} for subject {string}, {string}, {string}")
    public static void validateHtmlAndTextOnMailTrap(String condition,String subject,String html,String text) {
        EmailPage.validateHtmlAndTextOnMailTrap(condition,subject,html,text);
    }
    @When("I send email")
    public static void sendEmail() {
        EmailPage.sendEmail();
    }
    @When("I open email {string}")
    public static void openEmail(String emailSearch) {
        EmailPage.openEmail(emailSearch);
    }
    @When("I confirm EmailSend {string}")
    public static void confirmEmailSend(String type) {
        EmailPage.confirmEmailSend(type);
    }
    @When("I wait until email sent {string}")
    public static void waitUntilEmailSent(String emailName) {
        EmailPage.waitUntilEmailSent(emailName);
    }
    @When("I schedule an email")
    public static void scheduleEmail() {
        EmailPage.scheduleEmail();
    }
    @When("I validate if element {string} is {string} for email")
    public static void validateIfElementIsVisibleOrNotForEmail(String element,String status) {
        EmailPage.validateIfElementIsVisibleOrNotForEmail(element,status);
    }
}