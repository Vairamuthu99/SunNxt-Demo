package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.LanguagePage1;

public class LanguageTest1 extends BaseClass {
	
	@Test
	public void Language() {

		LanguagePage1 LAG = new LanguagePage1(driver);
		LAG.Screening();
		LAG.Scroll();
		
	}

}
