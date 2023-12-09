package HomeExercises;

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {

        //Elimizdeki bir stringin içinde kullanıcının verdiği kelimenin var olup olmadığını kontrol edip “Aradığınız kelime içinde var” veya
        // “Aradığınız kelime içinde yok” şeklinde sonuç yazdıran metot yazınız.

        Scanner word = new Scanner(System.in);
        String metn = "OYLE BIR HAYAT YASHA KI ARKAYA BAKDIQINDA UTANMIYASIN";
        System.out.println("Aradin sozu yaz:");
        boolean wait= true;
        while(wait)
        {
            String control = word.nextLine();
            if (Check(metn, control))
            {
                System.out.println("Aranan kelime metnin icinde var");
                wait = false;
            }
            else
            {
                System.out.println("Aranan kelime metinin icinde yok");
            }

        }
    }
           public static boolean Check(String metn, String control)
        {
            return metn.contains(control.trim().toUpperCase());
        }
    }