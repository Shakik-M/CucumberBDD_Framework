package stepDef;

import base.setUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.signupPage;

public class signupStep extends setUp {

    signupPage sp = new signupPage(driver);

    @And("I click on Create new account button")
    public void iClickOnCreateNewAccountButton() {
        sp.clickCreateNewAcButton();
    }

    @And("I enter valid student information")
    public void iEnterValidStudentInformation() {
        sp.verifySignupPageTitle();
        sp.enterFirstName("TstFrstNm");
        sp.enterLastName("TestLstName");
        sp.enterNewEmailAddress("newTestEmail2@xyz.com");
        sp.enterNewPassword("test@123");
        sp.confirmNewPassword("test@123");
        sp.selectMonth();
        sp.selectDay();
        sp.selectYear();
        sp.selectGender();
    }

    @And("I agree with terms and condition")
    public void iAgreeWithTermsAndCondition() {
        sp.agreeTermsAndCon();
    }

    @When("I click on submit button")
    public void iClickOnSubmitButton() {
        sp.clickSubmitButton();
    }

    @Then("I will be able to create account successfully")
    public void iWillBeAbleToCreateAccountSuccessfully() {
        sp.verifySignupSuccessMessage();
    }
}
