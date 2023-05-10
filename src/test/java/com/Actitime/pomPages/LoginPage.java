package com.Actitime.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement usernameTF;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
	private WebElement passwordTF;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[6]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public HomePage logindetails(String name, String pwd)
	{
		usernameTF.sendKeys(name);
		passwordTF.sendKeys(pwd);
		loginBtn.click();
		return new HomePage(driver);
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
//	public void username(String name)
//	{
//		usernameTF.sendKeys(name);
//	}
//	
//	public void password(String pwd)
//	{
//		passwordTF.sendKeys(pwd);
//	}
//	
//	public void loginbutton()
//	{
//		loginBtn.click();
//	}

}
