package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Allure;

import static utilities.BaseDriverSetup.getDriver;

import java.io.ByteArrayInputStream;
import java.util.List;

public class BasePage {
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void wirteTex(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}
	
	public void scrollToElemnt(By loactor) {
		WebElement el = getElement(loactor);
		JavascriptExecutor js =(JavascriptExecutor)getDriver();
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].scrollIntoView();", el);
	}
	
	public void closePagePopup(By locator) {
		List<WebElement> popups = getDriver().findElements(locator);
		for(WebElement popup : popups) {
			try {
				popup.click();
			} catch (Exception e) {
				System.out.println("Popup Not found to perform close action");
			}
		}	
	}
	

}
