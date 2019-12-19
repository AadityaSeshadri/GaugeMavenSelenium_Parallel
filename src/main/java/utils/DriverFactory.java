package utils;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSpec;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSpec;
import com.thoughtworks.gauge.BeforeSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    private static final String FIREFOX = "firefox";
    private static final String IE = "ie";
    private static final String DEFAULT = "chrome";
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void Setup() {
        //String browser = System.getenv("BROWSER");

        // Uses chrome driver by default
        //if (browser == null) {
            //ystem.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\chromedriver.exe");
             driver=new ChromeDriver();
             //driver=new ChromeDriver();

            //WebDriverManager.chromedriver().setup();
            //driver = new ChromeDriver();
        //}

        // switch (browser)
        // {
        //     case "IE":
        //         WebDriverManager.iedriver().setup();
        //         driver = new InternetExplorerDriver();
        //     case "FIREFOX":
        //         WebDriverManager.firefoxdriver().setup();
        //         driver = new FirefoxDriver();
        //     default:
        //     //   ChromeOptions chromeOptions = new ChromeOptions();
        //     // chromeOptions.setBinary("/usr/bin/google-chrome-stable");
        //     // chromeOptions.addArguments("--headless");
                
        //     //WebDriverManager.chromedriver().setup();
        //     //driver = new ChromeDriver();

        // }
    }

   // @AfterSuite
    public void TearDown() {
        driver.close();
        driver.quit();



    }
}
