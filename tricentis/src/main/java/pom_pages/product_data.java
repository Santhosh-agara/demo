package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product_data {

	@FindBy(xpath = ("//input[@id='startdate']"))
	public WebElement tbstartdate;

	@FindBy(xpath = ("//select[@id='insurancesum']"))
	public WebElement opsum;

	@FindBy(xpath = ("//select[@id='meritrating']"))
	public WebElement opmerit;

	@FindBy(xpath = ("//select[@id='damageinsurance']"))
	public WebElement opdamege;

	@FindBy(xpath = ("//select[@id='courtesycar']"))
	public WebElement opcourtesycar;

	@FindBy(xpath = ("//button[@id='nextselectpriceoption']"))
	public WebElement btnNext;
	
	@FindBy(xpath = ("//input[@id='EuroProtection']"))
	public WebElement rbtn;
	
	
	public product_data(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void productdata(String date) {
	this.tbstartdate.sendKeys(date);
	
	
	this.btnNext.click();
	
	}
	
}
