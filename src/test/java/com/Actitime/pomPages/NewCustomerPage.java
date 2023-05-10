package com.Actitime.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	
	public WebDriver driver;
	@FindBy(xpath="")
	private WebElement customernameTB;
	
	@FindBy(xpath="")
	private WebElement descriptionTB;
	
	@FindBy(xpath="")
	private WebElement selectcustomerDD;
	
	@FindBy(xpath="")
	private WebElement createcustomerBtn;
	
	public NewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void createnewcustomer(String name, String describe)
	{
		customernameTB.sendKeys(name);
		descriptionTB.sendKeys(describe);
		createcustomerBtn.click();
	}

	public WebElement getCustomernameTB() {
		return customernameTB;
	}

	public WebElement getDescriptionTB() {
		return descriptionTB;
	}

	public WebElement getSelectcustomerDD() {
		return selectcustomerDD;
	}

	public WebElement getCreatecustomerBtn() {
		return createcustomerBtn;
	}

	
}
