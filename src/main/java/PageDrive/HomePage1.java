package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class HomePage1 extends UtilClass {
	
	WebDriver driver;

	public HomePage1(WebDriver driver) {
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
	
	@FindBy(xpath = "//div[@class='slick-slide slick-active slick-current']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]")
	WebElement SelectVideo;
	
	@FindBy(xpath = "//img[@alt='playbtn']")
	WebElement PlayVideo;
	
	public void Screening(String MailID, String Pass) {
		LoginButton.click();
		LoginC.click();
		Mail.sendKeys(MailID);
		Passwword.sendKeys(Pass);
		Submit.click();
		SelectVideo.click();
		PlayVideo.click();
	}
}

