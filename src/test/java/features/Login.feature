Feature: Functionality of Login Module


@Smoke
Scenario Outline: Login with Positive Credentials
   


Given Enter the username as <username>
Given Enter the password as <password>
When Click the login
Then HomePage is displayed


Examples:
 |username|password|
 |'demoSalesManager'|'crmsfa'|
 |'DemoCSR'|'crmsfa'|

@Smoke
Scenario: Login with Negative Credentials

Given Enter the username as 'demo'
Given Enter the password as 'crmsfa'
When Click the login
Then error message is displayed

