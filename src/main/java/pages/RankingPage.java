package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RankingPage {

	public RankingPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
