package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> durationOfVisa;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess) {
        clickOnElement(durationOfVisa,moreOrLess);
        log.info("Select length of stay :" + durationOfVisa.toString());
        //clickOnElement(moreThanSixMonths);
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Click Next Step Button :" + nextStepButton.toString());
    }

}
