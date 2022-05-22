import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

    @CucumberOptions(
            //path of feature file
            features = "src/test/java/Features",
            //path of step definition file
            glue = "C:/Users/user/eclipse-workspace/test2/src/test/resources/Glue.java"
    )
    public class CucumberRunner extends TestNGCucumberRunner {
    }


