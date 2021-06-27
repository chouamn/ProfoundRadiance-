package com.qatest.PR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InOfficeAppointment {
	
	
	public WebDriver driver;
	public InOfficeAppointment(WebDriver driver){
	   this.driver = driver;	
	   }
	//name="user_state"
	// WebElements - login page
	@FindBy(linkText="I Accept") WebElement AcceptBttn;
	@FindBy(linkText="IN-OFFICE APPOINTMENT") WebElement InOffAppBttn;
    @FindBy(id="filing_case_appointment_date") WebElement ChooseDate;
    @FindBy(xpath="//input[@type ='radio' and @value ='7']") WebElement ElementsAndMethods;
    @FindBy(name="user_first_name") WebElement FName;
    @FindBy(name="user_last_name") WebElement LName;
    @FindBy(name="user_email") WebElement EAddress;
    @FindBy(name="user_phone") WebElement PhoneNum;
	@FindBy(name="user_address_line1") WebElement TextboxAddressLine1;
	@FindBy(name="user_city") WebElement UserCity;
    @FindBy(name="user_state") WebElement UserState;
    @FindBy(name="user_zipcode") WebElement UserZipCode;
    @FindBy(name="payst") WebElement PayAtOffice;
	@FindBy(name="on_submit") WebElement SubmitBttn;
	
@Test ()  // Login into the system with valid credentials
public void InOfficeAppointmentElementsAndMethods() {
	   try {
		    Thread.sleep(4000); // Wait statement
		    AcceptBttn.click(); 
		    Thread.sleep(4000); // Wait statement
		    InOffAppBttn.click();
		//    ChooseDate.sendKeys(udate);
		 //   ElementsAndMethods.
	      //      Password.sendKeys(pass); // Enter valid password into the field
	
	            Thread.sleep(4000); // Wait statement
	      
	            // Create object of WebDriverWait class
	    //         WebDriverWait waitLoginBtn = new WebDriverWait(driver,360);
	             // Wait till element is visible
	   //          waitLoginBtn.until(ExpectedConditions.elementToBeClickable(LoginBtn));
	
	  //           LoginBtn.click(); // Click on the Sign In button to login.
	             
	    //         Thread.sleep(6000);
	             
	             // Validate user login
	    //     WebElement WaystoFile = driver.findElement(By.linkText("Ways to File"));	 
	      // 	 Assert.assertTrue(WaystoFile.isDisplayed(), "WaystoFile webelement is not displayed"); 
	
        } catch (InterruptedException e) {
      }	
   }

}
