package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSitesPage {
    WebDriver driver;

    @FindBy(linkText = "Practice Automation")
    WebElement practiceAutomationLink;

    public DemoSitesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickPracticeAutomation() {
        practiceAutomationLink.click();
    }

}
