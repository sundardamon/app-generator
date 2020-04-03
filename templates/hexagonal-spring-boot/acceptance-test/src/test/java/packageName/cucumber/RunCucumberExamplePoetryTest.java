package packageName.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", strict = true, plugin = {"json:target/cucumber/example-poetry.json", "json:target/cucumber/example-poetry.xml"}, tags = {
    "@ExamplePoetry"}, glue = "classpath:packageName.cucumber")
public class RunCucumberExamplePoetryTest {

}
