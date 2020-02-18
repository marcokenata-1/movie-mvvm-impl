Feature: ActivityScreen
  As a user, I wanted to be able to see all of our own creation.

  @e2e
  Scenario: Checking all of the feature UI on load
    Given I am on the home screen
    Then I see my navigation button and load all of the data

  @smoke
  Scenario: Clicking on the image position
    Given I am on the home screen
    Then  I tap on an item on the gridview and move into another page

  @smok123
  Scenario: Click to move to another fragment
    Given I am on the home screen
    Then I move to Top Rated Page
    And I tap on the instance in Top Rated View
