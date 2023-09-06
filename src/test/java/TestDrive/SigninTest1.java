package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.SigninPage1;

public class SigninTest1 extends BaseClass {

	@Test
	public void Login() {

		SigninPage1 Login = new SigninPage1(driver);
		Login.Login1("msvairam.muthu99@gmail.com", "Vairam@99");

	}

}
