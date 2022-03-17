
@login
Feature: Login Test
Background: 
	Given I Open valid url
Scenario: verify user login successfully
    When  I enter valid credential
    Then  I redirect to Dashbord
    
Scenario: Verify validation error for username and password
   When   I click on the Login button without entering username password
   Then   It should shows expected validation error message
 
Scenario: Verify on ForgotPassword  cancel button work as expected
  When   I click on ForgotPassword link
  And    I click on Cancel button
  Then   I redirect to Login Screen
  
     
   

