package stepDef;

import base.setUp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import sun.lwawt.macosx.CSystemTray;

public class Hook extends setUp {
    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envData = System.getProperty("env");

    @Before
    public void startTest(){

        driver = setUpBrowser(driverType);

        // Environment selections = qa/stg/prod

        switch (envData){
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stg":
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
