package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement course;
	
	public SeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void coursebtn() {
		course.click();
	}
	
	

}
