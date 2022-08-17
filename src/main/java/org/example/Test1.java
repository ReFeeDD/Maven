package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test1
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://pikabu.ru/");

        WebElement webElement1 = driver.findElement(By.xpath(".//form[@id = 'signin-form']/div[1]/div/div/input"));
        webElement1.click();
        webElement1.sendKeys("AutoTester");

        WebElement webElement2 = driver.findElement(By.xpath(".//form[@id = 'signin-form']/div[2]/div/div/input"));
        webElement2.click();
        webElement2.sendKeys("Qwertyu8");

        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[7]/button"));
        webElement3.click();

      //  driver.quit();

    }
}
