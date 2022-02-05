package stepDef;

import base.setUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;

public class loginStep extends setUp {

    loginPage lp = new loginPage (driver);

    @Given("I am at the TalentTek homepage")
    public void iAmAtTheTalentTekHomepage() {


    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        lp.enterEmailAddress("muhammad.shakik07@gmail.com");
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        
    }

    @When("I click on the Login Button")
    public void iClickOnTheLoginButton() {
        
    }

    @Then("I should be able to login successfully")
    public void iShouldBeAbleToLoginSuccessfully() {
    }
}
