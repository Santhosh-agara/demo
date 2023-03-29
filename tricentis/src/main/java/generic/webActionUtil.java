package generic;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webActionUtil {
 WebDriver driver;
 
 
 public webActionUtil(WebDriver x) {
	this.driver=x; 
}
 
	public static String getdata(String path,String sn,int r,int c ) {
		try
		{
			//reads the data from excel
			FileInputStream f1=new FileInputStream(path);
			//creates a workspace
			Workbook book=WorkbookFactory.create(f1);
			//reads the data from the specified cell of the workspace
			 String data = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
			//returns the data
			 return data;
		}
		catch(Exception e) {
		return null;
		}
	}
	
	
		public void validateTitle(String expectedTitle) {
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			System.out.println("pass:tilte is mathching");
			}
			catch (Exception e) 
			{
			System.out.println("fail:title is not matching");
			Assert.fail();
			}
		}
		
		
		public void capturescreenshot(String scriptname) {
		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File(base_test.useDir+"//screenshot//"+scriptname+"tricentis.png");
		
		try {
		FileUtils.copyFile(src, dest);	
		} 
		catch (Exception e) {
		
		}
		}
		
	}

