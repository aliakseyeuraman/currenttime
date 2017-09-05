import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

/**
 * Class for test on Opera
 */
public class OperaTestLoginMailRu extends BrowsersWebDrivers {
    private static final String SITE = "https://www.mail.ru";
    private WebDriver driver;

    @Before
    public void init() {
        System.setProperty(getWebdriverOperaDriver(), getOperadriverExePath());
        driver = new OperaDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testSite() {
        driver.navigate().to(SITE);
    }
}
