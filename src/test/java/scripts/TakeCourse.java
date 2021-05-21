package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SkillRrayLoginPage;
import pomPages.TakeThiscoursePage;

public class TakeCourse extends BaseClass {
	@Test
	public void takecourse() throws FileNotFoundException, IOException, InterruptedException {
		SkillRrayLoginPage s=new SkillRrayLoginPage(driver);
		s.serachTxtbox(p.getData("selsubject"));
		s.serachbutton();
		
		SeleniumPage sel=new SeleniumPage(driver);
		sel.coursebtn();
		
		TakeThiscoursePage t=new TakeThiscoursePage(driver);
		utilies.switchFrame(driver);
		t.playbutton();
		Thread.sleep(10000);
		t.pausebtn();
		utilies.switchback(driver);
		t.takethiscourse();
		
		
	}
	

}
