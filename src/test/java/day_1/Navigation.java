package day_1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.webdriver", "C:\\WebDrivers\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void navigation() {
        WebDriver driver = getDriver();
        driver.navigate().to("https://www.programautomatycy.pl");
        driver.navigate().to("https://www.programautomatycy.pl/contact/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();
    }

}
