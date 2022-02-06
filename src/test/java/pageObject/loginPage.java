package pageObject;

import base.setUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage extends setUp {
    //here we store anything from login page
    //UI Web Elements

    public loginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setUp.driver = driver;
    }

    @FindBy(how = How.XPATH,using = "//input[@name='email']")
    public WebElement emailLocator;

    @FindBy(how = How.NAME,using = "password")
    public WebElement passwordLocator;

    @FindBy(how = How.XPATH,using = "//input[@value='Log In']")
    public WebElement loginButtonLocator;

    @FindBy(how = How.TAG_NAME,using = "legend")
    public WebElement successMessageLocator;

    public void verifyHomepageTitle(){
        String act = driver.getTitle();
        String exp = "Sign In";
        Assert.assertEquals(exp, act);
    }

    //any function that requires in this page
    public void enterEmailAddress(String email) {
        emailLocator.sendKeys(email);
    }

    public void enterValidPassword(String password) {
        passwordLocator.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButtonLocator.click();
    }

    public void verifyLoginSuccessMessage(){
        String expSuccessMsg = "Welcome to TalentTek";
        String actSuccessMsg = successMessageLocator.getText();
        Assert.assertEquals(expSuccessMsg, actSuccessMsg);
    }




}
