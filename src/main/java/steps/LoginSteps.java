package steps;


import org.openqa.selenium.WebElement;
import org.testng.Assert;

import basic.MainClassDriver;
//import basic.MainClassDriver.typeIdSelenium;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps extends MainClassDriver{
	
	public static WebElement error_login_popup,error_login_accept;

	@Given("^I open the app$")
	public void i_open_the_app() throws Throwable {
	    System.out.println("I open the app");
	    initializeDriver();
	}

	@When("^I login with this \"(.*?)\" and this \"(.*?)\" values$")
	public void i_login_with_this_gvelasquez_and_this_belatrix_values(String USERNAME , String PASSWORD) throws Throwable {
		System.out.println("I login with this user and password");
		LoginPage.login(USERNAME, PASSWORD);
	}

	@Then("^I see my user profile page$")
	public void i_see_my_user_profile_page() throws Throwable {
		LoginPage.logout();
		closeDriver();
		System.out.println("I should see my profile");
	}
	
	@Then("^I see an error message for invalid login$")
	public void i_see_an_error_message_for_invalid_login() throws Throwable {
		getElement(error_login_popup,typeIdSelenium.xpath,"//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]");
		getElement(error_login_accept,typeIdSelenium.xpath,"//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]");
		Assert.assertTrue(error_login_popup.getText().contains("User is unable to log in with provided credentials."));
		error_login_accept.click();
		Thread.sleep(5000);
		closeDriver();
		System.out.println("The login was unsuccesfully");
	}
}
