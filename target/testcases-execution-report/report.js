$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginScenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Login Scenarios",
  "description": "",
  "id": "login-scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario 1"
    }
  ],
  "line": 4,
  "name": "Login with correct values",
  "description": "",
  "id": "login-scenarios;login-with-correct-values",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with this \"\u003cusername\u003e\" and this \"\u003cpassword\u003e\" values",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see my user profile page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-scenarios;login-with-correct-values;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "login-scenarios;login-with-correct-values;;1"
    },
    {
      "cells": [
        "gvelasquez",
        "belatrix"
      ],
      "line": 12,
      "id": "login-scenarios;login-with-correct-values;;2"
    },
    {
      "cells": [
        "rrashuaman",
        "belatrix"
      ],
      "line": 13,
      "id": "login-scenarios;login-with-correct-values;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login with correct values",
  "description": "",
  "id": "login-scenarios;login-with-correct-values;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with this \"gvelasquez\" and this \"belatrix\" values",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see my user profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_the_app()"
});
formatter.result({
  "duration": 30982731456,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gvelasquez",
      "offset": 19
    },
    {
      "val": "belatrix",
      "offset": 41
    }
  ],
  "location": "LoginSteps.i_login_with_this_gvelasquez_and_this_belatrix_values(String,String)"
});
formatter.result({
  "duration": 12988226306,
  "error_message": "java.lang.NullPointerException\n\tat pages.LoginPage.login(LoginPage.java:34)\n\tat steps.LoginSteps.i_login_with_this_gvelasquez_and_this_belatrix_values(LoginSteps.java:27)\n\tat ✽.When I login with this \"gvelasquez\" and this \"belatrix\" values(LoginScenarios.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.i_see_my_user_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Login with correct values",
  "description": "",
  "id": "login-scenarios;login-with-correct-values;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I open the app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with this \"rrashuaman\" and this \"belatrix\" values",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see my user profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_open_the_app()"
});
formatter.result({
  "duration": 41443715,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: A new session could not be created. Details: Problem getting session data for driver type IosDriver; does it implement \u0027get driverData\u0027? (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 17 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027Guillermos-Mac.local\u0027, ip: \u0027192.168.202.130\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.11.6\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: io.appium.java_client.ios.IOSDriver\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:180)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:249)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:158)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:109)\n\tat io.appium.java_client.ios.IOSDriver.\u003cinit\u003e(IOSDriver.java:23)\n\tat basic.MainClassDriver.initializeDriver(MainClassDriver.java:23)\n\tat steps.LoginSteps.i_open_the_app(LoginSteps.java:21)\n\tat ✽.Given I open the app(LoginScenarios.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "rrashuaman",
      "offset": 19
    },
    {
      "val": "belatrix",
      "offset": 41
    }
  ],
  "location": "LoginSteps.i_login_with_this_gvelasquez_and_this_belatrix_values(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.i_see_my_user_profile_page()"
});
formatter.result({
  "status": "skipped"
});
});