package sorular10;

import java.util.Scanner;

public class D05 {


    static String kKnum = "1234456778963698";
    static String sifre = "Hmn123469";
    static int bakiye = 100000;
    static
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        /*
           Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
            Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
            Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
            Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
            Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
            Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
            Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
*/
        while (true) {
            System.out.println("Kart numaranızı giriniz ");
            String kKnum1 = scan.nextLine();
            kKnum1 = kKnum1.replace("\\s", "");
            System.out.println("Şifrenizi giriniz");
            String sifre1 = scan.nextLine();
            if (sifre1.equals(sifre) && kKnum1.equals(kKnum)) {
                System.out.println("Giriş yapılıyor...");
                Thread.sleep(1500);
                menu();
                break;
            } else {
                System.out.println("Hatalı giriş yaptınız,");
            }
        }
    }

    public static void menu() throws InterruptedException {
        System.out.println("1.Bakiye Sorgula\n2.Para Yatırma\n3.Para Cekme\n4.Para Gönderme\n5.Sifre Değiştirme\n6.Cikis");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Bakiyeniz:" + bakiye);
                menu();
                break;
            case 2:
                System.out.println("Yatırılacak parayı giriniz");
                bakiye += scan.nextInt();//bakiyenin üstüne girilen parayı eklicez
                System.out.println("Güncel bakieniz:" + bakiye);
                menu();
                break;
            case 3:
                System.out.println("Çekilecek tutarı giriniz");
                int cekilen = scan.nextInt();
                if (cekilen > bakiye) {
                    System.out.println("Bakiyeniz yetersiz");
                } else {
                    bakiye -= cekilen;
                    System.out.println(cekilen + " cekildi..\nMevcut bakiyeniz :" + bakiye);
                }
                menu();
                break;
            case 4:
                System.out.println("Göndereceğiniz miktarı yazınız");
                int gönderilen = scan.nextInt();
                if (gönderilen > bakiye) {
                    System.out.println(" Bakiyeniz yetersiz");
                } else {
                    System.out.println("Gönderilecek ıbanı giriniz");
                    String iban = scan.nextLine();
                    if (iban.length() == 26 && iban.startsWith("TR")) {
                        System.out.println(gönderilen + "gönderildi..\nMevcut bakiyeniz :" + bakiye);
                    } else {
                        System.out.println("Giriş hatalı");
                    }
                }
                menu();
                break;
            case 5:
                String bosKod = scan.nextLine();
                System.out.println("Mevcut sifrenizi giriniz");
                Thread.sleep(2000);
                String girilenSifre = scan.nextLine();
                Thread.sleep(500);
                if (girilenSifre.equals(sifre)) {
                    System.out.println("Yeni sifre giriniz");
                    sifre = scan.nextLine();
                    System.out.println("Sifre değiştirildi");
                } else {
                    System.out.println("Giriş hatalı");
                }
                menu();
                break;
            case 6:
                System.out.println("cıkıs yapıldı");
                menu();
                break;
            default:
                System.out.println("hatalı secim yaptınız");
                menu();
        }
    }
}