package test.java;

import org.testng.annotations.Test;

public class TC1  extends BaseTestCase{
  @Test
  public void TestUserCanGetExpectedResultOfSearch() {
	  String filmToSearch = "Pie";
	  tester.AtStartPage().SearchFilm(filmToSearch);
	  tester.AtResultsOfSearchPage().CheckFoundFilmContains(filmToSearch);
  }
}
