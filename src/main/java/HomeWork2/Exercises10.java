package HomeWork2;

import java.util.Scanner;

public class Exercises10 {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        String tekst = word.nextLine();

        String check = replace(tekst);
        System.out.println("check = " + check);

    }
    public static String replace(String text)
    {
        return text.replaceAll("[^a-zA-Z]","");
    }
    }

