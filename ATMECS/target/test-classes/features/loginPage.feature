@tag
Feature: Application login page

@SmokeTest
Scenario: User page default login

     Given User is on login page
     When User login into application
		 Then Home page is displayed  
		 And Product are displayed
@RegressionTest
Scenario: Login to Gmail
     Given I open the Gmail login page
     When I enter the username and click next with <username>
     When I enter the password and click next with <password>
     Then I should see the Gmail inbox

Examples:

| username | password |
| lingalaprashanth9697@gmail.com | Prashanthgoud3007@ |









