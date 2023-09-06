package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.SignupPage1;

public class SignupTest1 extends BaseClass {
	
	@Test
	public void Signup() {

		SignupPage1 Sign = new SignupPage1(driver);
		Sign.Log1(generateNewEmail());
		Sign.Log2("Welcome@00","Vairam");

	}

}
