package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "Features",
            glue = {"stepDefinitions"},
            tags = "@SmokeTest",
            plugin = {"html: test-reports"},
            monochrome = true
    )

   /* @CucumberOptions(
            features = "Features",
            glue = {"stepDefinitions"},
            tags = "@SimpleAlert",
            plugin = {"pretty"},
            monochrome = true
    )

    @CucumberOptions(
            features = "Features",
            glue = {"stepDefinitions"},
            tags = "@SimpleAlert",
            plugin = {"json: test-reports/json-report.json"},
            monochrome = true
    )*/

    public class Activitiesrunner {
    }

