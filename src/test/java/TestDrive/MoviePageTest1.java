package TestDrive;


import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.MoviePage1;

public class MoviePageTest1 extends BaseClass {
	
	@Test
	public void MoviePage() {

		MoviePage1 Movie = new MoviePage1(driver);
		Movie.Screening();
		Movie.Scroll();
	
	}

}
