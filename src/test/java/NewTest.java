package test.java;

import org.testng.annotations.Test;

import workSpace.Users.Tester;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
private String basePage = "https://www.kinopoisk.ru/";
	
	protected Tester tester=new Tester();
 
	@BeforeMethod
  public void beforeTest() {
	  tester.GoToPage(basePage);
  }

	@AfterMethod
  public void afterTest() {
	  tester.FinishesWork();
  }
  @Test
  public void TestUserCanGetExpectedResultOfSearch() {
	  String filmToSearch = "Pie";
	  tester.AtStartPage().SearchFilm(filmToSearch);
	  tester.AtResultsOfSearchPage().CheckFoundFilmContains(filmToSearch);
  }
}
