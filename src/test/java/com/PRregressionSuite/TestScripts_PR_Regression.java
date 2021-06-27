package com.PRregressionSuite;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qatest.PR.base.BaseClass;
import com.qatest.PR.pages.InOfficeAppointment;
import com.qatest.PR.pages.LoginPage;
import com.qatest.PR.util.Helper;

//import com.qatest.PR.base.BaseClass;
//import com.qatest.PR.pages.InOfficeAppointment;
//import com.qatest.PR.pages.LoginPage;
//import com.qatest.PR.util.Helper;

public class TestScripts_PR_Regression extends BaseClass {
	
	  @Test (priority=1, dataProvider = "getLoginTestData") // Login into the system with valid credentials
	  public void LoginValidation(String UserID, String Passwd){
//	  System.out.println("UserID --> " + UserID); 
//	  System.out.println("Passwd --> " + Passwd); 
		  System.out.println("One"); 
	  LoginPage login = PageFactory.initElements(driver,LoginPage.class); 
	            login.LoginPageElementsAndMethods(UserID, Passwd);
	  Helper.captureScreenshot(driver); // screenshot
  }
	
	  
	  @Test (priority=2)
	  public void mInOfficeAppointmentValidation(){
		  System.out.println("Second"); 
//	  System.out.println("Passwd --> " + Passwd); 
		  InOfficeAppointment userInOfficeAppointment = PageFactory.initElements(driver,InOfficeAppointment.class); 
		  userInOfficeAppointment.InOfficeAppointmentElementsAndMethods();
	  Helper.captureScreenshot(driver); // screenshot
  }
	
}
