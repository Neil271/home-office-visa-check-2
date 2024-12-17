Feature: Verify Country

  @regression
  Scenario: Verify the following country available in country dropdown list
    Given I am on homepage
    When I click on start button
    Then I can see following country into dropdown
      | Albania                  |
      | Bhutan                   |
      | British protected person |
      | Haiti                    |
      | Kazakhstan               |
      | Mozambique               |
      | Norway                   |
      | Portugal                 |
      | Russia                   |
      | Zambia                   |
