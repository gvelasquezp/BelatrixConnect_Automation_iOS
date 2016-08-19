Feature: Login Scenarios
	Scenario Outline: Login with correct values
	Given I open the app
	When I login with this "<username>" and this "<password>" values
	Then I see my user profile page

	Examples:

	|  username  | password |
	| gvelasquez | belatrix |
	| rrashuaman | belatrix |

	#Scenario Outline: Login with incorrect username
	#Given I open the app
	#When I login with this "<username>" and this "<password>" values
	#Then I see an error message for invalid login

	#Examples:

	#|   username  | password |
	#| gvelasquess | belatrix |
	#| rrashuamamm | belatrix |

	#Scenario Outline: Login with non-exists username
	#Given I open the app
	#When I login with this "<username>" and this "<password>" values
	#Then I see an error message for invalid login

	#Examples:

	#| username  | password |
	#| jperez123 | xxxxxxxx |
	#| wsemin123 | xxxxxxxx |


