package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass {

	

	private WebDriver driver;
	private WebDriverWait wait;    //call the variables at the global level 
	Actions action;
	
	
	//Constructor
	public UtilClass(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	}
	//getText method
	public String getText(By locator) {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator).getText();
		
	}
	
	
	
	
	
	
	
	
}
