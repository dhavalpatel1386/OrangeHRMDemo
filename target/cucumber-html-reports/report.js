$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/OrangeHRM/OrangeHRMS/Website/Testcases/Features/Login.feature");
formatter.feature({
  "line": 3,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 16580353900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I Open valid url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.i_Open_valid_url()"
});
formatter.result({
  "duration": 138422900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "verify user login successfully",
  "description": "",
  "id": "login-test;verify-user-login-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I enter valid credential",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I redirect to Dashbord",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_enter_valid_credential()"
});
formatter.result({
  "duration": 281250200,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_redirect_to_Dashbord()"
});
formatter.result({
  "duration": 5778023700,
  "status": "passed"
});
formatter.after({
  "duration": 1631926700,
  "status": "passed"
});
formatter.before({
  "duration": 18192604000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I Open valid url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.i_Open_valid_url()"
});
formatter.result({
  "duration": 20700,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify validation error for username and password",
  "description": "",
  "id": "login-test;verify-validation-error-for-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I click on the Login button without entering username password",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "It should shows expected validation error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_click_on_the_Login_button_without_entering_username_password()"
});
formatter.result({
  "duration": 138163500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.it_should_shows_expected_validation_error_message()"
});
formatter.result({
  "duration": 76786000,
  "status": "passed"
});
formatter.after({
  "duration": 391984000,
  "status": "passed"
});
formatter.before({
  "duration": 14982139300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I Open valid url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTest.i_Open_valid_url()"
});
formatter.result({
  "duration": 19200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify on ForgotPassword  cancel button work as expected",
  "description": "",
  "id": "login-test;verify-on-forgotpassword--cancel-button-work-as-expected",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I click on ForgotPassword link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on Cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I redirect to Login Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_click_on_ForgotPassword_link()"
});
formatter.result({
  "duration": 1293575000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_on_Cancel_button()"
});
formatter.result({
  "duration": 815581900,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_redirect_to_Login_Screen()"
});
formatter.result({
  "duration": 18850200,
  "status": "passed"
});
formatter.after({
  "duration": 292948600,
  "status": "passed"
});
});