package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//option")
    List<WebElement> countryList;

    public void selectNationality(String nationality) {
        System.out.println(nationality);
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        log.info("Select Nationality :" + nationalityDropDownList.toString());
    }

    public void clickNextStepButton() {
        clickOnElement(continueButton);
        log.info("Clicking on Next Step Button :" + continueButton.toString());
    }

    public List<String> getCountries() {
        log.info("Get Countries :" + countryList.toString());
        List<String> countries = new ArrayList<>();
        for (WebElement element : countryList) {
            String country = getTextFromElement(element);
            countries.add(country);
        }
        return countries;
    }

}
