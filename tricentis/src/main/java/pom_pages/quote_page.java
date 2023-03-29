package pom_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.base_test;

public class quote_page extends base_test{

	@FindBy(xpath="")
	private WebElement tbemail;
	
	@FindBy(xpath="")
	private WebElement tbphone;
	
	@FindBy(xpath="")
	private WebElement tbusername;
	
	@FindBy(xpath="")
	private WebElement tbpassword;
	
	@FindBy(xpath="")
	private WebElement tbconformpw;
	
	@FindBy(xpath="")
	private WebElement tbcomments;
	
	@FindBy(xpath="")
	private WebElement tbsend;
	
	
	public quote_page() {
	PageFactory.initElements(driver,this);	
	}
	
	public void quote(String email,String phone,String un,String pw,String cpw,String comment) {
	this.tbemail.sendKeys(email);
	this.tbphone.sendKeys(phone);
	this.tbusername.sendKeys(un);
	this.tbpassword.sendKeys(pw);
	this.tbconformpw.sendKeys(cpw);
	this.tbcomments.sendKeys(comment);
	this.tbsend.click();
	
	
	
	}
}
