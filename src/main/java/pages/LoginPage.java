package pages;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.SendKeysAction;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;

import basic.MainClassDriver;

public class LoginPage extends MainClassDriver {
	
	public static WebElement loginTxtBox, passwordTxtBox, btnLogin , btnLoginGuest , btnMore , btnSettings ,
							 btnLogout , btnAcceptLogout, hlinkForgotPassword, hlinkSignUp;

//    }
	
	public static void getLoginPageComponent(){
		
		getElement(loginTxtBox, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIATextField[1]");
		getElement(passwordTxtBox, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]");
		getElement(btnLogin, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIAButton[1]");
		getElement(btnLoginGuest, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]");
		getElement(hlinkForgotPassword, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]");
		getElement(hlinkSignUp, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]");
		
	}
		
	public static void login(String USERNAME , String PASSWORD) throws InterruptedException {
		
		getLoginPageComponent();
		loginTxtBox.sendKeys(USERNAME);
		passwordTxtBox.sendKeys(PASSWORD);
		btnLogin.click();
		handlingWaits(typeExpectedCondition.presenceOfElementLocated,"//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[3]");
        
    }
	
	public static void logout() throws InterruptedException {
		
		getElement(btnMore, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[5]");
		btnMore.click();
		getElement(btnSettings, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]");
		btnSettings.click();
        getElement(btnLogout, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]");
        btnLogout.click();
        getElement(btnAcceptLogout, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]");
        btnAcceptLogout.click();
        
    }
	
	public static void logoutClose() throws InterruptedException {
		
		getElement(btnMore, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[5]");
		btnMore.click();
		getElement(btnSettings, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]");
		btnSettings.click();
        getElement(btnLogout, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]");
        btnLogout.click();
        getElement(btnAcceptLogout, typeIdSelenium.xpath , "//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]");
        btnAcceptLogout.click();
        handlingWaits(typeExpectedCondition.elementToBeClickable,"//UIAApplication[1]/UIAWindow[1]/UIATextField[1]");
        closeDriver();
        
    }
	
}
