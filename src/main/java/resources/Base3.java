package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base3 {

	public WebDriver driver;
	public Properties prop;

	public WebDriver intializedriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				"D:\\My Stuff\\java-test-project\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation Stuff\\Chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Automation Stuff\\Gecko\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;

	}

}
