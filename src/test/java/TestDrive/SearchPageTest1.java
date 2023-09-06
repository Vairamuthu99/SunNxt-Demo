package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.SearchPage1;

public class SearchPageTest1 extends BaseClass {
	
	@Test
	public void Search() {

		SearchPage1 SEP = new SearchPage1(driver);
		SEP.Screening("Ghilli");
		SEP.Scroll();
	
	}

}
