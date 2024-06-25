package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.DemoSitesPage;
import com.Pages.HomePage;
import com.Pages.PracticeAutomationPage;
import com.Pages.RegisterFormPage;
import com.Utility.ConfigReader;

public class RegisterFormTest {
	WebDriver driver;
	HomePage homePage;
	DemoSitesPage demoSitesPage;
	PracticeAutomationPage practiceAutomationPage;
	RegisterFormPage registerFormPage;
	ConfigReader configReader;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		configReader = new ConfigReader();
		driver.get(configReader.getProperty("url"));
		homePage = new HomePage(driver);
		demoSitesPage = new DemoSitesPage(driver);
		practiceAutomationPage = new PracticeAutomationPage(driver);
		registerFormPage = new RegisterFormPage(driver);
	}



	@Test(priority = 1 )
	public void navigateToRegisterForm() {
		homePage.clickDemoSites();
		demoSitesPage.clickPracticeAutomation();
		practiceAutomationPage.clickRegisterForm();
	}

	@Test(priority = 2)
	public void validateEmptyFields() {
		Assert.assertTrue(registerFormPage.fNameEmpty(), "First Name field is not empty.");
		Assert.assertTrue(registerFormPage.lNameEmpty(), "Last Name field is not empty.");
		//Assert.assertTrue(registerFormPage.isGenderEmpty(), "not clickable.");
		Assert.assertTrue(registerFormPage.isEmailEmpty(), "Email field is not empty.");
	}



	@Test(priority = 3)
	public void fillAndSubmitForm() {
		registerFormPage.fName(configReader.getProperty("firstName"));
		registerFormPage.lName(configReader.getProperty("lastName"));
		//registerFormPage.clickGender();
		registerFormPage.enterEmail(configReader.getProperty("email"));
		registerFormPage.clickSubmitButton();

		/*

		// Assuming the registerId appears after form submission
		Assert.assertNotNull(registerFormPage.getRegisterId(), "Register ID is not displayed.");

	}  */
	}
}