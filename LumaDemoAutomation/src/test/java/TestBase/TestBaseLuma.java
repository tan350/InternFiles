package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseLuma {

	public static WebDriver driver;
	public static Properties properties;

	public static void initialization() throws IOException, InterruptedException{
		try{
			FileInputStream fs=new FileInputStream("D:\\workspace\\QA_Project3\\src\\test\\java\\ConfigurationsLuma\\ConfigurationsLuma.properties");
			properties=new Properties();
			properties.load(fs);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}

		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static void Toclose(){
		driver.quit();
	}


}
