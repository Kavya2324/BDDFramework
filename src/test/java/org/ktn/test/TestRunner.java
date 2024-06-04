package org.ktn.test;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
				 tags = "@AdidasShoesCheckout",
                 glue="org.ktn.stepdefinition",
                 plugin= {"pretty","junit:target/JUnitReports/report.xml",
                		 "json:target/JSONReports/report.json",
                		 "html:target/HtmlReports"},
                 publish=true
		)


public class TestRunner {

}
