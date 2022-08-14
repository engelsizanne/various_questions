package sorular12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05 {

    /*
         elimizde arabalarin bulundugu bir liste var
         araba listesindeki istenen siradaki arabayi
         istegimiz yeni arabayla degistirip
         eski arabayi, varolan eski arabaler listesine ekleyelim
        */
    public static void main(String[] args) {

        List<String> arabalar = new ArrayList<>();
        arabalar.add("Honda");
        arabalar.add("Toyota");
        arabalar.add("Mercedes");
        arabalar.add("BMW");
        System.out.println("arabalar = " + arabalar);
        List<String> eskiArabalar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi arabayi sattin : ");
        String silinecekAraba = scan.nextLine();

        System.out.println("Hangi arabayi aldin ");
        String yeniAraba = scan.nextLine();

        int temp = arabalar.indexOf(silinecekAraba);
        arabalar.set(temp,yeniAraba);
        eskiArabalar.add(silinecekAraba);

        System.out.println("*************");

        System.out.println("arabalar = " + arabalar);
        System.out.println("eskiArabalar = " + eskiArabalar);

        System.out.println("Hangi arabayi sattin : ");
        silinecekAraba = scan.nextLine();

        System.out.println("Hangi arabayi aldin ");
        yeniAraba = scan.nextLine();

        temp = arabalar.indexOf(silinecekAraba);
        arabalar.set(temp,yeniAraba);
        eskiArabalar.add(silinecekAraba);

        System.out.println("arabalar = " + arabalar);
        System.out.println("eskiArabalar = " + eskiArabalar);

    }
}
