package RealProjectPractice;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;
import java.time.Duration;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MEIS {
    @Test
    public void name() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://test.meis.competition.gov.az/auth");
        WebElement sistemeGirish = driver.findElement(By.xpath("(//img[@class='card_img ng-tns-c139-2'])[2]"));
        sistemeGirish.click();
        WebElement istifadeGirish = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]"));
        istifadeGirish.click();
        WebElement login = driver.findElement(By.id("mat-input-0"));
        login.sendKeys("imranovfarid@gmail.com");
        WebElement paswword = driver.findElement(By.id("mat-input-1"));
        paswword.sendKeys("Farid1020");
        WebElement daxilOl = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']"));
        daxilOl.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        String esasSehifeUrl = "http://test.meis.competition.gov.az/auth";
        String actualEsas = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        assertEquals(esasSehifeUrl,actualEsas);

        WebElement shexsiKabinetim = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//app-menu-item[@class='card ng-star-inserted'])[2]")));
        shexsiKabinetim.click();
        String shexsikabinetimUrl = "http://test.meis.competition.gov.az/user-account";
        Thread.sleep(2000);
        assertEquals(shexsikabinetimUrl,driver.getCurrentUrl());
        driver.navigate().back();

        WebElement proqramlarim = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//app-menu-item[@class='card ng-star-inserted'])[3]")));
        String proqramlarimUrl = "http://test.meis.competition.gov.az/programs";
        proqramlarim.click();
        Thread.sleep(2000);
        assertEquals(proqramlarimUrl,driver.getCurrentUrl());
        driver.navigate().back();

//
//        WebElement elanVeTebrikler = driver.findElement(By.xpath(""));
//        String elanVeTebriklerUrl = "http://test.meis.competition.gov.az/posts";
//
//        WebElement fikirBanki = driver.findElement(By.xpath(""));
//        String fikirBankiUrl = "http://test.meis.competition.gov.az/idea-bank";
//
//        WebElement elektronKitabxana = driver.findElement(By.xpath(""));
//        String elektronKitabxanaUrl = "http://test.meis.competition.gov.az/e-books";
//
//        WebElement teqvim = driver.findElement(By.xpath(""));
//        String teqvimUrl = "http://test.meis.competition.gov.az/calendar";
//
//        WebElement idareEtme = driver.findElement(By.xpath(""));
//        String idareEtmeUrl = "http://test.meis.competition.gov.az/control/user-accounts-tab";
//
//        WebElement yardimMasasi = driver.findElement(By.xpath(""));
//        String yardimMasasiUrl = "http://test.meis.competition.gov.az/helpdesk/new";
//
//        WebElement sistemdenCixish = driver.findElement(By.xpath(""));
//        String sistemdenCixishUrl = "http://test.meis.competition.gov.az/auth";

    }
}