package PageDrive;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class LanguagePage1 extends UtilClass {
	
	WebDriver driver;

	public LanguagePage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='header_btn__A5Dou']")
	WebElement Language;

	@FindBy(xpath = "//label[normalize-space()='TAMIL']")
	WebElement TAMIL;
	
	@FindBy(xpath = "//label[normalize-space()='TELUGU']")
	WebElement TELUGU;
	
	@FindBy(xpath = "//label[normalize-space()='MALAYALAM']")
	WebElement MALAYALAM;
	
	@FindBy(xpath = "//label[normalize-space()='KANNADA']")
	WebElement KANNADA;
	
	@FindBy(xpath = "//label[normalize-space()='BENGALI']")
	WebElement BENGALI;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Apply;
	
	@FindBy(xpath = "//img[@src='/images/logo/footer_logo.png']")
	WebElement Bottom;

	public void Screening() {

		Language.click();
		TAMIL.click();
		TELUGU.click();
		MALAYALAM.click();
		KANNADA.click();
		BENGALI.click();
		Apply.click();
	}
	
	public void Scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView(true)", Bottom);
	}
	
}
