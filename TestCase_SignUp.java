package Testing.Sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.checkerframework.checker.units.qual.s;
import org.json.JSONException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.codoid.products.exception.FilloException;



public class TestCase_SignUp extends BasePage {
	
	SignupPage signupPage = new SignupPage();
	
	@BeforeClass
	public void Setup() throws InterruptedException, FilloException, Exception {
		driver = OpenPage();
	}
	
	@AfterClass
	public void Teardown() {
		//driver.quit();
	}
	
	
	@Test(priority = 1, enabled = true)
	public void TC001_VerifySignUpPage() throws InterruptedException{
		
		signupPage.fEnterDetails(driver , "test22@gmail.com");
		signupPage.fEnterDetailsOnBoardingPage(driver);
			}
}
