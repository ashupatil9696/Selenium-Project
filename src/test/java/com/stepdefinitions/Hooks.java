package com.stepdefinitions;

 

import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.page.object.LoginPage;
import com.utilities.*;

 

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

 

public class Hooks {

 

    static WebDriver driver;

 

    @Before("@tag or @app")
    public void before_launchBrowser(Scenario scenario) {

            //String path = System.getProperty("user.dir");
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashutpat\\Downloads\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        initPageDrivers(driver);
        driver.manage().window().maximize();
    }

 

    public static void initPageDrivers(WebDriver driver) {
        new LoginPage(driver);
        new Utility(driver);
        new Login_SD(driver);
        new AutomationBase(driver);
        new App_SD(driver);
    }

 

    @After("@tag or @app")
    public void after_quitBrowser(Scenario scenario) {
        if (scenario.isFailed() && driver != null) {
            byte[] data = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
            driver.quit();
        }
        if (driver != null) {
            driver.quit();
        }
    }

 

}