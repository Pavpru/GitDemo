package rahulshettyacademy.CucumberFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
////import org.openqa.selenium.firefox.FirefoxDriver;
////comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    
  
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//	 	WebDriver driver = new EdgeDriver();
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
      	WebDriver driver = new ChromeDriver(options);
		driver.get("https://total-qa.com/");
		String actual = driver.getTitle();
		String expected="Total-QA - Future of Software Testing";
    }

}
