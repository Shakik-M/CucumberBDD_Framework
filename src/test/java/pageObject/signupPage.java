package pageObject;

import base.setUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signupPage extends setUp {

    public signupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        setUp.driver = driver;
    }

    @FindBy(how=How.XPATH,using = "//*[@class='new-account']")
    public WebElement createNewAcLocator;

    public void clickCreateNewAcButton(){
        createNewAcLocator.click();
    }

    public void verifySignupPageTitle(){
        Assert.assertEquals("Sign Up", driver.getTitle());
    }

    @FindBy(how=How.NAME,using = "firstName")
    public WebElement firstNameLocator;

    public void enterFirstName(String firstName){
        firstNameLocator.sendKeys(firstName);
    }

    @FindBy(how=How.NAME,using = "lastName")
    public WebElement lastNameLocator;

    public void enterLastName(String lastName){
        lastNameLocator.sendKeys(lastName);
    }

    @FindBy(how=How.NAME,using= "email")
    public WebElement newEmailLocator;

    public void enterNewEmailAddress(String newEmail){
        newEmailLocator.sendKeys(newEmail);
    }

    @FindBy(how=How.NAME,using = "password")
    public WebElement enterNewPasswordLocator;

    public void enterNewPassword(String newPassword){
        enterNewPasswordLocator.sendKeys(newPassword);
    }

    @FindBy(how=How.NAME,using = "confirmPassword")
    public WebElement confirmPasswordLocator;

    public void confirmNewPassword(String confirmPassword){
        confirmPasswordLocator.sendKeys(confirmPassword);
    }

    @FindBy(how=How.XPATH,using = "//*[@name='month']/option[3]")
    public WebElement monthLocator;

    public void selectMonth(){
        monthLocator.click();
    }

    @FindBy(how=How.XPATH,using = "//*[@name='day']/option[5]")
    public WebElement dayLocator;

    public void selectDay(){
        dayLocator.click();
    }

    @FindBy(how=How.XPATH,using = "//*[@name='year']/option[77]")
    public WebElement yearLocator;

    public void selectYear(){
        yearLocator.click();
    }

    @FindBy(how = How.ID,using = "male")
    public WebElement genderLocator;

    public void selectGender(){
        genderLocator.click();
    }

    @FindBy(how = How.ID,using = "defaultCheck1")
    public WebElement agreeButton;

    public void agreeTermsAndCon(){
        agreeButton.click();
    }

    @FindBy(how = How.XPATH,using = "//*[@type='submit']")
    public WebElement submitButton;

    public void clickSubmitButton(){
        submitButton.click();
    }

    @FindBy(how = How.XPATH,using = "//*[@id='success_message']/div")
    public WebElement signupSuccessMessageLocator;

    public void verifySignupSuccessMessage(){
        Boolean signupSuccessMessage = signupSuccessMessageLocator.getText().contains("Thank you for sign up, here your id - ");
        Assert.assertTrue(signupSuccessMessage,"Thank you for sign up, here your id - ");
    }



}
