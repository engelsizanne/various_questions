package sorular6;

import java.util.Scanner;

public class W09 {
    public static void main(String[] args) {
        // STRING OLAN PIN  ve PUK kodunuzu kontrol eden bir kod yazınız.
        String pin = "ayse1234";
        String puk = "azra1234";

        String sifre = " ";
        String sifre2 = " ";

        int pinGirisHakki = 3;
        int pukGirisHakki = 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("****NADİR BULUNAN TELE HOSGELDİNİZ :)****");

        while (true) {
            System.out.println("Pin kodunuzu giriniz: ");
            sifre = scan.nextLine();
            if (sifre.equals(pin)) {
                System.out.println("Basarili giris yaptiniz");
                break;
            } else {
                System.out.println("Yanlıs giris yaptiniz");
                pinGirisHakki--;
                System.out.println("Kalan giris pin hakkiniz: " + pinGirisHakki);

            }
            if (pinGirisHakki == 0) {
                System.out.println("Pin kodunuzu sifirladiniz");
                break;
            }

        }

        while (!sifre.equals(pin)) {
            System.out.println("Puk Kodunuzu giriniz: ");
            sifre2 = scan.nextLine();
            if (sifre2.equals(puk)) {
                System.out.println("Basarili giris yaptiniz");
                break;
            } else {
                System.out.println("Yanlıs giris yaptiniz");
                pukGirisHakki--;
                System.out.println("Kalan giris puk hakkiniz: " + pukGirisHakki);

            }
            if (pukGirisHakki == 0) {
                System.out.println("Sim karti bloke ettiniz, artik is görmez:))");
                break;
            }

        }
    }
}