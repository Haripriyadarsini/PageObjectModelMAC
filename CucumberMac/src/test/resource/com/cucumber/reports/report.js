$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/harni/Documents/CucumberMac/src/test/java/com/cucumber/features/MacProductsNav.feature");
formatter.feature({
  "line": 2,
  "name": "Mac application login funcionality testing",
  "description": "",
  "id": "mac-application-login-funcionality-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MacLoginScenario"
    }
  ]
});
formatter.scenario({
  "line": 15,
  "name": "Login the Mac page with username and Passw ord with step data",
  "description": "",
  "id": "mac-application-login-funcionality-testing;login-the-mac-page-with-username-and-passw-ord-with-step-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User should be in Mac login page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User should click the signin button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should  enter EmailId \u0027harnie04@yopmail.com\u0027 in the Email Address field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User  should enter the password \u0027Test123\u0027 in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User should click the Submit button ito login the MAC application",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User should validate the username \u0027TEST\u0027 displayed in the page is valid",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User mouse hover to username in the header",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User should move to Signout from page",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionMac.user_should_be_in_Mac_login_page()"
});
formatter.result({
  "duration": 19993085169,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_click_the_signin_button_in_the_header()"
});
formatter.result({
  "duration": 634411679,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "harnie04@yopmail.com",
      "offset": 28
    }
  ],
  "location": "StepdefinitionMac.user_should_enter_EmailId_EmailId_in_the_Email_Address_field(String)"
});
formatter.result({
  "duration": 525996463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test123",
      "offset": 33
    }
  ],
  "location": "StepdefinitionMac.user_should_enter_the_password_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 324045862,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_click_the_Submit_button_ito_login_the_MAC_application()"
});
formatter.result({
  "duration": 5420711838,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TEST",
      "offset": 35
    }
  ],
  "location": "StepdefinitionMac.user_should_validate_the_login_name_username_displayed_in_the_page_is_valid(String)"
});
formatter.result({
  "duration": 1519492939,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_mouse_hover_to_username_in_the_header()"
});
formatter.result({
  "duration": 271222926,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_move_to_Signout_from_page()"
});
formatter.result({
  "duration": 6359420440,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "Login the Mac page with username and Password with step data",
  "description": "",
  "id": "mac-application-login-funcionality-testing;login-the-mac-page-with-username-and-password-with-step-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 25,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User should be in Mac login page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User should click the signin button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should  enter EmailId \u0027\u003cEmailId\u003e\u0027 in the Email Address field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User  should enter the password \u0027\u003cpassword\u003e\u0027 in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User should click the Submit button ito login the MAC application",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User should validate the username \u0027\u003cusername\u003e\u0027 displayed in the page is valid",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User mouse hover to username in the header",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User should move to Signout from page",
  "keyword": "And "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "mac-application-login-funcionality-testing;login-the-mac-page-with-username-and-password-with-step-data;",
  "rows": [
    {
      "cells": [
        "EmailId",
        "password",
        "username"
      ],
      "line": 37,
      "id": "mac-application-login-funcionality-testing;login-the-mac-page-with-username-and-password-with-step-data;;1"
    },
    {
      "cells": [
        "Mac123@yopmail.com",
        "Test123",
        "MAC1"
      ],
      "line": 38,
      "id": "mac-application-login-funcionality-testing;login-the-mac-page-with-username-and-password-with-step-data;;2"
    },
    {
      "cells": [
        "Mac1234@yopmail.com",
        "Test1234",
        "MAC2"
      ],
      "line": 39,
      "id": "mac-application-login-funcionality-testing;login-the-mac-page-with-username-and-password-with-step-data;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 38,
  "name": "Login the Mac page with username and Password with step data",
  "description": "",
  "id": "mac-application-login-funcionality-testing;login-the-mac-page-with-username-and-password-with-step-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@MacLoginScenario"
    },
    {
      "line": 25,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User should be in Mac login page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User should click the signin button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should  enter EmailId \u0027Mac123@yopmail.com\u0027 in the Email Address field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User  should enter the password \u0027Test123\u0027 in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User should click the Submit button ito login the MAC application",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User should validate the username \u0027MAC1\u0027 displayed in the page is valid",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User mouse hover to username in the header",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User should move to Signout from page",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionMac.user_should_be_in_Mac_login_page()"
});
formatter.result({
  "duration": 8712483559,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_click_the_signin_button_in_the_header()"
});
formatter.result({
  "duration": 468826658,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mac123@yopmail.com",
      "offset": 28
    }
  ],
  "location": "StepdefinitionMac.user_should_enter_EmailId_EmailId_in_the_Email_Address_field(String)"
});
formatter.result({
  "duration": 550826139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test123",
      "offset": 33
    }
  ],
  "location": "StepdefinitionMac.user_should_enter_the_password_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 179012479,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_click_the_Submit_button_ito_login_the_MAC_application()"
});
formatter.result({
  "duration": 10379804826,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MAC1",
      "offset": 35
    }
  ],
  "location": "StepdefinitionMac.user_should_validate_the_login_name_username_displayed_in_the_page_is_valid(String)"
});
formatter.result({
  "duration": 74920810,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_mouse_hover_to_username_in_the_header()"
});
formatter.result({
  "duration": 227103974,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_move_to_Signout_from_page()"
});
formatter.result({
  "duration": 7868383835,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Login the Mac page with username and Password with step data",
  "description": "",
  "id": "mac-application-login-funcionality-testing;login-the-mac-page-with-username-and-password-with-step-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@MacLoginScenario"
    },
    {
      "line": 25,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User should be in Mac login page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User should click the signin button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should  enter EmailId \u0027Mac1234@yopmail.com\u0027 in the Email Address field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User  should enter the password \u0027Test1234\u0027 in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User should click the Submit button ito login the MAC application",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User should validate the username \u0027MAC2\u0027 displayed in the page is valid",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User mouse hover to username in the header",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User should move to Signout from page",
  "keyword": "And "
});
formatter.match({
  "location": "StepdefinitionMac.user_should_be_in_Mac_login_page()"
});
formatter.result({
  "duration": 10374978951,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_click_the_signin_button_in_the_header()"
});
formatter.result({
  "duration": 436453531,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mac1234@yopmail.com",
      "offset": 28
    }
  ],
  "location": "StepdefinitionMac.user_should_enter_EmailId_EmailId_in_the_Email_Address_field(String)"
});
formatter.result({
  "duration": 635182521,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test1234",
      "offset": 33
    }
  ],
  "location": "StepdefinitionMac.user_should_enter_the_password_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 343856240,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_click_the_Submit_button_ito_login_the_MAC_application()"
});
formatter.result({
  "duration": 10519982751,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MAC2",
      "offset": 35
    }
  ],
  "location": "StepdefinitionMac.user_should_validate_the_login_name_username_displayed_in_the_page_is_valid(String)"
});
formatter.result({
  "duration": 113419152,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_mouse_hover_to_username_in_the_header()"
});
formatter.result({
  "duration": 280100420,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionMac.user_should_move_to_Signout_from_page()"
});
formatter.result({
  "duration": 6812434293,
  "status": "passed"
});
});