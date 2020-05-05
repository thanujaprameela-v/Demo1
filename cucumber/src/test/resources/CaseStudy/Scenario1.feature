Feature:Register Feature
Scenario: Register users for TestMeApp
Given The URL of Demo Testme application
When user enters username "thanuja.v"
And user enters firstname "thanuja"
And user enters lastname "prameela"
And user enters password "password12345"
And user enters confirm password "password12345"
And user enters gender "female"
And user enters emailid "thanuja@gmail.com"
And user enters moblienumber "9990003499"
And user enters dob "02/24/1995"
And user enters password "password12345"
And user enters address "bangalore"
And user enters securityanswer "What is your pet name"
And user enters answer "tommy"
And user clicks register
Then user should be on login page
