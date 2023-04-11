package org.example.PageObjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SignUpPageObject {

    @Autowired
    public SignUpPageObject(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='tel']")
    private WebElement phone;

    @FindBy(xpath = "//input[@value='FeMale']")
    private WebElement genderFemale;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement genderMale;

    @FindBy(id = "countries")
    private WebElement countries;

    @FindBy(id = "yearbox")
    private WebElement yearBirthDay;

    @FindBy(xpath = "//select[@placeholder='Month']")
    private WebElement monthBirthDay;

    @FindBy(id = "daybox")
    private WebElement dayBirthDay;

    @FindBy(id = "firstpassword")
    private WebElement password;

    @FindBy(id = "secondpassword")
    private WebElement confirmPassword;

    @FindBy(id = "submitbtn")
    private WebElement submit;


}
