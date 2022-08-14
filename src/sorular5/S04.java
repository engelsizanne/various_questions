package sorular5;

import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        int sec = menuGoster();
        if (sec >= 1 && sec <= 4) {
            int sayi1 = sayiGir();
            int sayi2 = sayiGir();
            switch (sec) {
                case 1:
                    topla(sayi1, sayi2);
                    break;
                case 2:
                    cikar(sayi1, sayi2);
                    break;
                case 3:
                    carp(sayi1, sayi2);
                    break;
                case 4:
                    bol(sayi1, sayi2);
                    break;
            }
        } else {
            System.out.println("Hatali secim");
        }
    }

    public static int sayiGir() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen sayiyi giriniz : ");
        return scan.nextInt();
    }

    private static void topla(int s1, int s2) {
        System.out.println("Toplam sonucu : " + (s1 + s2));
    }

    private static void cikar(int s1, int s2) {
        System.out.println("Cikarma sonucu : " + (s1 - s2));
    }

    private static void carp(int s1, int s2) {
        System.out.println("Carpma sonucu : " + (s1 * s2));
    }

    private static void bol(int s1, int s2) {
        System.out.println("Bolme sonucu : " + (((double) s1 / s2)));
    }

    public static int menuGoster() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ISLEM YAPACAGINIZ NUMARAYI SECIN");
        System.out.println("------------------------------------");
        System.out.println(" 1 - Toplama");
        System.out.println(" 2 - Cikarma");
        System.out.println(" 3 - Carpmma");
        System.out.println(" 4 - Bolme");
        System.out.print(" Seciminiz : ");
        return scan.nextInt();
    }
}
