package MEIS;

import io.cucumber.java.de.Wenn;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;

public class Elanlar extends Meis_Test_Base {
    @Test
    public void name() throws InterruptedException {
        sistemeDaxilOL();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        Thread.sleep(2000);
        WebElement idareEtme = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/mat-nav-list/mat-list-item[8]/span")));
        clickButton(idareEtme);

        String elanEnter = "Elanlar";
        WebElement elanEnter1 = driver.findElement(By.xpath("//*[contains(text(), '" + elanEnter + "')]"));
        clickButton(elanEnter1);

        WebElement elanlarPlus = driver.findElement(By.xpath("//button[@class='new_news']"));
        clickButton(elanlarPlus);

        Thread.sleep(2000);
        WebElement basglig = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c133-17 ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']")));
        basglig.sendKeys("TestElan");

        WebElement metn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ql-editor ql-blank']")));
        metn.sendKeys("Test metn test met test metn test metn");

        WebElement urlElan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-9")));
        urlElan.sendKeys("https://stackoverflow.com/");

        WebElement elanTipi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mat-select-arrow ng-tns-c135-20']")));
        clickButton(elanTipi);

        String dropDownList1 = "MEİS ilə bağlı";
        WebElement dropDownListActual1 = driver.findElement(By.xpath("//*[contains(text(), '" + dropDownList1 + "')]"));
        clickButton(dropDownListActual1);

        WebElement birFayl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-news-control/div[2]/div[2]/div[1]/div/div/button")));
        clickButton(birFayl);
        Thread.sleep(1000);
        String filePath = "C:\\Users\\User\\Desktop\\TestFiles\\Test.png";
        robotClassDosyaYukleme(filePath);

        WebElement ikiFayl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-news-control/div[2]/div[2]/div[2]/div[1]/div/div/button")));
        clickButton(ikiFayl);
        Thread.sleep(1000);
        robotClassDosyaYukleme(filePath);

        WebElement ucFayl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-news-control/div[2]/div[2]/div[2]/div[2]/div/div/button")));
        ucFayl.click();
        Thread.sleep(2000);
        WebElement urlAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-input-10\"]")));
        urlAdd.click();
        urlAdd.sendKeys("https://stackoverflow.com/");

        String tesiq = "Təsdiq et";
        WebElement testiqAct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + tesiq + "')]")));
        Thread.sleep(2000);
        testiqAct.click();

        Thread.sleep(2000);
        WebElement yd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='mat-focus-indicator okBtn mat-raised-button mat-button-base mat-primary']")));
        clickButton(yd);

        Thread.sleep(2000);
        WebElement elanlar1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='mat-ripple ng-star-inserted'])[4]")));
        clickButton(elanlar1);

        Thread.sleep(2000);
        String sec = "TestElan";
        String sil = "Sil";
        WebElement chosenElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), '" + sec + "')]")));
        WebElement deleteButton = chosenElement.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-control/div/app-news-tab/div[2]/app-news-item[1]/div/div/a[2]"));
        deleteButton.click();

        WebElement beli = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='mat-focus-indicator okBtn mat-raised-button mat-button-base mat-primary ng-star-inserted']")));
        clickButton(beli);

        String checkSilindi1 = "Uğurla silindi";
        WebElement checkSilindi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + checkSilindi1 + "')]")));
        assertTrue(checkSilindi.isDisplayed());
    }
}