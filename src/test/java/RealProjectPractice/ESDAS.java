package RealProjectPractice;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ESDAS {
    @Test
    public void name() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.get("http://test.meis.competition.gov.az/auth");
        WebElement sistemeGirish = driver.findElement(By.xpath("(//img[@class='card_img ng-tns-c139-2'])[2]"));
        sistemeGirish.click();

        WebElement istifadeGirish = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]"));
        Thread.sleep(200);
        istifadeGirish.click();

        WebElement login = driver.findElement(By.id("mat-input-0"));
        login.sendKeys("imranovfarid@gmail.com");

        WebElement paswword = driver.findElement(By.id("mat-input-1"));
        paswword.sendKeys("Farid1020");

        WebElement daxilOl = driver.findElement(By.xpath("//span[@class='mat-button-wrapper']"));
        Thread.sleep(200);
        daxilOl.click();

//        WebElement proqramlarim;
//        proqramlarim = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='menu_item_icon'])[3]"))));
//        Thread.sleep(200);
//        proqramlarim.click();

        WebElement proqramlarim;
        try {
            proqramlarim = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-home/div[2]/app-menu-item[3]/div")));
            proqramlarim.click();
        } catch (NoSuchElementException | TimeoutException e) {
            e.printStackTrace();
            // Handle the exception or log an error message
        }

        WebElement esdasDaxil;
        esdasDaxil = new WebDriverWait(driver,Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-programs/div/div[4]/app-program-item[5]/div/div[1]/span")));
        Thread.sleep(200);
        esdasDaxil.click();

        Thread.sleep(200);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);

        }
        String url=driver.getCurrentUrl();
        System.out.println("windowHandles = " + url);

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement karguzar = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/main/div/main/div/div[1]/div[1]/form/button[1]/img")));
        karguzar.click();
    }
}