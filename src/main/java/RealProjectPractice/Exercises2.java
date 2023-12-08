package RealProjectPractice;

import java.util.ArrayList;
import java.util.List;

public class Exercises2 {
    public static void main(String[] args) {

        List<String> password = new ArrayList<>();
        password.add("hakana@gmail");
        password.add("feyza@hotmail.com");
        password.add("ferityahoo");
        password.add("leyla@hotmail.com");
        password.add("samet@hotmail");
        password.add("yusufhotmail");

        for (int i =0; i < password.size(); i++ )
        {
           if(i % 2==0){
               System.out.println("Numarasi cift olan elemanlar: " + password.get(i));
           }
        }
    }
}