package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.HomePage1;

public class HomePagetest1 extends BaseClass {
	
	@Test
	public void HomePage() {

		HomePage1 Home = new HomePage1(driver);
		Home.Screening("msvairam.muthu99@gmail.com", "Vairam@99");
		
	}

}
