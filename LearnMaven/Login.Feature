Feature: verify the login functionality

@PositiveScenario
Scenario: verify the login functionality with valid credentials 
Given the url and browser
When we enter valid username and valid password
And click on login button
Then login should be successful

@negativeScenario
Scenario: verify the login functionality with invalid credentials 
Given the url and browser
When we enter valid username and valid password
And click on login button
Then login should be successful

@multipleusers
Scenario Outline: verify the login functionality with multipleusers
Given the url and browser
When we enter valid "<username>" and valid "<password>"
And click on login button
Then login should be successful

Examples:
	|username|password|
	|admin|manager|
	|trainee|trainee|
	|user|user|
