package com.Actitime.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div[18]/div[1]/div[1]/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addnewBtn;
	
	@FindBy(xpath="/html/body/div[19]/div[1]")
	private WebElement newcustomerBtn;
	
	@FindBy(xpath="/html/body/div[51]/div/div[2]/div[1]/div/div[1]/div[1]/input")
	private WebElement customernameTB;
	
	@FindBy(xpath="/html/body/div[51]/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/textarea")
	private WebElement descriptionTB;
	
	@FindBy(xpath="/html/body/div[51]/div/div[2]/div[1]/div/div[1]/div[3]/div[2]/span/div/div[1]/div[1]/div")
	private WebElement selectcustomerDD;
	
	@FindBy(xpath="/html/body/div[51]/div/div[2]/div[1]/div/div[1]/div[3]/div[2]/span/div/div[2]/div/div[1]/div/div[2]")
	private WebElement createcustomerBtn;
	
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void addnewcustomer()
	{
		addnewBtn.click();
		newcustomerBtn.click();
	}

	public void createnewcustomer(String name, String describe)
	{
		customernameTB.sendKeys(name);
		descriptionTB.sendKeys(describe);
	}

	public void createcustomerbutton()
	{
		createcustomerBtn.click();
	}

	public WebElement getAddnewBtn() {
		return addnewBtn;
	}

	public WebElement getNewcustomerBtn() {
		return newcustomerBtn;
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
	
	
	
	
}
