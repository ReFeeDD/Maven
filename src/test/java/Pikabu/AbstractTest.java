package Pikabu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    private static WebDriver driver;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @BeforeEach

    void goTo(){
        Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://www.pikabu.ru"),
                "Страница не доступна");


        //Авторизация
      /*   WebElement webElement1 = driver.findElement(By.xpath(".//form[@id = 'signin-form']/div[1]/div/div/input"));
      webElement1.click();
       webElement1.sendKeys("AutoTester");

        WebElement webElement2 = driver.findElement(By.xpath(".//form[@id = 'signin-form']/div[2]/div/div/input"));
        webElement2.click();
        webElement2.sendKeys("Qwertyu8");

        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[7]/button"));
        webElement3.click();

       */
    }



    @AfterAll
    static void close(){
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

