package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	@FindBy(xpath = "//a[text()='Automobile']")
	private WebElement btnautomobile;

	public homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickbtn() {
		this.btnautomobile.click();
	}

}
