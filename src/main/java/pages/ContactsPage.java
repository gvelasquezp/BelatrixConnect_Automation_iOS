package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	public ContactsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
