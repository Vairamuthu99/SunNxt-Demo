package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class SigninPage2 extends UtilClass {

	WebDriver driver;

	public SigninPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='myaccount']")
	WebElement LoginButton;

	@FindBy(xpath = "//a[@href='/signin']")
	WebElement LoginC;

	@FindBy(xpath = "//input[@placeholder='Email / Mobile']")
	WebElement Mail;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Passwword;

	@FindBy(xpath = "//button[@id='signin_btn']")
	WebElement Submit;

	public void Login2(String MailID, String Pass) {
		LoginButton.click();
		LoginC.click();
		Mail.sendKeys(MailID);
		Passwword.sendKeys(Pass);
		Submit.click();
	}

}
