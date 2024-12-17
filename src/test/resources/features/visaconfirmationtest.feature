Feature: Check if you need a UK visa

  @smoke
  Scenario: An Australian Coming To UK For Tourism
    Given I am on homepage
    When I click on start button
    And I select a Nationality 'Australia'
    And I click on Continue button
    And I select reason 'Tourism'
    And I click on Next Continue button
    Then I should see the result 'You will not need a visa to come to the UK'

  @sanity
  Scenario: A Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given I am on homepage
    When I click on start button
    And I select a Nationality 'Chile'
    And I click on Continue button
    And I select reason 'Work, academic visit or business'
    And I click on Next Continue button
    And I select intended to stay for 'longer than 6 months'
    And I click on Next Continue button
    And I select planning to work for 'Health and care professional'
    And I click on Continue button
    Then I should see the result 'You need a visa to work in health and care'

  @regression
  Scenario: A Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10 Or 20 Card
    Given I click on start button
    When I select a Nationality 'Colombia'
    And I click on Continue button
    And I select reason 'Join partner or family for a long stay'
    And I click on Continue button
    And I select state My partner of family member have uk immigration status 'Yes'
    And I click on Continue button
    Then I should see the result 'You’ll need a visa to join your family or partner in the UK'


