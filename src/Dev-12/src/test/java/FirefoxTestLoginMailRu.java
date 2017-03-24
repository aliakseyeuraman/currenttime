import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

/**
 *
 */
public class FirefoxTestLoginMailRu {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROMEDRIVER_EXE_PATH = ".\\chromedriver\\chromedriver.exe";
    private static final String WRITE_LETTER = "Написать письмо";
    private static final String SITE = "https://www.mail.ru";
    private static final String USER = "tat-dev13";
    private static final String PASSWORD = "23.03.2017";
    private static final String NULLLOGIN = "Введите имя ящика";
    private static final String INCORRECTLOGIN = "aaaaaaaa";
    private static final String NULLPASSWORD = "Введите пароль";
    private static final String INCORRECTPASSWORD = "aaaaaaaaa";
    private static final String INCORRECT_LOGIN_OR_PASSWORD = "Замечены подозрительные попытки" +
            " входа в ваш почтовый ящик.";
    private WebDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.gecko.driver", ".\\firefoxdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
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
        WebElement login = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__login']"));
        login.clear();
        login.sendKeys(USER);
        WebElement password = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__password']"));
        password.clear();
        password.sendKeys(PASSWORD);
        WebElement enter = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__auth__button']"));
        enter.click();
        WebElement letter = driver.findElement(By.className("b-toolbar__btn__text b-toolbar__btn__text_pad"));
        Assert.assertEquals(WRITE_LETTER, letter.getText());
    }

    /**
     * Test null login
     */
    @Test
    public void testNullLogin() {
        driver.navigate().to(SITE);
        WebElement enter = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__auth__button']"));
        enter.click();
        WebElement incorrect = driver.findElement(By.id("mailbox:authfail"));
        Assert.assertEquals(NULLLOGIN, incorrect.getText());
    }

    /**
     * test null password
     */
    @Test
    public void testNullPassword() {
        driver.navigate().to(SITE);
        WebElement login = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__login']"));
        login.clear();
        login.sendKeys(USER);
        WebElement enter = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__auth__button']"));
        enter.click();
        WebElement incorrect = driver.findElement(By.id("mailbox:authfail"));
        Assert.assertEquals(NULLPASSWORD, incorrect.getText());
    }

    /**
     * Test incorrect login and password
     */
    @Test
    public void testIncorrectUser() {
        driver.navigate().to(SITE);
        WebElement login = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__login']"));
        login.clear();
        login.sendKeys(INCORRECTLOGIN);
        WebElement password = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__password']"));
        password.clear();
        password.sendKeys(INCORRECTPASSWORD);
        WebElement enter = driver.findElement(By.xpath("//div[@id = 'mailbox']//input[@id='mailbox__auth__button']"));
        enter.click();
        WebElement incorrectUser = driver.findElement(By.className("b-login__errors"));
        assertNotNull(incorrectUser);
    }

    @After
    public void close() {
        driver.close();
        driver.quit();
    }
}
