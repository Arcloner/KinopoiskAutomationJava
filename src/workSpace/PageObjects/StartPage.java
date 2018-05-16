package workSpace.PageObjects;

import java.util.UUID;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automationFramework.PageObjects.Base.BasePage;

public class StartPage extends BasePage {

	public StartPage(UUID DriverKey) {
		super(DriverKey);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'head')]/input[@placeholder]")
	private WebElement searchInput;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'head')]//button[contains(@class,'search')]")
	private WebElement searchButton;
	
	public void ClickSearchButton()
	{
		Perform.Click(searchButton);
	}
	
	public void SendKeysToSearchInput(String keys) {
		Perform.SendKeys(searchInput, keys);
	}
}
