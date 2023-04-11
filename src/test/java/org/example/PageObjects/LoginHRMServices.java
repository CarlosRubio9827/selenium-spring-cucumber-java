package org.example.PageObjects;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Component
public class LoginHRMServices {

    @Autowired
    private LoginHRMPageObject login;
    private WebDriver driver;

    @Autowired
    public LoginHRMServices(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        this.driver = driver;
    }

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeUsername(String username){
        this.login.getUsername().sendKeys(username);
    }

    public void writePassword(String password){
        this.login.getPassword().sendKeys(password);
    }

    public void submitLogin(){
        this.login.getLoginBtn().click();
    }

    public boolean validateDashboard(){
        return this.login.getDashboardText().isDisplayed();
    }

}
