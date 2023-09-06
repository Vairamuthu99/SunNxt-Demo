package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class SignupPage1 extends UtilClass {
	
	WebDriver driver;

	public SignupPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='myaccount']")
	WebElement LoginButton;

	@FindBy(xpath = "//a[@href='/signin']")
	WebElement LoginC;

	@FindBy(xpath = "//a[@href='/signup']")
	WebElement Signup;

	@FindBy(xpath = "//input[@placeholder='Email / Mobile']")
	WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Create Password']")
	WebElement Cpass;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement Name;
	
	@FindBy(xpath = "//select[@name='age']")
	WebElement Age;
	
	@FindBy(xpath = "//option[@value='18-25 Years']")
	WebElement Range;
	
	@FindBy(xpath = "//span[normalize-space()='male']")
	WebElement Sex;
	
	@FindBy(xpath = "//select[@name='country']")
	WebElement Country;
	
	@FindBy(xpath = "//option[@value='101']")
	WebElement Cname;
	
	@FindBy(xpath = "//select[@name='state']")
	WebElement State;
	
	@FindBy(xpath = "//option[text()='Tamil Nadu']")
	WebElement Sname;
	
	@FindBy(css = "#terms")
	WebElement Term;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Signup2;

	public void Log1(String MailID) {
		LoginButton.click();
		LoginC.click();
		Signup.click();
		Email.sendKeys(MailID);
	}
	
	public void Log2(String Pass, String Nam) {
		Cpass.sendKeys(Pass);
		Name.sendKeys(Nam);
		Age.click();
		Range.click();
		Sex.click();
		Country.click();
		Cname.click();
		State.click();
		Sname.click();
		Term.click();
		Signup2.click();
	}

}
