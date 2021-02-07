package com.kpmg.step_definitions;

import com.kpmg.utilities.ConfigurationReader;
import com.kpmg.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before()
    public void setUp() {

        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().get(ConfigurationReader.get("url"));
    }

    /**
     * If scenario is failed this method create a screenshoot.
     *
     * @param scenario
     */
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Test failed");
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        }else {
            System.out.println("Cleanup!");
            System.out.println("Test completed");
        }

        Driver.closeDriver();
    }
}
