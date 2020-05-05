Feature: Login feature
@demo
Scenario Outline: Valid Login User
Given The URL of demo web shop application
When User enters <Username>as username
And User enters <Password> as password
And User clicks on login button
Then the user login successful

Examples:
|Username|Password|
|Lalitha|Password123|
