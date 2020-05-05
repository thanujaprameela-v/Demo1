Feature: Login feature
Scenario Outline: Valid Login User
Given The URL of demo Testme application
When User enter <Username> as username
And User enter <Password> as password
And User clicks the login button
Then the user logins successful

Examples:
|Username|Password|
|Lalitha|Password123|
