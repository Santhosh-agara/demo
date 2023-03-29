package pom_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.base_test;

public class Automationprice_page extends base_test{

	
	@FindBy(xpath="//button[@id='nextsendquote']")
	private WebElement  nextbtn;
	
	@FindBy(xpath=("(//label[@class='choosePrice ideal-radiocheck-label'])[2]"))
	private WebElement textbutton;
	
	public Automationprice_page() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void pricebook() {
	this.textbutton.click();
	this.nextbtn.click();
	}
}
