package steps;

import java.net.URL;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import pages.LoginPage;

public class LoginSteps {

	private static LoginPage login;
	private static AppiumDriver driver;
	private static final String username = "gvelasquez";
	private static final String password = "belatrix";
	
	@Given("^I open the app$")
	public void i_open_the_app() throws Throwable {
	    System.out.println("I open the app");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","iPhone Guillermo");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        login = new LoginPage(driver);
	}

	@When("^I login with my credentials$")
	public void i_login_with_my_credentials() throws Throwable {
		login.login(username, password);
		System.out.println("I login with my credentials");
	}

	@Then("^I should see my profile$")
	public void i_should_see_my_profile() throws Throwable {
		login.logout();
		System.out.println("I should see my profile");
	}
	
	@When("^I login with this \"(.*?)\" and this \"(.*?)\" values$")
	public void i_login_with_this_gvelasquez_and_this_belatrix_values(String USERNAME , String PASSWORD) throws Throwable {
		System.out.println("I login with this user and password");
		login.login(USERNAME, PASSWORD);
	}

	@Then("^I see my user profile page$")
	public void i_see_my_user_profile_page() throws Throwable {
		login.logout();
		driver.quit();
		System.out.println("I should see my profile");
	}
	
	@Then("^I see an error message for invalid login$")
	public void i_see_an_error_message_for_invalid_login() throws Throwable {
		WebElement error_login_popup = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]"));
		WebElement error_login_accept = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]"));
		Assert.assertTrue("The login was succesfully", error_login_popup.getText().contains("User is unable to log in with provided credentials."));
		error_login_accept.click();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("The login was unsuccesfully");
	}
}
