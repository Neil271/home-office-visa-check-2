package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StartSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a Nationality {string}")
    public void iSelectANationalityAustralia(String country) {
        new SelectNationalityPage().selectNationality(country);
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason {string}")
    public void iSelectReasonTourism(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I click on Next Continue button")
    public void iClickOnContinueNextButton() {
        new ReasonForTravelPage().clickNextStepButton();
    }

    @Then("I should see the result {string}")
    public void iShouldSeeTheResultYouWillNotNeedAVisaToComeToTheUK(String expectedMessage) {
        String actualMessage = new ResultPage().confirmResultMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "You will not need a visa to come to the UK");

    }

    @And("I select intended to stay for {string}")
    public void iSelectIntendedToStayForLongerThanMonths(String length) {
        new DurationOfStayPage().selectLengthOfStay(length);
    }

    @And("I select planning to work for {string}")
    public void selectHavePlanningToWorkForHealthAndCareProfessional(String planning) {
        new WorkTypePage().selectJobType(planning);
    }

    @And("I select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes(String select) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(select);
    }

    

}
