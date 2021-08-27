package config;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue= "",
        plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@Regress",
        monochrome = true
)
public class Runner extends Base {
}
