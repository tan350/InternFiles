package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.CreateNewCustomerAccountPage;
import Pages.HomePage;
import TestBase.TestBaseLuma;

public class CreateanAccountTest extends TestBaseLuma {

	HomePage homepage;
	CreateNewCustomerAccountPage  createaccountpage;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		createaccountpage=new CreateNewCustomerAccountPage();
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_createanaccount() {
		homepage= new HomePage();
		homepage.clickOnCreateanAccount();
		Assert.assertEquals(driver.getTitle(),"Create New Customer Account");
	}

	@Test(priority = 2)
	public void visibility_luma_logo() {
		Assert.assertTrue(createaccountpage.logo().isDisplayed());
	}

	@Test(priority = 3)
	public void visibility_Create_new_customer_account_header() {
		Assert.assertTrue(createaccountpage.createNewCustomerAcoountHeader().isDisplayed());
	}

	@Test(priority = 4)
	public void visibility_personal_information_header() {
		Assert.assertTrue(createaccountpage.personalInformationHeader().isDisplayed());
	}

	@Test(priority = 5)
	public void visibility_sign_in_information_header() {
		Assert.assertTrue(createaccountpage.signInInformationHeader().isDisplayed());
	}

	@Test(priority = 6)
	public void verify_label_firstname_on_Page()
	{
		Assert.assertTrue(createaccountpage.labelFirstName().isDisplayed());
	}
	
	@Test(priority = 7)
	public void verify_label_lastname_on_Page()
	{
		Assert.assertTrue(createaccountpage.labelLastName().isDisplayed());
	}
	
	@Test(priority = 8)
	public void verify_label_SignUpForNewsletter_on_Page()
	{
		Assert.assertTrue(createaccountpage.labelSignUpForNewsletter().isDisplayed());
	}
	
	@Test(priority = 9)
	public void verify_label_email_on_Page()
	{
		Assert.assertTrue(createaccountpage.labelEmail().isDisplayed());
	}
	
	@Test(priority = 10)
	public void verify_label_password_on_Page()
	{
		Assert.assertTrue(createaccountpage.labelPassword().isDisplayed());
	}
	
	@Test(priority = 11)
	public void verify_label_confirmpassword_on_Page()
	{
		Assert.assertTrue(createaccountpage.labelConfirmPassword().isDisplayed());
	}

	@Test(priority = 12)
	public void create_an_account_with_valid_credentials() throws InterruptedException {
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.alreadyAccountMessage().isDisplayed());
	}

	@Test(priority = 13)
	public void forgotpassword_redirection() {
		createaccountpage.clickOnForgotPassword();
		Assert.assertEquals(driver.getTitle(),"Forgot Your Password?");
		driver.navigate().back();
	}

	@Test(priority = 14)
	public void subscribe_button_functionality() throws InterruptedException {
		createaccountpage.enterEmailForSubscribe(properties.getProperty("Email"));
		createaccountpage.clickOnSubscribe();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.alreadySubscribedMessage().isDisplayed());
	}
	
	@Test(priority = 15)
	public void create_an_account_with_empty_firstname() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.errorMessageFirstName().isDisplayed());
	}
	
	@Test(priority = 16)
	public void create_an_account_with_empty_lastname() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.errorMessageLastName().isDisplayed());
	}
	
	@Test(priority = 17)
	public void create_an_account_with_unchecked_Signupfornewsletter_checkbox() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		createaccountpage.alreadyAccountMessage();
	}
	
	@Test(priority = 18)
	public void create_an_account_with_empty_email() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.errorMessageEmail().isDisplayed());
	}
	
	@Test(priority = 19)
	public void create_an_account_with_empty_password() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterConfirmPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.errorMessagePassword().isDisplayed());
	}
	
	@Test(priority = 20)
	public void create_an_account_with_empty_confirmpassword() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.errorMessageConfirmPassword().isDisplayed());
	}
	
	@Test(priority = 21)
	public void create_an_account_with_invalid_email() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("InvalidEmail"));
		createaccountpage.enterPassword(properties.getProperty("Password"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.errorMessageEmail().isDisplayed());
	}
	
	@Test(priority = 22)
	public void create_an_account_with_invalid_password() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(3000);
		createaccountpage.enterFirstName(properties.getProperty("FirstName"));
		createaccountpage.enterLastName(properties.getProperty("LastName"));
		createaccountpage.checkSignUpForNewsletter();
		createaccountpage.enterEmail(properties.getProperty("Email"));
		createaccountpage.enterPassword(properties.getProperty("InvalidPassword"));
		createaccountpage.clickOnCreateAnAccountButton();
		Thread.sleep(3000);
		Assert.assertTrue(createaccountpage.errorMessagePassword().isDisplayed());
	}
	
	@AfterSuite
	public void Close_quit(){
		Toclose();
	}
	
	
}
