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

public class Test3
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://pikabu.ru/");

        WebElement webElement1 = driver.findElement(By.xpath(".//form[@id = 'signin-form']/div[1]/div/div/input"));
        webElement1.click();
        webElement1.sendKeys("AutoTester");

        WebElement webElement2 = driver.findElement(By.xpath(".//form[@id = 'signin-form']/div[2]/div/div/input"));
        webElement2.click();
        webElement2.sendKeys("Qwertyu8");

        WebElement webElement3 = driver.findElement(By.xpath("//*[@id='signin-form']/div[7]/button"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath(".//a[@class='button button_success button_add button_width_100']"));
        webElement4.click();



        WebElement webElement5 = driver.findElement(By.xpath(".//div[@class='input input_section input_title input_editor']/span/div"));
        webElement5.click();
        webElement5.sendKeys("123");

        WebElement webElement6 = driver.findElement(By.xpath(".//div[@class='story-editor-block__content']"));
        webElement6.click();
        webElement6.sendKeys("123");

        WebElement webElement7 = driver.findElement(By.xpath(".//div[@class= 'left']/span[1]/button[1]"));
        webElement7.click();



        //  driver.quit();

    }
}