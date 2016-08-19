package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	public ProfilePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
