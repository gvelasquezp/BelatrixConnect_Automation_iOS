package basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class MainClassDriver {

	private static AppiumDriver driver;
	
	public static void initializeDriver() throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","iPhone Guillermo");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
	}
	
	public static void closeDriver(){
		
		driver.quit();
		
	}
	
	public static AppiumDriver getDriver(){
		
		return driver;
		
	}
	
	public static enum typeIdSelenium{
		
		id,
		className,
		name,
		tagName,
		linkText,
		xpath
	}
	
	public static enum typeExpectedCondition{
		
		alertIsPresent,
		elementSelectionStateToBeTrue,
		elementSelectionStateToBeFalse,
		elementToBeClickable,
		elementToBeSelected,
		invisibilityOfElementLocated,
		presenceOfElementLocated,
		presenceOfAllElementsLocatedBy,
		visibilityOfAllElementsLocatedBy,
		visibilityOfElementLocated,
		invisibilityOfElementWithText,
		textToBePresentInElementLocated,
		textToBePresentInElementValue,
		titleContains
	}
	
	public static void getElement(WebElement componentName, typeIdSelenium type, String identifyName){
		
		if (type == typeIdSelenium.id)
		{
			componentName = driver.findElement(By.id(identifyName));
		} 
		else if (type == typeIdSelenium.className)
		{
			componentName = driver.findElement(By.className(identifyName));
		}
		else if (type == typeIdSelenium.name)
		{
			componentName = driver.findElement(By.name(identifyName));
		}
		else if (type == typeIdSelenium.tagName)
		{
			componentName = driver.findElement(By.tagName(identifyName));
		}
		else if (type == typeIdSelenium.linkText)
		{
			componentName = driver.findElement(By.linkText(identifyName));
		}
		else if (type == typeIdSelenium.xpath)
		{
			componentName = driver.findElement(By.xpath(identifyName));
		}
	}
	
	public static void handlingWaits(typeExpectedCondition type , String identifyName){
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		if (type == typeExpectedCondition.alertIsPresent)
		{
			wait.until(ExpectedConditions.alertIsPresent());
		} 
		else if (type == typeExpectedCondition.elementSelectionStateToBeTrue)
		{
			wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(identifyName),true));
		}
		else if (type == typeExpectedCondition.elementSelectionStateToBeFalse)
		{
			wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(identifyName),false));
		}
		else if (type == typeExpectedCondition.elementToBeClickable)
		{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(identifyName)));
		}
		else if (type == typeExpectedCondition.elementToBeSelected)
		{
			wait.until(ExpectedConditions.elementToBeSelected(By.xpath(identifyName)));
		}
		else if (type == typeExpectedCondition.invisibilityOfElementLocated)
		{
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(identifyName)));
		}
		else if (type == typeExpectedCondition.presenceOfElementLocated)
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(identifyName)));
		}
		else if (type == typeExpectedCondition.presenceOfAllElementsLocatedBy)
		{
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(identifyName)));
		}
		else if (type == typeExpectedCondition.visibilityOfAllElementsLocatedBy)
		{
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(identifyName)));
		}
		else if (type == typeExpectedCondition.visibilityOfElementLocated)
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(identifyName)));
		}
	}
	
	public static void handlingWaitsText(typeExpectedCondition type , String identifyName , String text){
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		if (type == typeExpectedCondition.invisibilityOfElementWithText)
		{
			wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(identifyName),text));
		}
		else if (type == typeExpectedCondition.textToBePresentInElementLocated)
		{
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(identifyName),text));
		}
		else if (type == typeExpectedCondition.textToBePresentInElementValue)
		{
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(identifyName),text));
		}
		else if (type == typeExpectedCondition.titleContains)
		{
			wait.until(ExpectedConditions.titleContains(text));
		}
	}
	
}
