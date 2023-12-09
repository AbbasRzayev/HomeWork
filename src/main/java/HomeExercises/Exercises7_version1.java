package HomeExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises7_version1 {
    public static void main(String[] args) {

        List<String> browser = new ArrayList<>();
        browser.add("Opera");
        browser.add("Chrome");
        browser.add("FireFox");
        browser.add("Edge");
        boolean ops = true;
        while(ops)
        {
        System.out.println("Browserin ismini bul");
        Scanner answer = new Scanner(System.in);
        String check = answer.nextLine();

        for(String browserName: browser ) {
            if (browserName.contains(check)) {
                System.out.println("var boyle browser");
                ops = false;
                break;
            } else {
                System.out.println("Yoktur boyle browser");
                break;
            }
        }
        }
    }
}
