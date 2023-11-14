package HomeWork2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises7_version2 {
    public static void main(String[] args) {

        List<String> browser = new ArrayList<>();
        browser.add("Opera");
        browser.add("Chrome");
        browser.add("FireFox");
        browser.add("Edge");

        System.out.println("Browserin ismini bul");
        Scanner answer = new Scanner(System.in);
        String check = answer.nextLine();

        boolean Boom = true;

        for(String browserName: browser)
        {
            if(browserName.equalsIgnoreCase(check))
            {
                System.out.println("Var boyle bir browser");
                Boom = false;
                break;
            }
            else
            {
                System.out.println("Yok boyle bir browser");
            }
        }

    }
}
