package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.DarazHelpCenterPage;
import pages.DarazHomePage;
import utilities.BaseDriverSetup;

public class DarazHelpCenterPageTest extends BaseDriverSetup {
	DarazHelpCenterPage darazHelpCenterPage = new DarazHelpCenterPage();
	DarazHomePage darazHomePage = new DarazHomePage();

	@Test(description = "Test Help center page Title")
	@Description("Test Help Center Page Title description using Allure")
	public void TestHelpCenterPageTitle() {
		getDriver().get(darazHelpCenterPage.HELP_CENTER_PAGE_URL);
		assertEquals(getDriver().getTitle(), darazHelpCenterPage.HELP_CENTER_PAGE_TITLE);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		darazHelpCenterPage.takeScreenShot("Help Chenter Page");
	}
	
	@Test
	public void TestHelpCenterPageURL() {
		getDriver().get(darazHelpCenterPage.HELP_CENTER_PAGE_URL);
		assertEquals(getDriver().getCurrentUrl(), darazHelpCenterPage.HELP_CENTER_PAGE_URL);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		darazHelpCenterPage.takeScreenShot("Help Chenter Page");
		darazHelpCenterPage.scrollToElemnt(darazHelpCenterPage.TOP_QUESTIONS);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
