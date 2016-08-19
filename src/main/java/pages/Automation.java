package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;




public class Automation {
	
	
	public Automation(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
