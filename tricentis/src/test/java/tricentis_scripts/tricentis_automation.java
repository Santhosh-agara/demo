package tricentis_scripts;

import org.testng.annotations.Test;

import dataproviders.tricentis_data;
import generic.base_test;
import pom_pages.initializepages;

public class tricentis_automation extends base_test {

	@Test(dataProviderClass=tricentis_data.class,dataProvider="tricentisdata")
	public void aadduser(String un,String pw,String fn,String ln,String email) 
			throws InterruptedException {
	initializepages pages=new initializepages(driver);
	
	}
}
