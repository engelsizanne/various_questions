package sorular3;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        // SORU 1 : Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
        // o ana kadar kaç sayı girildiği ekrana yazdırılacak.
        // bu soruyu hem for-loop hemde while -do döngüsü ile yapınız.
        Scanner al = new Scanner(System.in);
        int top = 0;
        int sayac = 0;
        for (int i = 1; top <= 100; i++) { // i kontrol et
            System.out.print(i + " .Sayıyı Gir :");
            int sayi = al.nextInt();
            top += sayi;
            sayac++;
        } // döngü sonu
        System.out.println(sayac + "  Adet Sayı Girdiniz");
        top = 0;
        sayac = 0;
        int i =1;
        while(top<=100){
            System.out.print(i + " .Sayıyı Gir :");
            int sayi = al.nextInt();
            top+=sayi;
            sayac++;
        }
        System.out.println(sayac + " Adet Sayı girdiniz " + top);
    }
}

