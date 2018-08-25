Feature: User should be able to login with correct username and passward

Scenario: User able to login with correct username and password
Given User is on correct login page
When User inputs corrects username
And Inputs correct password
Then User able to go to dashboard

Scenario: User not able to login with incorret username and password
Given User is on correct login page
When User inputs incorrects username
And Inputs incorrect password
Then User not able to go to dashboard

