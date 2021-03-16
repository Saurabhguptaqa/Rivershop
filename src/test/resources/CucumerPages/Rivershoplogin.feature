Feature: Check Login Functionality of Rivershop

Background: Login Functionality of Rivershop
Given Admin Open "Chrome" browser
Given Admin Open Rivershop URL "https://staging-admin.rivershop.com.au/en/page/login"


@SmokeTest
Scenario Outline: Rivershop Login Functionality
When Admin Enter Emial id as "<Emailid>"
When Admin Enter Password as "<Password>"
And Click at login button
Then Admin navigate to Home page
Then broswer closed

Examples:

 			|    Emailid 				| Password			|
 			|support@rivershop.com.au	|	Qwerty@123		|
 			|test@yopmail.com			|  Qwerty@12 		|
 			|          					|  	ruyreywurytur	|
 			|jrwergg@gjewr.com			|	           		|
 			