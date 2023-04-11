package org.example.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjects.SignUpServices;
import org.example.conf.DriverConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefs {

    @Autowired
    private SignUpServices signUp;
    @Given("^Pepito wants to have an account$")
    public void pepito_wants_to_have_an_account() throws InterruptedException {


        signUp.go("https://demo.automationtesting.in/Register.html");
        signUp.writeFirstName("Charlie");
        signUp.writeLastName("Blond");
        signUp.writeEmailAddress("charlie@email.com");
        signUp.writePhone("3158961966");
        signUp.selectGenderMale();
        signUp.writeYearBirthDay("1998");
        signUp.writeMonthBirthDay("April");
        signUp.writeDayBirthDay("27");
        signUp.writePassword("1234");
        signUp.writeConfirmPassword("1234");
        signUp.clickOnSubmit();
        Thread.sleep(4000);

    }

    @When("^he sends required information to get the account$")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("^he should be told that the account was created$")
    public void he_should_be_told_that_the_account_was_created() {

    }


}
