Feature: Login Action
Scenario: Verify Login with valid data
Given when user is on home page
Then user clicks on signin link check title
When user enters user name and password clicks on submit
Then check user is valid and display message as Login Successful
And Close the Browser

