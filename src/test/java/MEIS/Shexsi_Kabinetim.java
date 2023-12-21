package MEIS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;

public class Shexsi_Kabinetim extends Meis_Test_Base {
    @Test
    public void name() throws InterruptedException {

        sistemeDaxilOL();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement shexsiKabinetim = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//app-menu-item[@class='card ng-star-inserted'])[2]")));
        clickButton(shexsiKabinetim);

        List<WebElement> melumatlar = driver.findElements(By.xpath("//div[@class='fields_wrapper ng-star-inserted']"));
        for (WebElement element : melumatlar) {
            String melum = element.getText();
            System.out.println("melum = " + melum);
            assertTrue(melum.contains("0123456789123"));
            assertTrue(melum.contains("0123456789123"));
            assertTrue(melum.contains("5H16F8U"));
            assertTrue(melum.contains("PROQRAMÇI"));
            assertTrue(melum.contains("FƏRİD"));
            assertTrue(melum.contains("İMRANOV"));
            assertTrue(melum.contains("FƏRİD İMRANOV ŞABAN OĞLU"));
            assertTrue(melum.contains("14.03.2019"));
            assertTrue(melum.contains("1003853391"));
            assertTrue(melum.contains("10110053490"));
            assertTrue(melum.contains("AISTGroup"));
            assertTrue(melum.contains("14.03.2019"));
        }
        String searchText = "0123456789123";
        WebElement girish = driver.findElement(By.xpath("//*[contains(text(), '" + searchText + "')]"));
        System.out.println("girish = " + girish);
        assertTrue(girish.getText().equals(searchText));

        String searchText2 = "0123456789123";
        WebElement girish2 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText2 + "')]"));
        System.out.println("girish = " + girish2);
        assertTrue(girish2.getText().equals(searchText2));

        String searchText3 = "5H16F8U";
        WebElement girish3 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText3 + "')]"));
        System.out.println("girish = " + girish3);
        assertTrue(girish3.getText().equals(searchText3));

        String searchText4 = "FƏRİD";
        WebElement girish4 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText4 + "')]"));
        System.out.println("girish = " + girish4);
        assertTrue(girish4.getText().equals(searchText4));

        String searchText5 = "İMRANOV";
        WebElement girish5 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText5 + "')]"));
        System.out.println("girish = " + girish);
        assertTrue(girish5.getText().equals(searchText5));

        String searchText6 = "FƏRİD İMRANOV ŞABAN OĞLU";
        WebElement girish6 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText6 + "')]"));
        System.out.println("girish = " + girish6);
        assertTrue(girish6.getText().equals(searchText6));

        String searchText7 = "14.03.2019";
        WebElement girish7 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText7 + "')]"));
        System.out.println("girish = " + girish7);
        assertTrue(girish7.getText().equals(searchText7));

        String searchText8 = "1003853391";
        WebElement girish8 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText8 + "')]"));
        System.out.println("girish = " + girish8);
        assertTrue(girish8.getText().equals(searchText8));

        String searchText9 = "10110053490";
        WebElement girish9 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText9 + "')]"));
        System.out.println("girish = " + girish9);
        assertTrue(girish9.getText().equals(searchText9));

        String searchText10 = "AISTGroup";
        WebElement girish10 = driver.findElement(By.xpath("//*[contains(text(), '" + searchText10 + "')]"));
        System.out.println("girish = " + girish10);
        checkText(girish10, searchText10);

        WebElement shvMelumatlar = driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[2]"));
        clickButton(shvMelumatlar);
        String adSh = "Fərid";
        String soyadSh = "İmranov";
        String ataAdiSh = "Şaban";
        String cinsSH = "Kişi";
        String finShSh = "5H16F8U";
        String seriyaSh = "16798586";
        String etibarliqSh = "12.02.2027";
        String dogumTarixiSh = "12.02.1992";

        Thread.sleep(2000);
        WebElement adshActual = driver.findElement(By.xpath("//*[contains(text(), '" + adSh + "')]"));
        System.out.println("Actual: " + adshActual.getText());
        System.out.println("Expected: " + adSh);
        checkTextContain(adshActual, adSh);


        WebElement soyadShActual = driver.findElement(By.xpath("//*[contains(text(), '" + soyadSh + "')]"));
        checkTextContain(soyadShActual, soyadSh);

        WebElement ataAdActual = driver.findElement(By.xpath("//*[contains(text(), '" + ataAdiSh + "')]"));
        System.out.println("Actual: " + ataAdActual.getText());
        System.out.println("Expected: " + ataAdiSh);
        checkTextContain(ataAdActual, ataAdiSh);

        WebElement cinsActual = driver.findElement(By.xpath("//*[contains(text(), '" + cinsSH + "')]"));
        checkTextContain(cinsActual, cinsSH);

        WebElement finiShActual = driver.findElement(By.xpath("//*[contains(text(), '" + finShSh + "')]"));
        checkTextContain(finiShActual, finShSh);

        WebElement seriyaActual = driver.findElement(By.xpath("//*[contains(text(), '" + seriyaSh + "')]"));
        checkTextContain(seriyaActual, seriyaSh);

        WebElement etibarActual = driver.findElement(By.xpath("//*[contains(text(), '" + etibarliqSh + "')]"));
        checkTextContain(etibarActual, etibarliqSh);

        WebElement dogumActual = driver.findElement(By.xpath("//*[contains(text(), '" + dogumTarixiSh + "')]"));
        checkTextContain(dogumActual, dogumTarixiSh);

        Thread.sleep(2000);
        WebElement strukturYerim = driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[3]"));
        clickButton(strukturYerim);
        Thread.sleep(2000);
        String qurum = "Azərbaycan Standartlaşdırma İnstitutu";
        String departament = "Uyğunluğun qiymətləndirilməsi departamenti";
        String regionBolme = "UQD-Bakı regional bölməsi";

        WebElement qurumActual = driver.findElement(By.xpath("//*[contains(text(), '" + qurum + "')]"));
        WebElement departamentActual = driver.findElement(By.xpath("//*[contains(text(), '" + departament + "')]"));
        WebElement regionBolmeActual = driver.findElement(By.xpath("//*[contains(text(), '" + regionBolme + "')]"));

        checkTextContain(qurumActual, qurum);
        checkTextContain(departamentActual, departament);
        checkTextContain(regionBolmeActual, regionBolme);

        Thread.sleep(2000);
        WebElement elaqeMelumatlar = driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[4]"));
        clickButton(elaqeMelumatlar);

        String otaq = "22221";
        String ipTelefonNomesi = "4550";
        String stasionerNomre = "4545353513";
        String mobilNomre = "454535352";
        String email = "imranovfarid@gmail.com";
        String istifadeci = "PC_DESKTOP_13123FF";
        String ldapIstifadeciAdi = "lasdkjflasdkjf";

        WebElement otaqActual = driver.findElement(By.xpath("//*[contains(text(), '" + otaq + "')]"));
        Thread.sleep(2000);
        WebElement ipTelefonActual = driver.findElement(By.xpath("//*[contains(text(), '" + ipTelefonNomesi + "')]"));
        System.out.println("Actual: " + ipTelefonActual.getText());
        System.out.println("Expected: " + ipTelefonNomesi);

        WebElement stasionerNomreActual = driver.findElement(By.xpath("//*[contains(text(), '" + stasionerNomre + "')]"));
        WebElement mobilNomreActual = driver.findElement(By.xpath("//*[contains(text(), '" + mobilNomre + "')]"));
        WebElement emailActual = driver.findElement(By.xpath("//*[contains(text(), '" + email + "')]"));
        WebElement istifadeciActual = driver.findElement(By.xpath("//*[contains(text(), '" + istifadeci + "')]"));
        WebElement ldapIstifadeciActual = driver.findElement(By.xpath("//*[contains(text(), '" + ldapIstifadeciAdi + "')]"));

        checkTextContain(otaqActual, otaq);
        checkTextContain(ipTelefonActual, ipTelefonNomesi);
        checkTextContain(stasionerNomreActual, stasionerNomre);
        checkTextContain(mobilNomreActual, mobilNomre);
        checkTextContain(emailActual, email);
        checkTextContain(istifadeciActual, istifadeci);
        checkTextContain(ldapIstifadeciActual, ldapIstifadeciAdi);

        Thread.sleep(2000);
        String redButton = "Redaktə et";
        WebElement red = driver.findElement(By.xpath("//*[contains(text(), '" + redButton + "')]"));
        clickButton(red);
        Thread.sleep(2000);

        WebElement otaqSend = driver.findElement(By.id("mat-input-5"));
        otaqSend.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
        otaqSend.sendKeys("33331");

        WebElement yadaaSaxla = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[5]"));
        clickButton(yadaaSaxla);
        Thread.sleep(2000);

        String testotaq2 = "33331";
        WebElement otaqActual2 = driver.findElement(By.xpath("//*[contains(text(), '" + testotaq2 + "')]"));
        Thread.sleep(2000);
        checkTextContain(otaqActual2,testotaq2);
        clickButton(red);
        Thread.sleep(3000);

        WebElement otaqSend3 = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-input-11\"]")));
        clearInputText(otaqSend3);
        otaqSend3.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
        otaqSend3.sendKeys("22221");
        Thread.sleep(2000);
        WebElement yD = driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-contact-edit-dialog/mat-card/mat-card-content/form/div[2]/button[2]/span[1]"));
        clickButton(yD);
        
        String testiqNot = "Təsdiq edildi";
        WebElement testActual = new WebDriverWait(driver, Duration.ofSeconds(50)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + testiqNot + "')]")));
        System.out.println("testActual = " + testActual);
        checkTextContain(testActual,testiqNot);

        //WebElement sifreniDeyish = driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[5]"));
        //clickButton(sifreniDeyish);

    }
}