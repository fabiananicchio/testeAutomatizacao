package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import static core.LocalProperties.*;


public final class DriverFactory {

  private static WebDriver driver;

  /**
   * Construtor privado para que a classe não seja instanciada.
   */
  private DriverFactory() {}

  public static WebDriver getDriver() {
    if (driver == null) {
      switch (BROWSER) {
        case FIREFOX:
          System.setProperty(DRIVER_FIREFOX, DRIVER_FIREFOX_LOCATION);
          driver = new FirefoxDriver();
          break;
        case CHROME:
          System.setProperty(DRIVER_CHROME, DRIVER_CHROME_LOCATION);
          driver = new ChromeDriver();
          break;
      }

      switch (SITE) {
        case AMAZON:
          getDriver().navigate().to("http://www.amazon.com.br");
          break;
      }
      driver.manage().timeouts().implicitlyWait(WAIT_TIME_DRIVER_IN_SECONDS, TimeUnit.SECONDS);
    }

    return driver;
  }

  public static void killDriver() {
    if (driver != null) {
      driver.quit();
      driver = null;
    }
  }

}
