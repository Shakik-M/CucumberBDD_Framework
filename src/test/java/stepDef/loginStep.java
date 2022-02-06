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
        lp.verifyHomepageTitle();

    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        lp.enterEmailAddress("testQAenv@test.com");
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        lp.enterValidPassword("$tudent@123");
    }

    @When("I click on the Login Button")
    public void iClickOnTheLoginButton() {
        lp.clickLoginButton();
    }

    @Then("I should be able to login successfully")
    public void iShouldBeAbleToLoginSuccessfully() {
        lp.verifyLoginSuccessMessage();
    }
}
