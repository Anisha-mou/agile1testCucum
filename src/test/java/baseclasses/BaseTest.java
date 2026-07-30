package baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObject.LoginPage;
import pageObject.NavPage;

public class BaseTest {
	
	protected static WebDriver driver; 
	protected static NavPage nav;
	protected static LoginPage login;

	 public void testsetup(String browserName) {
		 
		 if (browserName.equalsIgnoreCase("chrome")) { 
			 driver = new ChromeDriver(); 
			 }
		 else if (browserName.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver(); 
			 } 
		 else { driver = new ChromeDriver(); 
		 }
		 driver.get("https://agile1test.com/");
		 
		 driver.manage().window().maximize();
		 
		nav  = new NavPage(driver); 
		 
		login =new LoginPage(driver);
		 
		 
		 
		 
	 }
	
	
	 public static boolean assertText(String actual,String expected) { 
		 boolean assertText;
		 if(actual.equals(expected)) {
			 System.out.println("Text Matched! Test Passed!");
			 assertText = true; 
			 } 
		 else { 
			 System.out.println("Text doesn't match. Test Failed!");
			 assertText = false; 
			 } 
		 return assertText; 
		 } 
	 
	 public static void testTeardown() {
		 if(driver!=null) {
		 }
		 else {
			 driver.close();
		 }
			 
		 }
		  
		 } 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


