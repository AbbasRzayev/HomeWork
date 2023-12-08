package RealProjectPractice;

import java.util.Scanner;

public class Exercises7_version3 {
    public static void main(String[] args) {

        AskBrowser();
        String browser =  SetBrowser();
        Check(browser);


    }
    public static void AskBrowser()
    {
        System.out.println("Istifade etdiyiniz browseri secin: Opera, Chrome, FireFox, Edge. ");
    }
    public static String SetBrowser()
    {   Scanner answer = new Scanner(System.in);
        return  answer.nextLine().trim().toUpperCase();
    }

    public static void Check(String name)
    {
        switch (name)
        {
            case "OPERA":
                System.out.println("Opera browser secildi");
                break;
            case "CHROME":
                System.out.println("Chrome browser secildi");
                break;
            case "FIREFOX":
                System.out.println("FireFox browser secildi");
            case "EDGE":
                System.out.println("Edge browser secildi");
            default:
                System.out.println("Duzgun browser seciniz!");
        }
    }
}
