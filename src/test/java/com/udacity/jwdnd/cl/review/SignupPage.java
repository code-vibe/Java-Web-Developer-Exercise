package com.udacity.jwdnd.cl.review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    @FindBy(css = "#inputFirstName")
    private WebElement firstnameField;

    @FindBy(css = "#inputLastName")
    private WebElement lastnameField;

    @FindBy(css = "#inputUsername")
    private WebElement usernameField;

    @FindBy(css = "#inputPassword")
    private WebElement passwordField;

    @FindBy(css = "#submit-button")
    private WebElement submitButton;

    public SignupPage (WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void signup(String fistName, String lastName, String username, String password) {
            this.firstnameField.sendKeys(fistName);
            this.lastnameField.sendKeys(lastName);
            this.usernameField.sendKeys(username);
            this.passwordField.sendKeys(password);
            this.submitButton.click();
    }

}
