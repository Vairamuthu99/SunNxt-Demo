package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.MusicVideoPage1;

public class MusicVideoPageTest1 extends BaseClass {
	
	@Test
	public void MusicVideoTest() {

		MusicVideoPage1 MVT = new MusicVideoPage1(driver);
		MVT.Screening();
		MVT.Scroll();
	
	}

}
