Feature: Functionality of CreateLead

@Regression @Functionality

Given Launch the browser
Given Load the url 
Given Enter the username as 'demoSalesManager'
Given Enter the password as 'crmsfa'
When Click the login
Then WelcomePage is displayed
And Click the 'CRMSFA' link
Then HomePage is displayed
When Click 'My Leads' link
Then LeadPage is diplayed
When Click the 'Create Lead' link
Then 'CreateLead' Page is displayed
When Enter the CompanyName
And Enter the FirstName
And Enter the LastName
And Click the createlead button
Then 'ViewLead' page is displayed
