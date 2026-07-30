package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseclasses.BasePageObject;
import utils.UtilClass;

public class NavPage extends BasePageObject {

   private By btnSignUp = By.xpath("//a[@href='http://agile1test.com/pages/logi_form.php']");
   //Constructor
	public NavPage(WebDriver driver) {
		super(driver);
		
		//util = new UtilClass(driver);
		
	}
	
	public void clickSignup() {
		clickElement(btnSignUp);
		
	}
	
	
	
	
	
	
	
	
}
