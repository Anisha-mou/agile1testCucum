Feature: Login Feature 

Background:           
Given user is in the login page



@smoke
Scenario: Valid login 

When user inserts email and password
And user clicks on login
Then user should be logged in
And user should be navigated to the dashboard


@regression
Scenario Outline: inValid login 

When user inserts invalid '<email>' and '<password>'
And user clicks on login
Then user should be logged in
And user should be navigated to the dashboard

Examples:
|email                |password|
|vic@doe.com        |njffknkd|
|second@gmail.com   |"jdjjf52"|
|thirdjhon@doe.com  |"hkdhkd@ndnn?"|



