package workSpace.Steps;

import java.util.UUID;

import workSpace.PageObjects.StartPage;

public class StartPageSteps {
	private StartPage startPage;
	
	public StartPageSteps(UUID driverId)
	{
		startPage=new StartPage(driverId);
	}
	
	public void SearchFilm(String filmName)
	{
		startPage.SendKeysToSearchInput(filmName);
		startPage.ClickSearchButton();
	}
}
