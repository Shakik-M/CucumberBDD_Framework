package stepDef;

import base.setUp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.internal.com.google.common.base.Strings;;

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
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                break;
            case "prod":
                url = "http://prod.taltektc.com";
                break;

        }
        driver.get(url);
    }

    @After
    public void endTest(){
//        driver.close();
    }
}
