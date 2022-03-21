package stepDef;

import base.setUp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.messages.internal.com.google.common.base.Strings;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends setUp {
    public static String url;
    public static String existingStudentEmail;
    public static String existingStudentPassword;
    public static String driverType = System.getProperty("browser");
    public static String envData = System.getProperty("env");

    @Before
    public void startTest(){

        if (Strings.isNullOrEmpty(driverType)){
            driverType = "chrome";
        }
        if (Strings.isNullOrEmpty(envData)){
            envData = "qa";
        }

        driver = setUpBrowser(driverType);

        // Environment selections = qa/stg/prod

        switch (envData){
            case "qa":
                url = "http://qa.taltektc.com";
                existingStudentEmail = "testQAenv@test.com";
                existingStudentPassword = "$tudent@123";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                existingStudentEmail = "testSTGenv@test.com";
                existingStudentPassword = "$tudent@123";

                break;
            case "prod":
                url = "http://prod.taltektc.com";
                existingStudentEmail = "testPRODenv2@test.com";
                existingStudentPassword = "$tudent@123";
                break;

        }
        driver.get(url);
    }

    @After
    public void endTest(Scenario scenario){
        try {
            if (scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                // embed it in the report.
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } finally {
            driver.quit();
        }
    }
}
