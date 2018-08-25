Feature: User should be able to login with correct username and passward

Description:
In order to login to facebook
As a facebook user
I want to enter username and password to successful login



Background: Open browser
When  Chrome Driver is opened
Then Go to login Page



Scenario: User able to login with correct username and password
Given User is on correct login page
When User inputs corrects username
And Inputs "correct" password
Then User able to go to dashboard

Scenario: User not able to login with incorret username and password
Given User is on correct login page
When User inputs incorrects username
And Inputs "incorrect" password
Then User not able to go to dashboard


Scenario: User able to login with correct username and incorrect password
Given User is on correct login page
When User inputs corrects username
And Inputs "incorrect" password
Then User able to go to dashboard

Scenario: User not able to login with incorret username and correct password
Given User is on correct login page
When User inputs incorrects username
And Inputs "correct" password
Then User not able to go to dashboard
