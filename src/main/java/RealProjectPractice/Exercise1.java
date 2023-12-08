package RealProjectPractice;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hakana@gmail");
        list.add("kemal@yahoo");
        list.add("ferityahoo");
        list.add("leyla@hotmail");
        list.add("samet@hotmail");
        list.add("yusufhotmail");

        int check = 0;

        do {
            for (String email : list) {
                 if (email.contains("yusufhotmail")) {
                    System.out.println(check + " Merhaba");
                    check++;
                    break;
                }
            }
        }
        while (check<6);
    }
}