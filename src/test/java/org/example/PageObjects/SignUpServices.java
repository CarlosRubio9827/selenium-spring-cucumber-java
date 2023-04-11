package org.example.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {

    @Autowired
    private SignUpPageObject signUpPageObject;

    private WebDriver driver;

    @Autowired
    public SignUpServices(WebDriver driver) {

        this.driver = driver;
    }

    public void go(String url) {

        this.driver.get(url);
    }

    public void writeFirstName(String firstName) {

        this.signUpPageObject.getFirstName().sendKeys(firstName);

    }

    public void writeLastName(String lastName) {
        this.signUpPageObject.getLastName().sendKeys(lastName);
    }

    public void writeEmailAddress(String emailAddress) {
        this.signUpPageObject.getEmailAddress().sendKeys(emailAddress);
    }

    public void writePhone(String phone) {
        this.signUpPageObject.getPhone().sendKeys(phone);
    }

    public void selectGenderFemale() {
        this.signUpPageObject.getGenderMale().click();
    }

    public void selectGenderMale() {
        this.signUpPageObject.getGenderMale().click();
    }

    public void selectCountry(String country) {
        new Select(this.signUpPageObject.getCountries()).selectByValue(country);
    }

    public void writeYearBirthDay(String yearBirthDay) {
        new Select(this.signUpPageObject.getYearBirthDay()).selectByValue(yearBirthDay);
    }

    public void writeMonthBirthDay(String monthBirthDay) {
        new Select(this.signUpPageObject.getMonthBirthDay()).selectByValue(monthBirthDay);
    }

    public void writeDayBirthDay(String dayBirthDay) {
        new Select(this.signUpPageObject.getDayBirthDay()).selectByValue(dayBirthDay);
    }

    public void writePassword(String password) {
        this.signUpPageObject.getPassword().sendKeys(password);
    }

    public void writeConfirmPassword(String confirmPassword) {
        this.signUpPageObject.getConfirmPassword().sendKeys(confirmPassword);
    }

    public void clickOnSubmit() {
        this.signUpPageObject.getSubmit().click();
    }
}
