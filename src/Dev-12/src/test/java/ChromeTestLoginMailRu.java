import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

/**
 * Class for testing login on mail.ru
 */
public class ChromeTestLoginMailRu extends BrowsersWebDrivers {
    private static final String WRITE_LETTER = "Написать письмо";
    private static final String SITE = "https://www.mail.ru";
    private static final String USER = "tat-dev13";
    private static final String PASSWORD = "23.03.2017";
    private static final String INCORRECT_LOGIN_OR_PASSWORD = "Неверное имя пользователя или пароль. " +
            "Проверьте правильность введенных данных.";

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"portal-headline\"]/table/tbody/tr/td[1]/a[6]")
    WebElement news;

    @FindBy(xpath = "//*[@id=\"mailbox__login\"]")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"mailbox__password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"mailbox__auth__button\"]")
    WebElement enter;

    @FindBy(xpath = "//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a/span")
    WebElement letter;

    @Before
    public void init() {
        System.setProperty(getWebdriverChromeDriver(), getChromedriverExePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * Test site mail.ru
     */
    @Test
    public void testSite() {
        driver.navigate().to(SITE);
    }

    /**
     * Test true login and password
     */
    @Test
    public void testTrueUser() {
        driver.navigate().to(SITE);
        login.clear();
        login.sendKeys(USER);
        password.clear();
        password.sendKeys(PASSWORD);
        enter.click();
        Assert.assertEquals(WRITE_LETTER, letter.getText());
    }

    /**
     * Test incorrect login or password
     */
    @Test
    public void testIncorrectLogin() {
        driver.navigate().to(SITE);
        enter.click();
        WebElement incorrect = driver.findElement(By.xpath("//*[@id=\"frame\"]/div[2]"));
        Assert.assertEquals(INCORRECT_LOGIN_OR_PASSWORD, incorrect.getText());
    }

    @After
    public void close() {
        driver.close();
    }
}