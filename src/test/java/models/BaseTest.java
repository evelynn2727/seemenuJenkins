package models;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import providers.DriverFactory;
import utilities.Configuration;
import java.util.Date;

public abstract class BaseTest {
    protected WebDriver driver;

    @After
    public void tearDown() {
        loadLogsFromBrowser();
        driver.quit();
    }

    @Before
    public void setUp() {
        driver = DriverFactory.getManager(new Configuration().loadConfigurationFromPropertiesFile("typeBrowser"));
        driver.get(new Configuration().loadConfigurationFromPropertiesFile("baseUrl"));
    }


    private void loadLogsFromBrowser() {
        LogEntries logs = driver.manage().logs().get("browser");
        for (LogEntry element : logs) {
            System.out.println(new Date(element.getTimestamp()) + " " + element.getLevel() + " " + element.getMessage());
        }
    }
}