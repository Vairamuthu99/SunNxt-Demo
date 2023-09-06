package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.LiveTVPage1;

public class LiveTVPageTest1 extends BaseClass {
	
	@Test
	public void LiveTVTest() {

		LiveTVPage1 LTT = new LiveTVPage1(driver);
		LTT.Screening();
		LTT.Scroll();
	
	}

}
