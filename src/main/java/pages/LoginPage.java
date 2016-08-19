package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
    private WebElement loginButton;

    @FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")
    private WebElement username;

    @FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")
    private WebElement password;
    
    @FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[5]")
    private WebElement moreButton;

    @FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]")
    private WebElement settingsButton;

    @FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]")
    private WebElement logoutButton;

    @FindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]")
    private WebElement logoutAcceptButton;
	
	public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
	
	public void login(String USERNAME , String PASSWORD) throws InterruptedException {

        username.sendKeys(USERNAME);
        password.sendKeys(PASSWORD);
        loginButton.click();
        Thread.sleep(5000);

    }
	
	public void logout() throws InterruptedException {
        Thread.sleep(5000);
        moreButton.click();
        settingsButton.click();
        logoutButton.click();
        logoutAcceptButton.click();
        Thread.sleep(5000);

    }
	
}
