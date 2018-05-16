package workSpace.PageObjects;

import java.util.UUID;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automationFramework.PageObjects.Base.BasePage;

public class ResultsOfSearch extends BasePage {

	public ResultsOfSearch(UUID DriverKey) {
		super(DriverKey);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'results')]//div[contains(@class,'most_wanted')]//div[contains(@class,'info')]//p/a")
	private WebElement resultOfSearch;
	
	public void ClickSearchedFilm()
	{
		Perform.Click(resultOfSearch);
	}
	
	public String GetTextOfSearchedFilm() {
		return resultOfSearch.getText();
	}
}
