package workSpace.Steps;


import static org.junit.Assert.assertTrue;

import java.util.UUID;
import workSpace.PageObjects.ResultsOfSearch;

public class ResultsOfSearchSteps {
	private ResultsOfSearch resultsOfSearch;
	
	public ResultsOfSearchSteps(UUID driverId)
	{
		resultsOfSearch=new ResultsOfSearch(driverId);
	}

	public void CheckFoundFilmContains(String filmName) {	
		String sourceFilm=filmName.replace(" ", "").toLowerCase();
		String targetFilm=resultsOfSearch.GetTextOfSearchedFilm().replace(" ", "").toLowerCase();
		assertTrue(targetFilm.contains(sourceFilm));
	}
}
