package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import main.CucumberRunner;

import static org.testng.Assert.fail;

public class Search extends CucumberRunner {

	@Given("^I am on \"(.*?)\" search page$")
	public void verifyPageTitle(String text) throws Throwable {

		String title = driver.getTitle();
			if(text == "google") {
				Assert.assertEquals(title, "Google");
			} else if(text == "cucumber") {
				Assert.assertEquals(title, "cucumber - Google Search");
			} else if(text == "junit") {
				fail("purposefuly failing");
				Assert.assertEquals(title, "junit - Google Search");
			}   		
	}

}
