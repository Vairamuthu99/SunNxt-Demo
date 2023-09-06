package PageDrive;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class LiveTVPage1 extends UtilClass {
	
	WebDriver driver;

	public LiveTVPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[normalize-space()='LIVE TV']")
	WebElement LiveTVPage;

	@FindBy(xpath = "//img[@src='/images/logo/footer_logo.png']")
	WebElement Bottom;

	public void Screening() {

		LiveTVPage.click();
	}

	public void Scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView(true)", Bottom);
	}

}
