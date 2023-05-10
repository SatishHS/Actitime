package com.Actitime.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"container_tasks\"]")
	private WebElement taskBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public TaskPage taskbutton()
	{
		taskBtn.click();
		return new TaskPage(driver);
		
	}

	public WebElement getTaskBtn() {
		return taskBtn;
	}

	
}
