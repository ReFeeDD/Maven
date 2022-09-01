package Pikabu;

import io.qameta.allure.Step;
import org.example.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PikabuTest extends AbstractTest {



    @Step
    public void AutorizateTest(String Login, String Password) throws InterruptedException {

        new MainPage(getWebDriver()).Autorizated(Login,Password);
        assertTrue(getWebDriver().findElement(By.xpath(".//div[@class = 'user__info-item']/a")).getText().equals("AutoTester"));

    }
    @Test
    public void AutorizatedTest() throws InterruptedException {
        AutorizateTest("AutoTester","Qwertyu8");
    }

    @Test
        void ClickToNewTest() {
        // Старое
        //  getDriver().findElement(By.xpath(".//div[@data-feed-key = 'new']/a")).click();

        // новое
        new MainPage(getWebDriver()).setNavigateToNew();
        assertTrue(getWebDriver().findElement(By.cssSelector("[class*='header-menu__item_current']")).getText().equals("Свежее"));
    }
    @Test
        void ClickToBestTest() {
        new MainPage(getWebDriver()).navigateToBest();
        assertTrue(getWebDriver().findElement(By.cssSelector("[class*='header-menu__item_current']")).getText().equals("Лучшее"));
    }


    @Test
    void notificationTest(){
       new MainPage(getWebDriver()).notification();
        Assertions.assertDoesNotThrow( ()-> getWebDriver().navigate().to("https://study.pikabu.ru/course/smm_specialist_vkontakte/?utm_source=site&utm_medium=topbar&utm_campaign=main&utm_content=smmstart&utm_term=desktop"),
                "Страница не доступна");

    }

    @Test
    void TelegramTest () {

        new MainPage(getWebDriver()).TelegrammClick();

        Assertions.assertDoesNotThrow( ()-> getWebDriver().navigate().to("https://t.me/pikabu"),
                "Страница не доступна");


    }

    }
