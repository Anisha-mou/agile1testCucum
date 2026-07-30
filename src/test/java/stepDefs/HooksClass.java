package stepDefs;

import baseclasses.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseTest {

	@Before
	public void setup() {
		testsetup("chrome");
	}

	 @After
	 public void testtear() {
		 testTeardown();
	 }
	
	
	
}
	
	
