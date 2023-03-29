package pom_pages;

import org.openqa.selenium.WebDriver;

public class initializepages {

	public homepage homep1;
	public Automobilevehicledata entrydata;
	public product_data productdata;

	public initializepages(WebDriver driver) {
		homep1 = new homepage(driver);
		entrydata = new Automobilevehicledata(driver);
		productdata = new product_data(driver);

	}
}
