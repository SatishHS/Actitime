package com.Actitime.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Actitime.genericLib.BaseClass;
import com.Actitime.pomPages.HomePage;
import com.Actitime.pomPages.LoginPage;
import com.Actitime.pomPages.TaskPage;

public class TestCase1 extends BaseClass 
{
	@Test
	public void tc1() throws IOException, InterruptedException
	{
		test=reports.createTest("Testcase1");
		
		LoginPage l=new LoginPage(driver);
		HomePage h = l.logindetails(fu.getPropertydata("username"), fu.getPropertydata("pwd"));
		Thread.sleep(10000);
		TaskPage t = h.taskbutton();
		t.addnewcustomer();
		t.createnewcustomer(fu.getPropertydata("customername"), fu.getPropertydata("description"));
		webutilies.dropdown(t.getSelectcustomerDD(), fu.getPropertydata("DDname"));
		t.createcustomerbutton();
		
	}
	

}
