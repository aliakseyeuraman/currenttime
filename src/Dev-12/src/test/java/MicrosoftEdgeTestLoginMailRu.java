import io.github.bonigarcia.wdm.EdgeDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Class for test on MicrosoftEdge
 */
public class MicrosoftEdgeTestLoginMailRu extends BrowsersWebDrivers {

    private static final String SITE = "https://www.mail.ru";
    private WebDriver driver;

    @Before
    public void init() {
        EdgeDriverManager.getInstance().setup();
        System.setProperty(getWebdriverEdgeDriver(), getMicrosoftdriverExePath());
        driver = new EdgeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testSite() {
        driver.navigate().to(SITE);
    }
}
