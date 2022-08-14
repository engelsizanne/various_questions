package sorular09;

import java.util.Scanner;

public class M01 {

    public static void main(String[] args) {
        boolean sifreGirildimi = false;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("lutfen Sifrenizi giriniz...");// sifremiz 1234 olsun
            sifreGirildimi = false;
            int sifre = scan.nextInt();
            if (sifre == 1234) {
                sifreGirildimi = true;
                System.out.println("Sifre dogru");
            } else {
                sifreGirildimi = false;
                System.out.println("Sifre yanlis");
            }
        } while (!sifreGirildimi);
        if (sifreGirildimi) {
            int bakiye = 1000000;
            String menuCikis = "";
            String islemSonlandirma="";
            do {
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.println("\n****İSLEMLER****\n");
                System.out.println("1. Para Çekme");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Bakiye sorgulama");
                System.out.println("4. Kart İade");
                System.out.print("\nİsleminizi Seciniz: ");
                int islem = scan.nextInt();
                switch (islem) {
                    case 1:
                        do {
                            System.out.println("Lutfen cekmek istediginiz tutarı giriniz...");
                            int cekilmekIstenenTutar = scan.nextInt();
                            if (bakiye >= cekilmekIstenenTutar) {
                                bakiye -= cekilmekIstenenTutar;
                                System.out.println("Islem basarı ile gerceklesti, yeni bakiyeniz : " + bakiye);
                                System.out.println("menuye donmek icin x tusuna basınız,para cekmeye devam etmek icin baska herhangi bir tusa basınız");
                                menuCikis = scan.next();
                            }
                        } while (!menuCikis.equals("x"));
                        break;
                    case 2:
                        do {
                            System.out.println("Lutfen yatırmak istediginiz tutarı giriniz...");
                            int yatirmakIstenenTutar = scan.nextInt();
                            if (yatirmakIstenenTutar > 0) {
                                bakiye += yatirmakIstenenTutar;
                                System.out.println("Isleminiz basari ile gerceklesti, yeni bakiyeniz : " + bakiye);
                                System.out.println("Menuye donmek icin x tusuna basınız, devam etmek icin herhangi tusa basınız");
                                menuCikis = scan.next();
                            }
                        } while (!menuCikis.equals("x"));
                    case 3:
                        System.out.println("Mevcut bakiyeniz : " + bakiye);
                        break;
                    case 4:
                        islemSonlandirma="exit";
                        System.out.println("Isleminiz sonlandırıldı \nIyı gunler dileriz...");
                        break;
                }

            }while (!islemSonlandirma.equals("exit"));
        }
    }
}