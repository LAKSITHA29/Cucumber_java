package com.cucRuner;

////import org.junit.runner.RunWith;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
////@RunWith(Cucumber.class)--junit
//
//@CucumberOptions(plugin={"pretty","html:target/cucumber-reports/Cucumber.html"},features="src/test/resources/com/features/Login.feature",glue="stepDefinitions")
//
//public class RunnerTest extends AbstractTestNGCucumberTests{
//	
//
//}
//package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/Cucumber.html"},features="src\\test\\resources\\com\\features\\Login.feature",glue="stepDefinitions")
public class RunnerTest extends  AbstractTestNGCucumberTests{

}