$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/CaseStudy/Scenario2.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Valid Login User",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of demo Testme application",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter \u003cUsername\u003e as username",
  "keyword": "When "
});
formatter.step({
  "name": "User enter \u003cPassword\u003e as password",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.step({
  "name": "the user logins successful",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Lalitha",
        "Password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid Login User",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The URL of demo Testme application",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.LoginTestMe.the_URL_of_demo_Testme_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Lalitha as username",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.LoginTestMe.user_enter_Lalitha_as_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Password123 as password",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.LoginTestMe.user_enter_Password_as_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "skeleton.LoginTestMe.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logins successful",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.LoginTestMe.the_user_logins_successful()"
});
formatter.result({
  "status": "passed"
});
});