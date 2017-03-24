import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/**
 * Class for testing login on mail.ru
 */
public class ChromeTestLoginMailRu {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROMEDRIVER_EXE_PATH = ".\\chromedriver\\chromedriver.exe";
    private static final String WRITE_LETTER = "Написать письмо";
    private static final String SITE = "https://www.mail.ru";
    private static final String USER = "tat-dev13";
    private static final String PASSWORD = "23.03.2017";
    private static final String INCORRECT_LOGIN_OR_PASSWORD = "Неверное имя пользователя или пароль. " +
            "Проверьте правильность введенных данных.";

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"portal-headline\"]/table/tbody/tr/td[1]/a[6]")
    private WebElement news;

    @Before
    public void init() {
        System.setProperty(WEBDRIVER_CHROME_DRIVER, CHROMEDRIVER_EXE_PATH);
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
        WebElement login = driver.findElement(By.xpath("//*[@id=\"mailbox__login\"]"));
        login.clear();
        login.sendKeys(USER);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"mailbox__password\"]"));
        password.clear();
        password.sendKeys(PASSWORD);
        WebElement enter = driver.findElement(By.xpath("//*[@id=\"mailbox__auth__button\"]"));
        enter.click();
        WebElement letter = driver.findElement(By.xpath("//*[@id=\"b-toolbar__left\"]/div/div/div[2]/div/a/span"));
        Assert.assertEquals(WRITE_LETTER, letter.getText());
    }

    /**
     * Test incorrect login or password
     */
    @Test
    public void testIncorrectLogin() {
        driver.navigate().to(SITE);
        WebElement enter = driver.findElement(By.xpath("//*[@id=\"mailbox__auth__button\"]"));
        enter.click();
        WebElement incorrect = driver.findElement(By.xpath("//*[@id=\"frame\"]/div[2]"));
        Assert.assertEquals(INCORRECT_LOGIN_OR_PASSWORD, incorrect.getText());
    }

    @After
    public void close() {
        driver.close();
    }
}