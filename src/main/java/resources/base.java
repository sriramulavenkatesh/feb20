package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				"G:\\My Stuff\\java-test-project\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "G:\\Automation Stuff\\Chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (BrowserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "G:\\Automation Stuff\\Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
}