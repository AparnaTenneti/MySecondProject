package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Second_Project.feature",
                   glue="stepDefnitions",
                   dryRun=false,
                   monochrome=true,
                   plugin={"pretty", "html:target/Cucumber-Reports/Html_Report.html",
                		   "junit:target/Cucmuber_Reports/Xml_Report.xml",
                		   "json:target/Cucumber_Reports/Json_Report.json",
                		   "pretty:target/Cucumber_Report/Text_Report.txt"})
public class Run {

}
