package baseclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.UtilClass;


public class BasePageObject {
	
	 
		protected WebDriver driver;
		protected WebDriverWait wait; 
		protected UtilClass util;
		Actions action;
		public BasePageObject(WebDriver driver) { 
			this.driver = driver;
		
			this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));		
	wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	action = new Actions(driver);

	util = new UtilClass(driver);}
	
	
	
	
	
		  //  Click using WebElement
	    public void clickElement(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element));

	        action.moveToElement(element).click().perform();
	    }      

		//To click element----By variable--By locator
		public void clickElement(By locator){
			WebElement e = driver.findElement(locator);
			//Explicit Wait
		
			
			action.scrollToElement(e).build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(e));   //Expected conditions----
			//action.scrollToElement(e).click();  //hovering over the element
			e.click(); 
		
		}	

		public void insertData(WebElement element, String inptText) { 
			wait.until(ExpectedConditions.visibilityOf(element)); 
			element.clear(); 
		element.sendKeys(inptText); }
		
		
		
		
		
		
}
