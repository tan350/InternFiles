package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBaseLuma;


public class HomePage extends TestBaseLuma {

	//locating WebElements
	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	WebElement createAnAccount;
	
	@FindBy(xpath="(//li[@class='authorization-link'])[1]")
	WebElement signIn;

	//method for initializing objects using PageFactory
	public HomePage(){
		PageFactory.initElements(driver,this);
	}

	//methods
	public void clickOnCreateanAccount(){
		createAnAccount.click();
	}

	public void clickOnSignIn(){
		signIn.click();
	}
}
