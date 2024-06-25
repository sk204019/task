package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterFormPage {


	public RegisterFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//WebDriver driver;

	@FindBy(id= "vfb-5")
	WebElement fname;

	@FindBy(id ="vfb-7")
	WebElement lName;

	@FindBy(id = "vfb-31-1")
	WebElement gender;

	@FindBy(id = "vfb-14")
	WebElement emailInput;

	@FindBy(id = "vfb-4")
	WebElement submitButton;

	/*
	@FindBy(id = "vfb-13-address")
	WebElement adress;

	@FindBy(id = "vfb-13-address-2")
	WebElement streetAddress;


	@FindBy(id = "vfb-13-zip")
	WebElement city;


	@FindBy(id = "vfb-18")
	WebElement dateOfDemo;


	@FindBy(id = "vfb-19")
	WebElement mobileNumber;


	@FindBy(id = "vfb-20-4")
	WebElement courseIntrested;

	@FindBy(id = "vfb-23")
	WebElement enterYourQuery;

	 */

	/*
	@FindBy(id = "registerId")
	WebElement registerId;
	 */
	/*	public RegisterFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} */



	public void fName(String firstName) {
		fname.sendKeys(firstName);
	}

	public void lName(String lastName) {
		lName.sendKeys(lastName);
	}

	public void clickGender() {
		gender.click();
	}

	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}


	public void clickSubmitButton() {
		submitButton.click();
	}

	/*
	public String getRegisterId() {
		return registerId.getText();
	}
	 */

	public boolean fNameEmpty() {
		return fname.getAttribute("id").isEmpty();
	}

	public boolean lNameEmpty() {
		return lName.getAttribute("id").isEmpty();
	}

	public boolean isEmailEmpty() {
		return emailInput.getAttribute("id").isEmpty();
	}

}


