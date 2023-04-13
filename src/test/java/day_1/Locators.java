package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;


import java.util.List;

public class Locators {

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.webdriver", "C:\\WebDrivers\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void findElementById() {
        WebDriver driver = getDriver();
        WebElement firstName = driver.findElement(By.id("firstname-text"));
        WebElement button = driver.findElement(By.id("click-submit"));
        WebElement selectColor = driver.findElement(By.id("day-select"));
        driver.quit();
    }

    @Test
    public void findElementByClass() {
        WebDriver driver = getDriver();
        WebElement chooseOption = driver.findElement(By.className("wpcf7-form-control wpcf7-radio option"));
    }

    @Test
    public void findElementsByXPath() {
        WebDriver driver = getDriver();
        WebElement dayXpath = driver.findElement(By.xpath("//*[@id=\"wpcf7-f9259-p9257-o1\"]/form/p[7]/b"));
        driver.quit();
    }

    @Test
    public void findElementsBySelector() {
        WebDriver driver = getDriver();
        WebElement dayBySelector = driver.findElement(By.cssSelector("#wpcf7-f9259-p9257-o1 > form > p:nth-child(8) > b"));
        driver.quit();
    }

    @Test
    public void findGroupElements() {
        WebDriver driver = getDriver();
        List<WebElement> inputs = driver.findElements(By.id("input"));
        driver.quit();
    }

    @Test
    public void findElementByTagName() {
        WebDriver driver = getDriver();
        WebElement footerByTagName = driver.findElement(By.tagName("footer"));
        driver.quit();
    }

    @Test
    public void findElementByCssSelector() {
        WebDriver driver = getDriver();
        WebElement elementByCssSelector = driver.findElement(By.cssSelector("#wpcf7-f9259-p9257-o1 > form > p:nth-child(16) > b"));
        driver.quit();
    }

    @Test
    public void findElementByXpath() {
        WebDriver driver = getDriver();
        WebElement elementByXpath = driver.findElement(By.xpath("//*[@id=\"wpcf7-f9259-p9257-o1\"]/form/p[14]"));
    }
}
