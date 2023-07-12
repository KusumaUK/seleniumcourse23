package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDef.Baseclass;


@CucumberOptions(features="src/test/java/features/Login.feature",glue="stepDef",monochrome=true,publish=true,tags="@Smoke")

public class Runnerclass extends Baseclass {
	
	
//hierachy
//AbstractTestNGCucumberTests
//Baseclass
//loginTC
}
