package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.DemoSkillraryLoginpage;
import pomPages.SkillRrayLoginPage;

public class Addtocart extends BaseClass {
	@Test
	public void addproduct() {
		SkillRrayLoginPage s = new SkillRrayLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		
		utilies.switchTab(driver);

		DemoSkillraryLoginpage d = new DemoSkillraryLoginpage(driver);
		utilies.mouseHover(driver, d.getCoursebtn());
		d.seleniumTrainingBtn();
		
		AddtoCartPage a=new AddtoCartPage(driver);
		utilies.doubleClick(driver,a.getAddbtn());
		a.addtocartButton();
		utilies.alertPopup(driver);
		
		

	}

}
