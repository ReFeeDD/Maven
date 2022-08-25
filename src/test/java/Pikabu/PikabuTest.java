package Pikabu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class PikabuTest extends AbstractTest {

    @Test
        void Autorizatetest() throws InterruptedException {
        getDriver().findElement(By.xpath(".//form[@id = 'signin-form']/div[1]/div/div/input")).click();
        getDriver().findElement(By.xpath(".//form[@id = 'signin-form']/div[1]/div/div/input")).sendKeys("AutoTester");
        getDriver().findElement(By.xpath(".//form[@id = 'signin-form']/div[2]/div/div/input")).sendKeys("Qwertyu8");
        getDriver().findElement(By.xpath("//*[@id='signin-form']/div[7]/button")).click();

        assertTrue(getDriver().findElement(By.xpath(".//div[@class = 'user__info-item']/a")).getText().equals("AutoTester"));

    }

    @Test
    void SerfingTest() {
        getDriver().findElement(By.xpath(".//div[@data-feed-key = 'new']/a")).click();
        assertTrue(getDriver().findElement(By.cssSelector("[class*='header-menu__item_current']")).getText().equals("Свежее"));

        getDriver().findElement(By.xpath(".//div[@data-feed-key = 'best']/a")).click();
        assertTrue(getDriver().findElement(By.cssSelector("[class*='header-menu__item_current']")).getText().equals("Лучшее"));
    }
    @Test
    void NewPostTest() {
        getDriver().findElement(By.xpath(".//a[@class='button button_success button_add button_width_100']")).click();
        getDriver().findElement(By.xpath(".//div[@class='input input_section input_title input_editor']/span/div")).sendKeys("123");
        getDriver().findElement(By.xpath(".//div[@class='story-editor-block__content']")).sendKeys("123");

        assertTrue(getDriver().findElement(By.cssSelector(".//div[@class='input input_section input_title input_editor']/span/div")).getText().equals("123"));
        assertTrue(getDriver().findElement(By.cssSelector(".//div[@class='story-editor-block__content']")).getText().equals("123"));

    }

    @Test
    void notificationTest(){
        getDriver().findElement(By.xpath(".//div[@class='header__item header__right-menu']/div/a[1]")).click();
        Assertions.assertDoesNotThrow( ()-> getDriver().navigate().to("https://study.pikabu.ru/course/smm_specialist_vkontakte/?utm_source=site&utm_medium=topbar&utm_campaign=main&utm_content=smmstart&utm_term=desktop"),
                "Страница не доступна");

    }

    @Test
    void TelegramTest () {

        getDriver().findElement(By.xpath(".//div[@class='sidebar-block sidebar-block_border messengers-widget']/div[2]/ul/li[1]/div[4]/a")).click();

        Assertions.assertDoesNotThrow( ()-> getDriver().navigate().to("https://t.me/pikabu"),
                "Страница не доступна");


    }
}
