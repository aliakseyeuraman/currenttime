import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Class for test on MicrosoftEdge
 */
public class MicrosoftEdgeTestLoginMailRu {
    private static final String WEBDRIVER_EDGE_DRIVER = "webdriver.edge.driver";
    private static final String MICROSOFTDRIVER_EXE_PATH = ".\\microsoftEdgedriver\\MicrosoftWebDriver.exe";
    private static final String SITE = "https://www.mail.ru";
    public WebDriver driver;

    @Before
    public void init() {
        System.setProperty(WEBDRIVER_EDGE_DRIVER, MICROSOFTDRIVER_EXE_PATH);
        driver = new EdgeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testSite() {
        driver.navigate().to(SITE);
    }
}
