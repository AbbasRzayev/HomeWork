package HomeWork2;

import java.util.Scanner;

public class Exercises4 {

    public static void main(String[] args) {
        //Kullanıcının verdiği yaşı kontrol edip yaş 18 den küçükse “Yaşınız 18’den küçük olduğu için giriş yapamazsınız”, yaş 50’den aşağı ise “Siteyi kullanabilirsiniz”, yaş 50’den yukarı ise “Yaşınız siteye girmek için çok yüksek” diye mesaj yazdıran metot yazınız.

        Integer age = 0;
        boolean check = true;

        while (check) {
            askAge();
            age=GetAge();
            if (age <= 18) {
                System.out.println("18 kicik olduqu icin girish yapa bilmersizin");
            } else if (age >= 19 && age < 50) {
                System.out.println("Siteyi kullana bilirsiniz");
                check = false;
            } else {
                System.out.println("Yashiniz siteye girmek ucun yuksek");
            }
        }
    }
    public static  Integer GetAge()
    {   Scanner answer = new Scanner(System.in);

        return answer.nextInt();
    }
    public static void askAge()
    {
        System.out.println("Siteye girmek icin yashinizi qeyd edin:");
    }
}