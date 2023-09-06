package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.TVShowPage1;

public class TVShowPageTest1 extends BaseClass {
	
	@Test
	public void TVShowTest() {

		TVShowPage1 TVS = new TVShowPage1(driver);
		TVS.Screening();
		TVS.Scroll();
	
	}

}
