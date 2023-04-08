package testcases;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.DarazLoginPage;
import utilities.BaseDriverSetup;
import utilities.DataSet;

public class DarazLoginPageTest extends BaseDriverSetup{
	DarazHomePage darazHomePage = new DarazHomePage();
	DarazLoginPage darazLoginPage = new DarazLoginPage();
	
	
	@Test(dataProvider = "invalidCredentials", dataProviderClass = DataSet.class)
	public void testLoginwithInvalidPhoneNumber(String username, String password, String ErrorMessage) {
		getDriver().get(darazHomePage.HOMEPAGE_URL);
		darazHomePage.clickOnElement(darazHomePage.SIGNUP_LOGIN_BUTTON);
		darazLoginPage.wirteTex(darazLoginPage.PHONE_EMAIL_INPUT_FIELD, username);
		darazLoginPage.wirteTex(darazLoginPage.PASSWORD_INPUT_FIELD, password);
		darazLoginPage.takeScreenShot("Login Info");
		darazLoginPage.clickOnElement(darazLoginPage.LOGIN_BUTTON);
		darazLoginPage.takeScreenShot("Login");
		assertEquals(darazLoginPage.getElement(darazLoginPage.ERROR_MESSAGE).getText(), ErrorMessage);  
	}
	
	
}
