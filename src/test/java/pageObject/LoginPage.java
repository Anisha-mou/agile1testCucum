package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclasses.BasePageObject;

public class LoginPage extends BasePageObject{

	
	public LoginPage(WebDriver driver) {
		super(driver); 
		} 
	private By inptEmail = By.xpath("//input[@id='email']");
	private By inptPass = By.xpath("//input[@type='password']");
	private By btnLogin = By.xpath("//button[text()='Login']");
	private By alertPass = By.xpath("//div[@role='alert']");
	
	public WebElement inptEmail() { 
		return driver.findElement(inptEmail); 
		}
	
    public WebElement inptPass() { 
    	return driver.findElement(inptPass); 
    	} 
    public WebElement btnLogin() { 
    	return driver.findElement(btnLogin); 
    	}
	
	
	
	public WebElement alertWPass() { 
		return driver.findElement(alertPass);
		} 
	
	public void insertEmail(String inputText) {
		insertData(inptEmail(), inputText); 
		}
	public void insertPassword(String inputPass) { 
		insertData(inptPass(), inputPass); 
		} 
	public void clickLogin() { 
		clickElement(btnLogin()); 
		}
	
	public String getPassAlertText() {
		//wait.until(ExpectedConditions.visibilityOf(element)); 
		if(alertWPass().isDisplayed()) {
		System.out.println("Pass Error Alert is Displayed");
		} 
		else {
			System.out.println("Alert Not Displayed! Test Failed"); 
		} return alertWPass().getText(); 
		}	
	
}
