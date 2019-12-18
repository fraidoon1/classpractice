package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PagetestObject extends Base{
	
	public PagetestObject() {
		PageFactory.initElements(driver,  this);
	}
	
	//Test environment link
	@FindBy(how= How.XPATH, using= "//a[text()='Test Environment']")
	private WebElement testEnvironmentLink;
	
	
	public void clickOnTestEnvironmentLink() {
		testEnvironmentLink.sendKeys(Keys.ENTER);
	}
	

	
	
	}
	
	


