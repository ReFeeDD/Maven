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

public class Test2
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


        WebElement webElement3 = driver.findElement(By.xpath(".//div[@data-feed-key = 'new']/a"));
        webElement3.click();

        WebElement webElement1 = driver.findElement(By.xpath(".//div[@class='header-menu__item header-menu__item_current']/a"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath(".//.//div[@data-feed-key = 'best']/a"));
        webElement2.click();






        //  driver.quit();

    }
}
