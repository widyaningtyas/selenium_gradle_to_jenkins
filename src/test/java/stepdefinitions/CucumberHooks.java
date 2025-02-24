package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CucumberHooks {
    private static WebDriver webDriver;

    @Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("incognito");
        webDriver = new ChromeDriver(chromeOptions);
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }
}
