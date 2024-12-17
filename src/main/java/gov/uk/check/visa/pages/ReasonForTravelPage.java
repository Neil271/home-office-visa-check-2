package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());


    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> reasonForVisitList1;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectReasonForVisit(String reason) {
        clickOnElement(reasonForVisitList1, reason);
        log.info("Select Reason For Visit :" + reasonForVisitList1.toString());
    }

    public void selectImmigrationStatus(String status) {
        clickOnElement(reasonForVisitList1, status);
        log.info("Select Immigration status :" + reasonForVisitList1.toString());
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on next step Button :" + nextStepButton.toString());
    }
}
