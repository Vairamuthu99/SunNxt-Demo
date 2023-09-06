package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.ComedyPage1;

public class ComedyPageTest1 extends BaseClass {
	
	@Test
	public void ComedyTest() {

		ComedyPage1 CDT = new ComedyPage1(driver);
		CDT.Screening();
		CDT.Scroll();
	
	}

}
