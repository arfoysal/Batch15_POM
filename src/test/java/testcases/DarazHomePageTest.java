package testcases;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import utilities.BaseDriverSetup;

public class DarazHomePageTest extends BaseDriverSetup {
	DarazHomePage darazHomePage = new DarazHomePage();

	@Test
	public void TestHomePageScroll() {
		getDriver().get(darazHomePage.HOMEPAGE_URL);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		darazHomePage.scrollToElemnt(darazHomePage.payment);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
