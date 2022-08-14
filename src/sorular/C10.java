package sorular;

import java.util.Scanner;

public class C10 {
/*
Kullanicidan bir sifre girmesini isteyin.Girilen sifreyi asagidaki sartlara gore kontrol edin ve
sifredeki hatalari yazdirin. Kullanici gecerli bir sifre girincee kadar bu islemi tekrar edin ve
gecerli sifre girildiginde "sifreniz Kabul edilmistir" yazdirin.
-Sifre kucuk harf icermelidir
-Sifre buyuk harf icermelidir
-Sifre ozel karekter icermelidir
-sifre enaz 8 karekter olmalidir.
 */

    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        String sifre = "";
        int karuz = 0;
        int kard;
        int kucd;
        int buyd;
        int ozkd;
        int dog;
        do {
            kard = 0;
            kucd = 0;
            buyd = 0;
            ozkd = 0;
            dog = 0;
            System.out.print("Şifrenizi Girin : ");
            sifre = al.nextLine();
            karuz = sifre.length();
            for (int i = 0; i < karuz; i++) {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') kucd = 1;
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') buyd = 1;
                if (sifre.charAt(i) < 65 || sifre.charAt(i) > 122) ozkd = 1;
            } // döngü sonu
            if (karuz >= 8) kard = 1;
            if (kucd == 0) System.out.println(" Küçük Harf olmalı");
            if (buyd == 0) System.out.println(" Büyük Harf olmalı");
            if (ozkd == 0) System.out.println(" Özel Karakter  olmalı");
            if (kard == 0) System.out.println(" Sifre en az 8 karakter olmalidir");
            dog = kard + buyd + ozkd + kucd;
            if (dog == 4) System.out.println(" Şifre Doğru");
        } while (dog != 4);
    }
}
