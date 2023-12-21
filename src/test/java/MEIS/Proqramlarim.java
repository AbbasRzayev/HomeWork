package MEIS;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class Proqramlarim extends Meis_Test_Base {
    @Test
    public void name() throws InterruptedException {

        sistemeDaxilOL();
        String proq = "Proqramlarım";
        WebElement proqramlarim = driver.findElement(By.xpath("//*[contains(text(), '" + proq + "')]"));
        implictWait();
        Thread.sleep(1000);
        clickButton(proqramlarim);

        WebElement yeniProqram = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]"));
        clickButton(yeniProqram);

        implictWait();
        WebElement proqraminAdi = driver.findElement(By.cssSelector("input[class='mat-input-element mat-form-field-autofill-control ng-tns-c133-10 ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']"));
        proqraminAdi.sendKeys("TestProqram");

        implictWait();
        WebElement acarSoz = driver.findElement(By.cssSelector("input[class='mat-input-element mat-form-field-autofill-control ng-tns-c133-11 ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']"));
        acarSoz.sendKeys("TP");

        implictWait();
        WebElement proqraminUnvani = driver.findElement(By.cssSelector("input[class='mat-input-element mat-form-field-autofill-control ng-tns-c133-12 ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']"));
        proqraminUnvani.sendKeys("https://oxu.az/");

        implictWait();

        WebElement proqHaqqindaQeyd = driver.findElement(By.id("mat-input-6"));
        proqHaqqindaQeyd.sendKeys("TestQeyd");

        WebElement apiUrl = driver.findElement(By.id("mat-input-7"));
        apiUrl.sendKeys("https://oxu.az/");

        implictWait();
        String ydText = "Yadda saxla";
        WebElement yd = driver.findElement(By.xpath("//*[contains(text(), '" + ydText + "')]"));
        assertTrue(yd.isEnabled());

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));

        WebElement fileInput = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-programs-control/form/div[3]/div"));
        fileInput.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String filePath = "C:\\Users\\User\\Desktop\\TestFiles\\Test.png";
        robotClassDosyaYukleme(filePath);

        WebElement videoTelimat = driver.findElement(By.xpath("//label[@for='videoGuideFileInput']"));
        videoTelimat.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);

        WebElement telimatFayl = driver.findElement(By.xpath("//label[@for='guideFileInput']"));
        telimatFayl.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);
        Thread.sleep(1000);
        WebElement digerFayl = driver.findElement(By.xpath("//label[@for='otherFileInput']"));
        digerFayl.click();
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);
        Thread.sleep(2000);
        clickButton(yd);
        Thread.sleep(2000);
        WebElement yd1 = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[7]"));
        clickButton(yd1);

        Thread.sleep(1000);
        WebElement nameAdd = driver.findElement(By.xpath("//*[@id=\"mat-input-14\"]"));
        nameAdd.sendKeys("Fərid");
        WebElement soyadAdd = driver.findElement(By.xpath("//*[@id=\"mat-input-15\"]"));
        soyadAdd.sendKeys("imranov");

        String axtar = "Axtar";
        WebElement axtarActual = driver.findElement(By.xpath("//*[contains(text(), '" + axtar + "')]"));
        clickButton(axtarActual);
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        WebElement nameSurnameActual = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-control/div/app-users-tab/div[3]/table/tbody/tr")));
        Actions actions = new Actions(driver);
        actions.moveToElement(nameSurnameActual).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.click(nameSurnameActual).perform();
        Thread.sleep(2000);
        String pr = "Proqramları";
        WebElement prActual = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), '" + pr + "')]")));
        clickButton(prActual);
        Thread.sleep(2000);
        WebElement axtarish = driver.findElement(By.xpath("//*[@id=\"mat-input-20\"]"));
        axtarish.sendKeys("TestProqram");

        WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin'])[1]")));
        actions.scrollToElement(checkBox);
        if (!checkBox.isSelected()) {
            Thread.sleep(2000);
            checkBox.click();
        }
        Thread.sleep(2000);
        WebElement esasSehife = driver.findElement(By.xpath("(//span[@class='mat-list-item-content'])[3]"));
        clickButton(esasSehife);

        Thread.sleep(2000);
        String pro1 = "TestProqram";
        WebElement pro1ctual = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), '" + pro1 + "')]")));
        actions.scrollToElement(pro1ctual);
        clickButton(pro1ctual);
       String firstPage =  driver.getWindowHandle();
        Thread.sleep(2000);

        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);

        }
        String urlLink = "Oxu.az - Azərbaycan və dünya xəbərləri";
        assertTrue(urlLink.contains(driver.getTitle()));
        driver.close();
        Thread.sleep(2000);
        driver.switchTo().window(firstPage);
        String realURl = driver.getCurrentUrl();
        System.out.println("realURl = " + realURl);

        Thread.sleep(2000);
        WebElement idareEtme = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/mat-nav-list/mat-list-item[8]/span")));
        clickButton(idareEtme);

        String proqExit = "Proqramlar";
        WebElement proqOut = driver.findElement(By.xpath("//*[contains(text(), '" + proqExit + "')]"));
        clickButton(proqOut);

        Thread.sleep(1000);
        String proqD = "TestProqram";
        WebElement proqDaxil = driver.findElement(By.xpath("//*[contains(text(), '" + proqD + "')]"));
        clickButton(proqDaxil);

        String proqramSil = "Proqramı sil";
        WebElement proqramSilActual = driver.findElement(By.xpath("//*[contains(text(), '" + proqramSil + "')]"));
        clickButton(proqramSilActual);

        Thread.sleep(1000);
        String accept = "Bəli";
        WebElement acceptActual = driver.findElement(By.xpath("//*[contains(text(), '" + accept + "')]"));
        clickButton(acceptActual);

        String testiqNot = "Təsdiq edildi";
        WebElement testActual = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + testiqNot + "')]")));
        System.out.println("testActual = " + testActual);
        checkTextContain(testActual,testiqNot);
    }
    }