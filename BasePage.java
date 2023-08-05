package Testing.Sample;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	WebDriver driver ;
	
	
	public WebDriver OpenPage () {
		
		WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Vikram\\Documents\\Personal\\New_AG\\New folder\\Browser\\chromedirver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver(options);
		driver.get("https://app.jobrobo.io/signup");
		driver.manage().window().maximize();
		
		return driver;

	}
	
	
}
