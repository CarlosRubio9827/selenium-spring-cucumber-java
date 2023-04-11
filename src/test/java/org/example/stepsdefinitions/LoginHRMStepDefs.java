package org.example.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjects.LoginHRMServices;
import org.example.PageObjects.SignUpServices;
import org.example.conf.DriverConfig;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = {DriverConfig.class})
public class LoginHRMStepDefs {


    static final String ADMIN = "Admin";
    static final String PASSWORD = "admin123";
    @Autowired
    private LoginHRMServices login;

    @Given("^a User wants to access the application$")
    public void given(){
        login.go("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("^they provide their login credentials$")
    public void when()throws InterruptedException{
        login.writeUsername(ADMIN);
        login.writePassword(PASSWORD);
        login.submitLogin();
        Thread.sleep(4000);
    }
    @Then ("^the user should be logged in successfully.$")
    public void then(){
        Assert.assertTrue(login.validateDashboard());
    }

}
