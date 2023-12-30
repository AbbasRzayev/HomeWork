package MEIS;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class EsasSehife {
    @Test
    public void name() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://test.meis.competition.gov.az/auth");
        WebElement sistemeGirish = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/mat-nav-list/mat-list-item[8]/span"));
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


        WebElement elanVeTebrikler = driver.findElement(By.xpath("(//app-menu-item[@class='card ng-star-inserted'])[4]"));

        String elanVeTebriklerUrl = "http://test.meis.competition.gov.az/posts";
        elanVeTebrikler.click();
        Thread.sleep(2000);
        WebElement tebrikler = driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[2]"));
        tebrikler.click();
        Thread.sleep(2000);
        assertEquals(elanVeTebriklerUrl,driver.getCurrentUrl());
        driver.navigate().back();

        WebElement fikirBanki = driver.findElement(By.xpath("(//div[@class='mat-ripple menu_item_wrapper'])[5]"));
        String fikirBankiUrl = "http://test.meis.competition.gov.az/idea-bank";
        fikirBanki.click();
        Thread.sleep(2000);
        assertEquals(fikirBankiUrl,driver.getCurrentUrl());
        driver.navigate().back();

        WebElement elektronKitabxana = driver.findElement(By.xpath("(//div[@class='menu_item_icon'])[6]"));
        String elektronKitabxanaUrl = "http://test.meis.competition.gov.az/e-books";
        elektronKitabxana.click();
        Thread.sleep(2000);
        WebElement telimler = driver.findElement(By.xpath("(//span[@class='tab-title ng-star-inserted'])[2]"));
        telimler.click();
        assertEquals(elektronKitabxanaUrl,driver.getCurrentUrl());
        driver.navigate().back();

        Thread.sleep(2000);
        WebElement teqvim = driver.findElement(By.xpath("(//div[@class='menu_item_icon'])[7]"));
        String teqvimUrl = "http://test.meis.competition.gov.az/calendar";
        teqvim.click();
        Thread.sleep(2000);
        assertEquals(teqvimUrl,driver.getCurrentUrl());
        driver.navigate().back();

        WebElement idareEtme = driver.findElement(By.xpath("(//app-menu-item[@class='card ng-star-inserted'])[8]"));
        String idareEtmeUrl = "http://test.meis.competition.gov.az/control/user-accounts-tab";
        idareEtme.click();
        Thread.sleep(2000);
        assertEquals(idareEtmeUrl,driver.getCurrentUrl());
        driver.navigate().back();

        driver.navigate().back();
        WebElement yardimMasasi = driver.findElement(By.xpath("(//app-menu-item[@class='card ng-star-inserted'])[9]"));
        String yardimMasasiUrl = "http://test.meis.competition.gov.az/helpdesk/new";
        Thread.sleep(2000);
        yardimMasasi.click();
        Thread.sleep(2000);
        assertEquals(yardimMasasiUrl,driver.getCurrentUrl());
        driver.navigate().back();

//        WebElement sistemdenCixish = driver.findElement(By.xpath("(//div[@class='menu_item_icon'])[10]"));
//        String sistemdenCixishUrl = "http://test.meis.competition.gov.az/auth";
    }
}