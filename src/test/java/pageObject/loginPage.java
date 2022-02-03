package pageObject;

import base.setUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends setUp {
    //here we store anything from login page
    //UI Web Elements

    public loginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setUp.driver = driver;
    }

    @FindBy(how = How.XPATH,using = "//input[@name='email']")
    public WebElement emailLocator;

    //any function that requires in this page
    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);
    }


}
