package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class insurence_data {

	@FindBy(xpath = ("//input[@id='firstname']"))
	public WebElement tbfn;

	@FindBy(xpath = ("//input[@id='lastname']"))
	public WebElement tbln;

	@FindBy(xpath = ("//input[@id='birthdate']"))
	public WebElement tbbd;

	@FindBy(xpath = ("//span[@class='ideal-radio']"))
	public WebElement btngen;

	@FindBy(xpath = ("//input[@id='streetaddress']"))
	public WebElement tbadr;

	@FindBy(xpath = ("//input[@id='zipcode']"))
	public WebElement tbzipcode;

	@FindBy(xpath = ("//input[@id='city']"))
	public WebElement tbcity;

	@FindBy(xpath = ("(//span[@class='ideal-check'])[5]"))
	public WebElement tbhobbi;

	@FindBy(xpath = ("//input[@id='website']"))
	public WebElement tbwebsite;

	@FindBy(xpath = ("(//button[@type='button'])[5]"))
	public WebElement btnopen;

	@FindBy(xpath = ("(//button[@type='button'])[7]"))
	public WebElement btnNext;

	@FindBy(xpath = ("//select[@id='country']"))
	public WebElement opCountry;

	@FindBy(xpath = ("(//select[@id='occupation']"))
	public WebElement opOcupation;

	public insurence_data(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void insurencedata(String fn, String ln, String date, String address, String zip, String web, String city) {
		this.tbfn.sendKeys(fn);
		this.tbln.sendKeys(ln);
		this.btngen.click();
		this.tbadr.sendKeys(address);
		this.tbbd.sendKeys(date);
		this.tbzipcode.sendKeys(zip);
		this.tbcity.sendKeys(city);
		this.tbhobbi.click();
		this.tbwebsite.sendKeys(web);
		this.btnopen.click();
		this.btnNext.click();
		this.opCountry.click();
		this.opOcupation.click();
	}

}
