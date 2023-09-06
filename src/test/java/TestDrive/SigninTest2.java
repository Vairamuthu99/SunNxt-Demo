package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.SigninPage2;

public class SigninTest2 extends BaseClass {
	

	@Test
	public void Login() {

		SigninPage2 Login = new SigninPage2(driver);
		Login.Login2("msvairam.muthu@gmail.com", "Vair@99");

	}

}
