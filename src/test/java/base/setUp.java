package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class setUp {

    public static WebDriver driver;

    // Browser Set up is from browser dependency, which is "WebDriverManager"

    public static WebDriver setUpBrowser(String driverType) {
        if (driverType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("ff")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
