package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import main.CucumberRunner;
import pages.SearchPage;

import static org.testng.Assert.fail;

public class SearchText extends CucumberRunner {

	SearchPage page = new SearchPage();

	@When("^I type \"(.*?)\"$")
	public void searchText(String text) throws Throwable {
		explicitWait(page.searchBox);
		page.searchBox.sendKeys(text);


	}

}
