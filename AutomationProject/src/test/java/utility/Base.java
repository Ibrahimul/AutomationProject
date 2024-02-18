package utility;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	public static Properties prop = new Properties();
	public static WebDriver driver;
	public static FileReader file;

	@BeforeTest
	// Read config.properties file and data
	public void setUp() throws IOException {
		if (driver==null) {
		FileReader file = new FileReader(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Configurations\\config.properties");
		prop.load(file);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			driver.get(prop.getProperty("url"));
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	// Close the browser
	public void closeApp() {
		driver.quit();
	}
}
