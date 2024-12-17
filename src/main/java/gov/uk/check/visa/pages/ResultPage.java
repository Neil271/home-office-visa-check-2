package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(css = "body div[id='wrapper'] div[class='smart_answer'] main[id='content'] div[class='govuk-grid-row'] div[id='result-info'] div[data-flow-name='check-uk-visa'] div[class='govuk-!-margin-bottom-6'] h2:nth-child(1)")
    WebElement resultMessage;

    public String confirmResultMessage() {
        log.info("Confirm Result Message :" + resultMessage.toString());
        String message = getTextFromElement(resultMessage);
        return message;
    }
}
