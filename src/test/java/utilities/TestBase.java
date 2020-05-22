package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public  abstract class TestBase {
	
	
	
	public static  WebDriver driver;
	public static WebDriverManager managebrowsers;
	 public static File file;
	public static FileInputStream filestream=null;
	public static Properties prop=null;
	
	public TestBase() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void launchBrowser(String browserName) throws IOException {
		
		switch(readdatafromfile(browserName)){
		case "chrome":
			managebrowsers.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			managebrowsers.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "ie":
			managebrowsers.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;		
		}		
	}
	
	
public void launchUrl(String Url) throws IOException {
	
	driver.manage().window().maximize();
	driver.get(readdatafromfile(Url));
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}

public String readdatafromfile(String key) throws IOException {
	file=new File("src/test/java/testData/config.properties");
	filestream=new FileInputStream(file);
	prop=new Properties();
	prop.load(filestream);
	return prop.getProperty(key);
}

public void closebrowser() {
	driver.quit();
}







	

}
