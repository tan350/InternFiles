package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseLuma;

public class CustomerLoginPage extends TestBaseLuma {

	//locating WebElements
	@FindBy(xpath="//span[text()='Customer Login']")
	WebElement customerLoginHeader;
	
	@FindBy(xpath="(//strong[@id='block-customer-login-heading'])[1]")
	WebElement registeredCustomersHeader;
	
	@FindBy(xpath="(//strong[@id='block-new-customer-heading'])[1]")
	WebElement newCustomersHeader;
	
	@FindBy(xpath="//label[@for='email']")
	WebElement labelEmail;
	
	@FindBy(xpath="(//label[@for='pass'])[1]")
	WebElement labelPassword;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="(//input[@id='pass'])[1]")
	WebElement password;
	
	@FindBy(xpath="(//button[@id='send2'])[1]")
	WebElement signInButton;
	
	@FindBy(xpath="(//span[text()='Forgot Your Password?'])[1]")
	WebElement forgotYourPassword;
	
	@FindBy(xpath="(//span[text()='Create an Account'])[1]")
	WebElement createAnAccountButton;
	
	@FindBy(xpath="//div[@class='widget block block-static-block']")
	WebElement tryDemoCustomerAccessDialog;
	
	@FindBy(xpath="(//li[@class='greet welcome'])[1]")
	WebElement welcomeMessage;
	
	@FindBy(xpath="//div[@for='email']")
	WebElement errorMessageEmail;
	
	@FindBy(xpath="//div[contains(text(),'The account sign-in was incorrect')]")
	WebElement errorMessagePasswordAfterClickSignin;
	
	@FindBy(xpath="//div[@for='pass']")
	WebElement errorMessageBlankPassword;
	
	@FindBy(xpath="//div[text()='Incorrect CAPTCHA']")
	WebElement errorMessageIncorrectCaptcha;

	//method for initializing objects using PageFactory
	public CustomerLoginPage(){
		PageFactory.initElements(driver,this);
	}

	//methods
	public WebElement customerLoginHeader(){
		return customerLoginHeader;
	}
	
	public WebElement registeredCustomersHeader(){
		return registeredCustomersHeader;
	}
	
	public WebElement newCustomersHeader(){
		return newCustomersHeader;
	}
	
	public WebElement labelEmail(){
		return labelEmail;
	}

	public WebElement labelPassword(){
		return labelPassword;
	}
	
	public void enterEmail(String email1){
		email.sendKeys(email1);
	}

	public void enterPassword(String pass){
		password.sendKeys(pass);
	}
	
	public void clickOnsignInButton(){
		signInButton.click();
	}
	
	public void clickOnForgotYourPasswordButton(){
		forgotYourPassword.click();
	}

	public void clickOnCreateAnAccountButton(){
		createAnAccountButton.click();
	}

	public WebElement tryDemoCustomerAccessDialog(){
		return tryDemoCustomerAccessDialog;
	}
	
	public WebElement welcomeMessage(){
		return welcomeMessage;
	}
	
	public WebElement errorMessageEmail(){
		return errorMessageEmail;
	}
	
	public WebElement errorMessagePasswordAfterClickSignin(){
		return errorMessagePasswordAfterClickSignin;
	}
	
	public WebElement errorMessageBlankPassword(){
		return errorMessageBlankPassword;
	}
	
	public WebElement errorMessageIncorrectCaptcha(){
		return errorMessageIncorrectCaptcha;
	}

}
