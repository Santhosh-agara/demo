package generic;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class base_test {
	public static final String useDir = System.getProperty("user.dir");
	public static final String chromekey = "webdriver.chrome.driver";
	public static final String geckokey = "webdriver.gecko.driver";
	public static final String chromevalue = "//drivers//chromedriver.exe";
	public static final String geckovalue = "//drivers//chromedriver.exe";
	public static final String excelPath = useDir + "//data//excel.xlsx";
	public static Properties prop;
	public WebDriver driver;

	public static void main(String[] args) {
		System.out.println(useDir);
	}

	@BeforeClass
	public void setPath() {
		/* reads the data from properties object */
		try {
			FileInputStream f = new FileInputStream(useDir + "//data//config.propperties");
			prop = new Properties();
			prop.load(f);
		} catch (Exception e) {
		}
		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckovalue);
	}

	@Parameters("browser")
	@BeforeMethod
	public void automobile(String bn) {
		if (bn.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (bn.equals("furefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));
	}
	

	@AfterMethod
	public void colsebrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void killdriver() {
	try {
	Runtime.getRuntime().exec("taskkill /in chromedriver.exe /t /f");
	Runtime.getRuntime().exec("taskkill /in geckodriver.exe /t /f");
	}
	catch (Exception e) {
	}
		
	
	}
	
	
	
	}


