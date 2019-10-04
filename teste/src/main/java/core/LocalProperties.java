package core;

public class LocalProperties {

    /**
     * Informa se o browser irá fechar ou não depois da execução dos testes
     */
    public static boolean FECHAR_BROWSER = true;

    /**
     * Informa o ambiente em que será realizado os testes
     */
    public static Site SITE = Site.AMAZON;

    /**
     * Informa o navegador em que será realizado os testes
     */
    public static Browsers BROWSER = Browsers.FIREFOX;

    /**
     * Constante WAIT_TIME_IN_SECONDS.
     */
    public static final int WAIT_TIME_IN_SECONDS = 15;

    /**
     * Constante WAIT_TIME_DRIVER_IN_SECONDS .
     */
    public static final int WAIT_TIME_DRIVER_IN_SECONDS = 10;

    /**
     * Constante DRIVER_FIREFOX.
     */
    public static final String DRIVER_FIREFOX = "webdriver.gecko.driver";

    /**
     * Constante DRIVER_CHROME.
     */
    public static final String DRIVER_CHROME = "webdriver.chrome.driver";

    /**
     * Constante DRIVER_CHROME_LOCATION.
     */
    public static final String DRIVER_CHROME_LOCATION =
            System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe";

    /**
     * Constante DRIVER_FIREFOX_LOCATION.
     */
    public static final String DRIVER_FIREFOX_LOCATION =
            System.getProperty("user.dir") + "/src/main/resources/geckodriver.exe";

    /**
     * Enum Browsers.
     */
    public enum Browsers {
        CHROME,
        FIREFOX
    }

    /**
     * Enum Site.
     */
    public enum Site {
        AMAZON
    }

}
