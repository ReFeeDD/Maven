package org.example;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {

    @FindBy(xpath = ".//div[@data-feed-key = 'new']/a")
    private WebElement New;


    @FindBy(xpath = ".//div[@data-feed-key = 'best']/a")
    private WebElement Best;

    @FindBy(xpath = ".//form[@id = 'signin-form']/div[1]/div/div/input")
    public WebElement login;
    @FindBy(xpath = ".//form[@id = 'signin-form']/div[2]/div/div/input")
    public WebElement password;
    @FindBy(xpath = "//*[@id='signin-form']/div[7]/button")
    public WebElement button;
    @FindBy(xpath = ".//div[@class='header__item header__right-menu']/div/a[1]")
    public WebElement Ssilka;
    @FindBy(xpath = ".//div[@class='sidebar-block sidebar-block_border messengers-widget']/div[2]/ul/li[1]/div[4]/a")
    public WebElement Telegramm;



    public MainPage(WebDriver driver){
        super(driver);

    }


    public void setNavigateToNew(){
        this.New.click();

    }

    public void navigateToBest(){
        this.Best.click();

    }
    public void Autorizated(String login, String password){
        Actions loginIn = new Actions(getDriver());
        loginIn
                .sendKeys(this.login,login)
                .click(this.password)
                .sendKeys(password)
                .click(this.button)
                .build()
                .perform();
    }
    public void notification(){
        this.Ssilka.click();
    }
    public void TelegrammClick() {
        this.Telegramm.click();
    }

}