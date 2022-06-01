package steps;


import io.cucumber.java.en.Then;
import pages.ClearChangesPage;

public class ClearChangesSteps {
    @Then("I click on clear changes on actions for {string}")
    public static void validateDisabledDeleteButtonIsNotVisible(String parameter) {
        ClearChangesPage.clickClearChanges(parameter);
    }
}