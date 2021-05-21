package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRrayLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')] ")
	private WebElement  contactus;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement serachbtn;
	
	public SkillRrayLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsButton() {
		gearsbtn.click();
	}
	
	public void skillraryDemoapp() {
		demoapp.click();
	}

	public void cotatctusbtn() {
		contactus.click();
	}
	
	public void serachTxtbox(String sub) {
		serachtb.sendKeys(sub);
	}

	public WebElement getContactus() {
		return contactus;
	}
	
	public void serachbutton() {
		serachbtn.click();
	}
}
