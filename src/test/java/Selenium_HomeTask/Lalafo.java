package Selenium_HomeTask;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class Lalafo extends TestBase{
    @Test
    public void name() {

        driver.get("https://lalafo.az/");
        extentTest.info("Lalafo saytina girish");

        String urlLalafo = "https://lalafo.az/";
        AssertCheck(urlLalafo, driver.getCurrentUrl());
        extentTest.info("Gittiyim url dogrula");

        String searchText = "Giriş";
        WebElement girish = driver.findElement(By.xpath("//*[contains(text(), '" + searchText + "')]"));
        clickButton(girish);
        WebElement emailAdress = driver.findElement(By.cssSelector("input[class='LFInput__input error']"));
        emailAdress.sendKeys("aaaaaaa.aaa.aaa");
        emailAdress.sendKeys(Keys.DELETE);
        emailAdress.clear(); //Lakin silmiyor
        emailAdress.sendKeys("@@@@@.com");
        emailAdress.clear(); //Lakin silmiyor
        emailAdress.sendKeys("asdasd.asdas");
        emailAdress.clear(); //Lakin silmiyor
        emailAdress.sendKeys("test,asd");

        WebElement password = driver.findElement(By.xpath("//input[@type='password'] "));
        password.sendKeys("asdasd");
        password.clear();
        password.sendKeys("asdasd");
        password.clear();
        password.sendKeys("asdasd");
        password.clear();
        password.sendKeys("asdasd");


        WebElement enter = driver.findElement(By.xpath("//button[@class='LFButton large primary-green  ']"));
        clickButton(enter);
        WebElement checkFalse = driver.findElement(By.xpath("//span[@class='LFCaption size-10 ']"));
        AssertIsDisplayed(checkFalse);
        extentTest.info("Kullanici girish yapmadigini dogrular");

        driver.navigate().refresh();
        String tittleLalafo = "Azərbaycan-da pulsuz elanlar. Al və sat lalafo.az";
        AssertCheck(tittleLalafo, driver.getTitle());
        extentTest.info("Tittle yoklanilir");

        WebElement dashinilmazEmlak = driver.findElement(By.cssSelector("div[class='IconCategory desktop  home']"));
        clickButton(dashinilmazEmlak);
        WebElement sheherSec = driver.findElement(By.xpath("//div[@class='select-with-search']"));
        clickButton(sheherSec);

        WebElement agdamSec = driver.findElement(By.xpath("(//li[@class='select-dropdown__list-item '])[6]"));
        clickButton(agdamSec);

        String expectedCity = "Ağdam";












    }
}
