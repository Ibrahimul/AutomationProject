package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Base {
	Properties prop = new Properties();
	public static WebDriver driver;

	@BeforeSuite
	// Read config.properties file and data
	public void readConfigFile() throws IOException {
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Configurations\\config.properties");

		prop.load(file);
		System.out.println(prop.getProperty("env"));
	}

	@BeforeTest
	// Launch browser and app
	public void launchApp() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	// Close the browser
	public void closeApp() {
		driver.quit();
	}
}
