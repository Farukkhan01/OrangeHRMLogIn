package com.runner;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"dashboard.steps"},
		tags = {"@jenkinsTest"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true
		)
public class RunFaruk   {

   @AfterClass	
	
	public static void writeExtenReport() {
	
	   Reporter.setSystemInfo("User.Name", System.getProperty("User.Name"));
      Reporter.setSystemInfo("Time zone", System.clearProperty("user.timezone"));
      Reporter.setSystemInfo("Machine", "Windows 10"+ "64 Bit");
      Reporter.setSystemInfo("Selenium", "3.6.2");
      Reporter.setSystemInfo("Maven", "3.6.2");
     Reporter.setSystemInfo("Java Version", "1.8.0_231");

   }

}


