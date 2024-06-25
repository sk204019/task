package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeAutomationPage {
	    WebDriver driver;

	    @FindBy(linkText = "Register Form")
	    WebElement registerFormLink;

	    public PracticeAutomationPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void clickRegisterForm() {
	        registerFormLink.click();
	    }
}
