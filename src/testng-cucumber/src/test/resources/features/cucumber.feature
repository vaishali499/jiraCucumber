Feature: To search cucumber in google

    @Regression
    Scenario: Cucumber Google
      Given I am on "google" search page
      When I type "cucumber"
      Then I click search buttonttt
      Then I clear search textbox
