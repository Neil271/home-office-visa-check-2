package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CountryDropdown {
    /* *//*@Given("I am on home page")
    public void iAmOnHomePage() {

    }*/

    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        List<List<String>> selectCountry = dataTable.asLists(String.class);
        List<String> requireCountries = new ArrayList<>();
        for (List<String> dropDown : selectCountry) {
            requireCountries.add(dropDown.get(0));
        }
        List<String> countries = new SelectNationalityPage().getCountries();
        Assert.assertTrue(countries.containsAll(requireCountries), "Country is not in the list");
    }
}