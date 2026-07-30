package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "D:\\Java_Eclipse Workspace\\agile1testCucum\\src\\test\\resources\\featurefiles",
		glue = {"stepDefs"},
		//tags = {"@smoke", ""}
		plugin =  {"pretty","html:target/regression.html"},
		monochrome = false,    //false/true		
		tags="@smoke"	

		)	
	
public class RegressionRunner extends AbstractTestNGCucumberTests{

	
	
	
	}
