Feature: User should be able to login with correct username and passward

Description:
In order to login to facebook
As a facebook user
I want to enter username and password to successful login



Background: Open browser
When  Chrome Driver is opened
Then Go to login Page



Scenario Outline: User able to login with correct username and password
Given User is on correct login page
When User inputs <username> username
And Inputs "<password>" password
And user enters age category
|age|
|under 18|
|over 18|

And user enter city and state
|city|state|
|Jamaica|NY|
|Woodside|NY|
|Dallas|TX|
|Austin|TX|
Then User "<validity>" to go to dashboard

Examples:
|username|password|validity|
|valid|valid|able|
|valid|invalid|unable|
|invalid|valid|unable|
|invalid|invalid|unable|

