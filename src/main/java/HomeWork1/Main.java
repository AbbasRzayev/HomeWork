package HomeWork1;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // String adSoyad= "Selami Hakverdi";
        //Bu stringde ismi bir string kutusuna, soyisimi ayrı bir string kutusuna koyan kodları yazınız.
        String adSoyad = "Selami Hakverdi";
        String[] sn = adSoyad.split(" ");
        String isim = sn[0];
        String soyad = sn[1];
        System.out.println("Soyad= " + isim + " isim= " + soyad);

        //2-	   String str ="€78";
        //Bu stringi sayıya çeviren bir kod yazınız.
        String str = "€78";
        String simvolSil = str.replaceAll("€", "");
        int rakamConvert = Integer.parseInt((simvolSil));
        System.out.println("rakamConvert = " + rakamConvert);

        //3-	String str ="$1 $12 €34 €56 $45 €78";
        //Bu stringi Integer Array yapan kodu yazınız.
        String str1 = "$1 $12 €34 €56 $45 €78";
        String simvolClean = str1.replaceAll("[€$]", "");
        String[] ArrayString = simvolClean.split(" ");
        int[] intArray = new int[ArrayString.length];
        for (int i = 0; i < ArrayString.length; i++) {
        intArray[i] = Integer.parseInt(ArrayString[i]);
        System.out.println("IntArray = " + intArray[i]);

        //4-	String text= "Ben çabalarsam Java'yı öğrenirim.";
        //Bu stringde “Selenium” kelimesi olup olmadığını sorgulayan kodu yazınız.
        String text= "Ben çabalarsam Java'yı öğrenirim.";
        boolean check= text.contains("Selenium");
        boolean checkAgain= text.contains("Java'yı");
        System.out.println("varmi = " + check);
        System.out.println("varmi = " + checkAgain);

        // 5-	String text= "Ben çabalarsam Java'yı öğrenirim.";
        // Bu stringde büyük küçük harf duyarlılığına bakmaksızın “ÇABA” kelimesi olup olmadığını sorgulayan kodu yazınız.
        String text9= "Ben çabalarsam Java'yı öğrenirim.";
        String new1= text9.toUpperCase();
        boolean compare= new1.contains("ÇABA");
        System.out.println("compare = " + compare);

        //6-  int sayi= 446345;
        // Bu sayıyı string yapan kodu yazınız.
        int say= 446345;
        //String turn= say.toString(); niye boyle alinmoyor?
        String turn=  Integer.toString(say);
        System.out.println("turn = " + turn);

        String turn2= String.valueOf(say);
        System.out.println("turn2 = " + turn2);

        //7-	String text= "Selenium Cucumber ile otomasyon testleri yapmak @ çok kolay .com.";
        // Bu strginde @ işareti olup olmadığını sorgulayan kodu yazınız
        String text1= "Selenium Cucumber ile otomasyon testleri yapmak @ çok kolay .com.";
        boolean consist= text1.contains("@");
        System.out.println("consist = " + consist);

        //8-	String text= "Selenium Cucumber ile otomasyon testleri yapmak @ çok kolay .com.";
        // Bu stringin “.com” ile bitip bitmediğini sorgulayan kodu yazınız.
        String text2= "Selenium Cucumber ile otomasyon testleri yapmak @ çok kolay .com.";
        boolean checkCom= text2.endsWith(".com");
        System.out.println("checkCom = " + checkCom);

        // 9-	String text= "Selenium Cucumber ile otomasyon testleri yapmak @ çok kolay .com.";
        // Bu stringde bütün “e” harflerini “a” yapan kodu yazınız.
        String text6= "Selenium Cucumber ile otomasyon testleri yapmak @ çok kolay .com.";
        String transfer= text6.replaceAll("e","a");
        System.out.println("transfer = " + transfer);

        // 10-	String text= "Selenium Cucumber ile otomasyon testleri yapmak @ çok kolay .com.";
        // Bu stringde @ işaretini “çok” kelimesi ile değiştiren kodu yazınız.
        String text4= "Selenium Cucumber ile otomasyon testleri yapmak @ çok kolay .com.";
        String transfer2= text4.replace("@","çok");
        }
    }
}