package HomeExercises;

import java.util.HashSet;
import java.util.Set;

public class Exercises8 {
    public static void main(String[] args) {
        Set<Integer> say = new HashSet<Integer>(); //hızlı ekleme hızli silmede kullanilir
        say.add(213554);
        say.add(576);
        say.add(547);
        say.add(7547);
        say.add(9786);
        say.add(45674);
        say.add(7967);
        say.add(906895);
        say.add(436444);
        //Bu setteki değerleri kontrol edip sayı TEK ise konsola “(buraya sayının kendisi gelecek) sayısı tektir” mesajı yazan fori loop kodunu yazınız.

        for (int current : say) {
            if (current % 2 != 0) {
                System.out.println("Sayısı tekdir: " + current);
            }
        }
    }
}

