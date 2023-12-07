package Selenium_HomeTask;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Lalafo extends TestBase{
    @Test
    public void name() {

        driver.get("https://lalafo.az/");
        extentTest.info("Lalafo saytina girish");

        String urlLalafo = "https://lalafo.az/";
        AssertUrlCheck(urlLalafo, driver.getCurrentUrl());
        extentTest.info("Gittiyim url dogrula");

        String searchText = "Giriş";
        WebElement girish = driver.findElement(By.xpath("//*[contains(text(), '" + searchText + "')]"));
        girish.click();
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
        enter.click();
        WebElement checkFalse = driver.findElement(By.xpath("//span[@class='LFCaption size-10 ']"));
        AssertIsDisplayed(checkFalse);
        extentTest.info("Kullanici girish yapmadigini dogrular");





    }
}
