package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseLuma;

public class CreateNewCustomerAccountPage extends TestBaseLuma {

	//locating WebElements
	@FindBy(xpath="//a[@class='logo']")
	WebElement logo;

	@FindBy(xpath="//span[text()='Create New Customer Account']")
	WebElement createNewCustomerAccount;
	
	@FindBy(xpath="//span[text()='Personal Information']")
	WebElement personalInformation;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='is_subscribed']")
	WebElement signUpForNewsletterCheckbox;
	
	@FindBy(xpath="//span[text()='Sign-in Information']")
	WebElement signInInformation;
	
	@FindBy(xpath="//input[@id='email_address']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[@title='Create an Account']")
	WebElement createAnAccountButton;
	
	@FindBy(xpath="//div[contains(text(),'There is already an account')]")
	WebElement alreadyAccountMessage;
	
	@FindBy(xpath="//a[text()='click here']")
	WebElement forgotPassword;
	
	@FindBy(xpath="//input[@id='newsletter']")
	WebElement emailForSubscribe;
	
	@FindBy(xpath="//button[@title='Subscribe']")
	WebElement subscribeButton;
	
	@FindBy(xpath="//div[contains(text(),'already subscribed')]")
	WebElement alreadySubscribedMessage;
	
	@FindBy(xpath="//label[@for='firstname']")
	WebElement labelFirstName;
	
	@FindBy(xpath="//label[@for='lastname']")
	WebElement labelLastName;
	
	@FindBy(xpath="//label[@for='is_subscribed']")
	WebElement labelSignUpForNewsletter;
	
	@FindBy(xpath="//label[@for='email_address']")
	WebElement labelEmail;
	
	@FindBy(xpath="//label[@for='password']")
	WebElement labelPassword;
	
	@FindBy(xpath="//label[@for='password-confirmation']")
	WebElement labelConfirmPassword;
	
	@FindBy(xpath="//div[@id='firstname-error']")
	WebElement errorMessageFirstname;
	
	@FindBy(xpath="//div[@id='lastname-error']")
	WebElement errorMessageLastname;
	
	@FindBy(xpath="//div[@id='email_address-error']")
	WebElement errorMessageEmail;
	
	@FindBy(xpath="//div[@id='password-error']")
	WebElement errorMessagePassword;
	
	@FindBy(xpath="//div[@id='password-confirmation-error']")
	WebElement errorMessageConfirmpassword;

	//method for initializing objects using PageFactory
	public CreateNewCustomerAccountPage(){
		PageFactory.initElements(driver,this);
	}

	//methods for WebElements
	public WebElement logo(){
		return logo;
	}
	
	public WebElement createNewCustomerAcoountHeader(){
		return createNewCustomerAccount;
	}
	
	public WebElement personalInformationHeader(){
		return personalInformation;
	}
	
	public WebElement signInInformationHeader(){
		return signInInformation;
	}
	
	public void enterFirstName(String name){
		firstName.sendKeys(name);
	}

	public void enterLastName(String name){
		lastName.sendKeys(name);
	}
	
	public void checkSignUpForNewsletter(){
		signUpForNewsletterCheckbox.click();
	}
	
	public void enterEmail(String emailaddress){
		email.sendKeys(emailaddress);
	}

	public void enterPassword(String pass){
		password.sendKeys(pass);
	}
	
	public void enterConfirmPassword(String confirmpass){
		confirmPassword.sendKeys(confirmpass);
	}
	
	public void clickOnCreateAnAccountButton(){
		createAnAccountButton.click();
	}
	
	public WebElement alreadyAccountMessage(){
		return alreadyAccountMessage;
	}
	
	public void clickOnForgotPassword(){
		forgotPassword.click();
	}
	
	public void enterEmailForSubscribe(String emailsubscribe){
		emailForSubscribe.sendKeys(emailsubscribe);
	}
	
	public void clickOnSubscribe(){
		subscribeButton.click();
	}
	
	public WebElement alreadySubscribedMessage(){
		return alreadySubscribedMessage;
	}
	
	public WebElement labelFirstName(){
		return labelFirstName;
	}
	
	public WebElement labelLastName(){
		return labelLastName;
	}
	
	public WebElement labelSignUpForNewsletter(){
		return labelSignUpForNewsletter;
	}
	
	public WebElement labelEmail(){
		return labelEmail;
	}
	
	public WebElement labelPassword(){
		return labelPassword;
	}
	
	public WebElement labelConfirmPassword(){
		return labelConfirmPassword;
	}
	
	public WebElement errorMessageFirstName(){
		return errorMessageFirstname;
	}
	
	public WebElement errorMessageLastName(){
		return errorMessageLastname;
	}
	
	public WebElement errorMessageEmail(){
		return errorMessageEmail;
	}
	
	public WebElement errorMessagePassword(){
		return errorMessagePassword;
	}
	
	public WebElement errorMessageConfirmPassword(){
		return errorMessageConfirmpassword;
	}
}
