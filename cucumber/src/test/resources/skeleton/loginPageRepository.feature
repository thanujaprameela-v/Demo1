Feature: Login feature

Scenario Outline: Valid Login User
Given The URL of Demo web application
When user enters <Username> as username
And user enters <Password> as password
And user clicks on login button
Then the User login successful

Examples:
|Username|Password|
|Kannan1@gmail.com|test1234|
|Kannan2@gmail.com|test1234|
|Kannan3@gmail.com|test1234|