package utility;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static Properties prop = new Properties();
	public static WebDriver driver;
	public static FileReader file;

	@BeforeMethod
	// Read config.properties file and launch browser
	public void setUp() throws IOException {
		if (driver == null) {

			FileReader file = new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Configurations\\config.properties");
			prop.load(file);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.get(prop.getProperty("QAurl"));
		} else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("QAurl"));
		} else if (prop.getProperty("browser").equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			driver.get(prop.getProperty("QAurl"));
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
		

//	Read Excel data using TestNG annotation
//	@DataProvider(name = "userCredentials")
//	public Object[][] tData() {
//		return new Object[][] { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret" },
//				{ "problem", "secret_sauce" }, { "nouser", "nopassword" } };
//	}

	
	@AfterMethod
	// Close the browser
	public void closeApp() {
		driver.quit();
	}
}
