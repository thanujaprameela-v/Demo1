package skeleton;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports","json:src/cucumber-reports/report1.json"},
features= {"src/test/resources/CaseStudy/Scenario2.feature"})






 

/*  html report
 (plugin= {"pretty","html:src/cucumber-reports"},
                features= {"src/test/resources/CaseStudy/Scenario2.feature"}) */ 
         //dryRun=true,monochrome=true,tags= {"@nonui,@demo" },
public class CucumberRunner
{

 
}