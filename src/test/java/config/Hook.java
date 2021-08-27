package config;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends Base{
    @Before()
    public void initial(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/cdriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After()
    public void cleanUp(){
        driver.close();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){

        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");

    }
}
