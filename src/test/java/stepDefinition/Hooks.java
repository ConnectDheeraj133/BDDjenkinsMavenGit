package stepDefinition;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.TestBase;

public class Hooks extends TestBase{
	
	@Before
	public void beforetest() throws IOException {
		launchBrowser("browsername");
		launchUrl("urltolaunch");
	}

	@After
	public void aftertest() {
		closebrowser();
	}
	
}
