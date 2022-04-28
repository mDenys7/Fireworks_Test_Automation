#Author: Milton Silva
#Regression testcase TL-209: Deleted records are removed from data table

@OrganizationDelete
Feature: Organization: Delete

  @OrganizationDeleteScenarios
  Scenario: verify that an org record can be deleted
    Given I login as "firestarterUsername", "firestarterPassword", "firestarterFullName"
    And I create an organization
      |Name					          |Role		  |Address1			  |City	   |State	  |PostalCode |Country	    |
      |MabuseTheGambler High School   |High School|263 Cardinal Circle|Endicott|New York  |13760      |United States|
    Then I validate if "Organization has been created." message is correct
    #to delete the organization
    Then I validate if "Name"summary opened properly
    When I delete an organization
    Then I validate if "Organization has been deleted." message is correct
    #to verify the deleted organization no longer appears in the org page
    And I search "Name" an organization page manager
    And I validate if "No search results to display." message on organization datatable is displayed