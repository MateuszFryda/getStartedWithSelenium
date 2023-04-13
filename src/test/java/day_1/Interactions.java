package day_1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Interactions {
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.webdriver", "C:\\WebDrivers\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://programautomatycy.pl/test-page/");
        return driver;
    }

    @Test
    public void fillText() {
        WebDriver driver = getDriver();
        WebElement firstName = driver.findElement(By.id("firstname-text"));
        firstName.sendKeys("Jan");
        firstName.clear();
        firstName.sendKeys("Janusz");
        WebElement secondName = driver.findElement(By.id("secondname-text"));
        secondName.sendKeys("Marian");
        WebElement lastName = driver.findElement(By.id("lastname-text"));
        lastName.sendKeys("Kowalski");

        WebElement field = driver.findElement(By.xpath("//*[@id=\"description-text\"]"));
        field.sendKeys("Napisz coś cokolwiek");
    }

    @Test
    public void clicking() {
        WebDriver driver = getDriver();
        WebElement cookiesAgree = driver.findElement(By.cssSelector("#cn-accept-cookie"));
        cookiesAgree.click();
        WebElement option3 = driver.findElement(By.xpath("//*[@id=\"option-radio\"]/span[3]/input"));
        option3.click();

        List<WebElement> cLettersCheckBoxByXpath = driver.findElements(By.xpath("//input[@type='checkbox' and @value='C']"));
        for (WebElement cLetter : cLettersCheckBoxByXpath) {
            cLetter.click();
        }
    }
}
