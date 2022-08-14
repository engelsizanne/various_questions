package sorular;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {


    /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
         ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
         Output:
         char ch1= 'a' ;
         String name =“John came late"
         Expected Output:
         Number of a = 2
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("İsim giriniz: ");
        String isim = scan.nextLine().toLowerCase();
        System.out.print("Karakter giriniz:");
        char karakter = scan.next().toLowerCase().charAt(0);
        int tekrarSayisi = 0;
        for (int i = 0; i < isim.length(); i++) {
            if (karakter == isim.charAt(i)) {
                tekrarSayisi++;
            }
        }
        System.out.println("Girilen karakter " + karakter + " " + tekrarSayisi + " kez tekrar edilmistir.");

    }
}