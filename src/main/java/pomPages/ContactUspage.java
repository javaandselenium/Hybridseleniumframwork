package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUspage {
	@FindBy(name = "name")
	private WebElement nametb;

	@FindBy(name = "sender")
	private WebElement emailtb;

	@FindBy(name = "subject")
	private WebElement subjecttb;

	@FindBy(name = "message")
	private WebElement messagetb;

	@FindBy(xpath = "//button[text()='Send us mail']")
	private WebElement sendus;
	
	
	public ContactUspage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void nameTxtbox(String name) {
		nametb.sendKeys(name);
	}
	
	public void emailAddress(String email) {
		emailtb.sendKeys(email);
	}
	
	public void subjectTxtbox(String sub) {
		subjecttb.sendKeys(sub);
	}
	
	public void messgaetb(String msg) {
		messagetb.sendKeys(msg);
		
	}
	
	public void sendusemail() {
		sendus.click();
	}
}
