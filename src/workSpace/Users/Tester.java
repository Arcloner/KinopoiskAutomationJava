package workSpace.Users;

import automationFramework.Drivers.Driver;
import automationFramework.Drivers.WebBrowsers;
import workSpace.Steps.ResultsOfSearchSteps;
import workSpace.Steps.StartPageSteps;

public class Tester {
	
private Driver driver=new Driver(WebBrowsers.Chrome);

public StartPageSteps AtStartPage() {
	return new StartPageSteps(driver.GetDriverKey());
}

public ResultsOfSearchSteps AtResultsOfSearchPage() {
	return new ResultsOfSearchSteps(driver.GetDriverKey());
}

public void GoToPage(String url) {
	driver.GoToUrl(url);
}

public void FinishesWork() {
	driver.CloseDriver();
}
}
