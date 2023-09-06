package PageDrive;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.UtilClass;

public class SearchPage1 extends UtilClass {
	
	WebDriver driver;

	public SearchPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='search']")
	WebElement SearchPage;
	
	@FindBy(xpath = "//input[@placeholder='Search Movies, Shows, Actors or channels']")
	WebElement MovieName;

	@FindBy(xpath = "//img[@src='/images/logo/footer_logo.png']")
	WebElement Bottom;

	public void Screening(String Movie) {

		SearchPage.click();
		MovieName.sendKeys(Movie);
	}

	public void Scroll() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView(true)", Bottom);
	}

}
