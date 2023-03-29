package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Automobilevehicledata {
	
	@FindBy(xpath=(""))
	public WebElement brand;

	@FindBy(xpath = ("//select[@id='numberofseats']"))
	public WebElement opseat;

	@FindBy(xpath = ("//select[@id='fuel']"))
	private WebElement opfuel;

	@FindBy(xpath = ("//select[@id='make']"))
	private WebElement option;

	@FindBy(xpath = ("//input[@id='engineperformance']"))
	private WebElement tbengineper;

	@FindBy(xpath = ("//input[@id='dateofmanufacture']"))
	private WebElement tbdate;

	@FindBy(xpath = ("//input[@id='listprice']"))
	private WebElement tbprice;

	@FindBy(xpath = ("//input[@id='licenseplatenumber']"))
	private WebElement tb_pno;

	@FindBy(xpath = ("//input[@id='annualmileage']"))
	private WebElement tbannualmillage;

	@FindBy(xpath = ("//button[@id='nextenterinsurantdata']"))
	private WebElement btnclick;

	public Automobilevehicledata(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	
	
	
	public void vehicledata(String op,CharSequence[] mil1,String date,CharSequence[] pri,String pno,CharSequence[] mil2) {
	this.option.sendKeys(op);
	this.tbengineper.sendKeys(mil1);
	this.tbdate.sendKeys(date);	
	this.tb_pno.sendKeys(pno);
	this.tbprice.sendKeys(pri);
	this.tbannualmillage.sendKeys(mil2);
	this.btnclick.click();
	
	
	}
	

	
}
