/**
 * Class which include public field with webdrivers
 */
class BrowsersWebDrivers {
    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String CHROMEDRIVER_EXE_PATH = ".\\chromedriver\\chromedriver.exe";
    private static final String WEBDRIVER_FIREFOX_DRIVER = "webdriver.gecko.driver";
    private static final String FIREFOXDRIVER_EXE_PATH = ".\\firefoxdriver\\geckodriver.exe";
    private static final String WEBDRIVER_EDGE_DRIVER = "webdriver.ie.driver";
    private static final String MICROSOFTDRIVER_EXE_PATH = ".\\microsoftEdgedriver\\MicrosoftWebDriver.exe";
    private static final String WEBDRIVER_OPERA_DRIVER = "webdriver.opera.driver";
    private static final String OPERADRIVER_EXE_PATH = ".\\operadriver\\operadriver.exe";

    static String getWebdriverOperaDriver() {
        return WEBDRIVER_OPERA_DRIVER;
    }

    static String getOperadriverExePath() {
        return OPERADRIVER_EXE_PATH;
    }

    static String getWebdriverEdgeDriver() {
        return WEBDRIVER_EDGE_DRIVER;
    }

    static String getMicrosoftdriverExePath() {
        return MICROSOFTDRIVER_EXE_PATH;
    }

    static String getWebdriverChromeDriver() {
        return WEBDRIVER_CHROME_DRIVER;
    }

    static String getChromedriverExePath() {
        return CHROMEDRIVER_EXE_PATH;
    }

    static String getWebdriverFirefoxDriver() {
        return WEBDRIVER_FIREFOX_DRIVER;
    }

    static String getFirefoxdriverExePath() {
        return FIREFOXDRIVER_EXE_PATH;
    }
}
