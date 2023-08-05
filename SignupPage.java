package Testing.Sample;

import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SignupPage extends BasePage {

	By firstName = By.xpath("//input[@placeholder='First Name']");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By emailID = By.xpath("//input[@placeholder='E-mail ID']");
	By password = By.xpath("//input[@placeholder='Password']");
	By submit = By.xpath("//button[@id='submit']");
    By onBoardingDegree = By.xpath("//input[@placeholder='Degree']");
	By onBoardingStudy = By.xpath("//input[@placeholder='Field of Study']");
	By onBoardingCollege = By.xpath("//input[@placeholder='College']");
	By onBoardingStartDate = By.xpath("//input[@placeholder='Start Date']");
	By onBoardingEndDate = By.xpath("//input[@placeholder='End Date']");
	By detailsEmail = By.xpath("//input[@name='email']");
	By detailsPhone = By.xpath("//input[@name='phonenumber']");
	By detailsSubmit = By.xpath("//button[@id='submit']");
	By onBoardingDesc = By.xpath("//textarea[@placeholder='Description']");
	By companyJobTitle = By.xpath("//input[@placeholder='Job Title']");
	By currentCompany = By.xpath("//input[@placeholder='Current Company']");
	By vchooseFile = By.xpath("//input[@title='Select a file']");
	
	public void fEnterDetails(WebDriver driver , String email ) throws InterruptedException {
		
		driver.findElement(firstName).sendKeys("Test1");
		
		driver.findElement(lastName).sendKeys("Tepswd");
		driver.findElement(emailID).sendKeys(email);
		driver.findElement(password).sendKeys("Test123");
		Thread.sleep(3000);
		driver.findElement(submit).click();

	}

	public void fEnterDetailsOnBoardingPage(WebDriver driver) throws InterruptedException {

		// wait = new WebDriverWait(driver, null);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Sign Out')]")));
		Thread.sleep(5000);
		driver.findElement(detailsPhone).sendKeys("1323871231");
		
		String option="Male";
		

		WebElement dropdown = driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));

		dropdown.click();
		
		//driver.findElement(detailsPhone).sendKeys("1323871231");
		
		driver.findElement(detailsSubmit).click();
		
		Thread.sleep(3000);
		
		driver.findElement(onBoardingDegree).sendKeys("Btech");
		
		driver.findElement(onBoardingStudy).sendKeys("IT");
		driver.findElement(onBoardingCollege).sendKeys("xyz");
	
		driver.findElement(onBoardingStartDate).click();
		driver.findElement(onBoardingStartDate).sendKeys("09252018");
		driver.findElement(onBoardingEndDate).click();
		driver.findElement(onBoardingEndDate).sendKeys("06252022");
		driver.findElement(detailsSubmit).click();
		
		driver.findElement(currentCompany).sendKeys("test pvt ltd");
		driver.findElement(companyJobTitle).sendKeys("manager");
		driver.findElement(onBoardingStartDate).click();
		driver.findElement(onBoardingStartDate).sendKeys("02232023");
		driver.findElement(By.xpath("//input[@id = 'flexCheckDefault']")).click();
		driver.findElement(onBoardingDesc).sendKeys("this is testing");
		driver.findElement(detailsSubmit).click();		
		
	}
	
}
