package test.java;

import org.testng.annotations.BeforeTest;

import workSpace.Users.Tester;

import org.testng.annotations.AfterTest;

public class BaseTestCase {
	private String basePage = "https://www.kinopoisk.ru/";
	
	protected Tester tester=new Tester();
 
  @BeforeTest
  public void beforeTest() {
	  tester.GoToPage(basePage);
  }

  @AfterTest
  public void afterTest() {
	  tester.FinishesWork();
  }

}
