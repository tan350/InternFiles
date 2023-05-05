package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.CustomerLoginPage;
import Pages.HomePage;
import TestBase.TestBaseLuma;

public class CustomerLoginTest extends TestBaseLuma {
	

	HomePage homepage;
	CustomerLoginPage  customerloginpage;

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException{
		initialization();
		customerloginpage=new CustomerLoginPage();
	}
	
	@Test(priority = 1)
	public void navigate_to_homepage_click_on_signin() {
		homepage= new HomePage();
		homepage.clickOnSignIn();
		Assert.assertEquals(driver.getTitle(),"Customer Login");
	}
	
	@Test(priority = 2)
	public void visibility_customer_login_header() {
		Assert.assertTrue(customerloginpage.customerLoginHeader().isDisplayed());
	}

	@Test(priority = 3)
	public void visibility_registered_customers_header() {
		Assert.assertTrue(customerloginpage.registeredCustomersHeader().isDisplayed());
	}
	
	@Test(priority = 4)
	public void verify_label_email_on_page(){
		Assert.assertTrue(customerloginpage.labelEmail().isDisplayed());
	}
	
	@Test(priority = 5)
	public void verify_label_password_on_page(){
		Assert.assertTrue(customerloginpage.labelPassword().isDisplayed());
	}
	
	@Test(priority = 6)
	public void visibility_try_demo_customer_access_dialog() {
		Assert.assertTrue(customerloginpage.tryDemoCustomerAccessDialog().isDisplayed());
	}
	
	@Test(priority = 7)
	public void createanaccountbutton_redirection() {
		customerloginpage.clickOnCreateAnAccountButton();
		Assert.assertEquals(driver.getTitle(),"Create New Customer Account");
		driver.navigate().back();
	}
	
	@Test(priority = 8)
	public void forgotyourpasswordbutton_redirection() throws InterruptedException {
		homepage= new HomePage();
		homepage.clickOnSignIn();
		Thread.sleep(2000);
		customerloginpage.clickOnForgotYourPasswordButton();
		Assert.assertEquals(driver.getTitle(),"Forgot Your Password?");
		driver.navigate().back();
	}
	
	
	@Test(priority =9)
	public void sign_in_with_invalid_credentials() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("InvalidEmail"));
		customerloginpage.enterPassword(properties.getProperty("InvalidPassword"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Assert.assertTrue(customerloginpage.errorMessageEmail().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 10)
	public void sign_in_with_invalid_email() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("InvalidEmail"));
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Assert.assertTrue(customerloginpage.errorMessageEmail().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 11)
	public void sign_in_with_invalid_password() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("Email"));
		customerloginpage.enterPassword(properties.getProperty("InvalidPassword"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Assert.assertTrue(customerloginpage.errorMessageIncorrectCaptcha().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 12)
	public void sign_in_with_blank_email() throws InterruptedException {
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Assert.assertTrue(customerloginpage.errorMessageEmail().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 13)
	public void sign_in_with_Blank_password() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("Email"));
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Assert.assertTrue(customerloginpage.errorMessageBlankPassword().isDisplayed());
		driver.navigate().refresh();
	}
	
	@Test(priority = 14)
	public void sign_in_with_Blank_credentials() throws InterruptedException {
		Thread.sleep(2000);
		customerloginpage.clickOnsignInButton();
		Assert.assertTrue(customerloginpage.errorMessageBlankPassword().isDisplayed());
	}

	@Test(priority = 15)
	public void sign_in_with_valid_credentials() throws InterruptedException {
		customerloginpage.enterEmail(properties.getProperty("Email"));
		customerloginpage.enterPassword(properties.getProperty("Password"));
		Thread.sleep(10000);
		customerloginpage.clickOnsignInButton();
		Thread.sleep(3000);
		Assert.assertTrue(customerloginpage.welcomeMessage().isDisplayed());
	}
	
	@AfterSuite
	public void Close_quit(){
		Toclose();
	}

}
