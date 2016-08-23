Feature: Login Scenarios
	
	#Scenario 1
	Scenario Outline: Login with correct values
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see my user profile page

	Examples:

	|  username  | password |
	| gvelasquez | belatrix |
	| rrashuaman | belatrix |
 
  
  #Scenario2 
	Scenario Outline: Login with incorrect username
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see an error message for invalid login

	Examples:

	|   username  | password |
	| gvelasquess | belatrix |
	| rrashuamamm | belatrix |

	#Scenario3
	Scenario Outline: Login with incorrect password
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see an error message for invalid login

	Examples:

	|   username  | password |
	| gvelasquess | belatrix |
	| rrashuamamm | belatrix |
	
	#Scenario4
	Scenario Outline: Login with non-exists username
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see an error message for invalid login

	Examples:

	| username  | password |
	| jperez123 | belatrix |
	| wsemin123 | belatrix |
	
	#Scenario5
	Scenario Outline: Login with non-exists password
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see an error message for invalid login

	Examples:

	| username   | password    |
	| gvelasquez | belatrix123 |
	| rrashuaman | belatrix123 |
	
	#Scenario6
	Scenario Outline: Login with the username empty
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see an error message for invalid login

	Examples:

	| username   | password    |
	|  | belatrix123 |
	|  | belatrix123 |
	
	#Scenario7
	Scenario Outline: Login with the password empty
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see an error message for invalid login

	Examples:

	| username   | password    |
	| gvelasquez |  |
	| rrashuaman |  |