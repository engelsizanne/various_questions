package sorular09;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M09 {
    /*
  1-
  kullanıcı  islem fields -->
  String alinacakSehir;
  String alinacakGun; (MM,dd--> ay gun formatında olmalı)
  double alisSaati;
  String teslimGunu;  (MM,dd--> ay gun formatında olmalı)
  double teslimSaati;
  arac fields -->
  String marka; (liste araclari --> opel toyota volvo)
  String model;  (astra corolla s60)
  String yakitTipi;  (diesel benzin)
  String vites; (manuel otomatik)
  double gunlukUcret; ( 100 120 150... liste dısı arac=300)
  2-musteriden  yukarida ozellikleri verilen liste araclardan
  tercihini alınız. eger musteri farklı bir arac talep ederse
  talep ettigi aracın fields'larını alınız.
  musterinin ad, soyad, yas, telefon, id  ve kredi kartı bilgileri ile
  arac tercihine ve islemine gore odemesini gerçekleştriniz..
   */
    public static void main(String[] args) throws InterruptedException {

        List<String> markaArac = new ArrayList<>();
        markaArac.add("1-Opel ");
        markaArac.add("2-Toyota");
        markaArac.add("3-Volvo");

        List<String> modelArac = new ArrayList<>();
        modelArac.add("1-Astra");
        modelArac.add("2-Corolla");
        modelArac.add("3-S60");

        List<String> vitesArac = new ArrayList<>();
        vitesArac.add("1-Manuel");
        vitesArac.add("2-Otomatik");

        List<Integer> gunlukUcretArac = new ArrayList<>();
        gunlukUcretArac.add(100);
        gunlukUcretArac.add(150);
        gunlukUcretArac.add(200);
        gunlukUcretArac.add(250);
        gunlukUcretArac.add(300);
        gunlukUcretArac.add(350);

        Scanner scan = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("\t\tHosgeldiniz");
        System.out.print("Araci alacaginiz sehri giriniz : ");
        String alinacakSehir = scan.nextLine();
        System.out.print("Araci alacaginiz ay : ");
        int alinacakAy = scan.nextInt();
        System.out.print("Araci alacaginiz gun : ");
        int alinacakGun = scan.nextInt();
        System.out.print("Araci alacaginiz saati giriniz : ");
        int alisSaati = scan.nextInt();
        LocalDate alinacakTarih = LocalDate.of(2022, alinacakAy, alinacakGun);
        System.out.print("Araci teslim edeceginiz ay : ");
        int teslimAy = scan.nextInt();
        System.out.print("Araci teslim edeceginiz gun : ");
        int teslimGun = scan.nextInt();
        System.out.print("Araci teslim edeceginiz saati giriniz : ");
        int teslimSaati = scan.nextInt();
        LocalDate teslimTarih = LocalDate.of(2022, teslimAy, teslimGun);

        int kontrol = 0;
        int kontrol2 = 0;
        int kontrol3 = 0;
        while (kontrol < 3) {

            System.out.print("Lutfen marka seciniz : ");
            System.out.print(markaArac);
            System.out.println("");
            String marka = scan.next();
            if ("1".equals(marka)) {
                marka = "Opel";
                System.out.println("marka = " + marka);
                kontrol++;
            } else if ("2".equals(marka)) {
                marka = "Toyota";
                System.out.println("marka = " + marka);
                kontrol++;
            } else if ("3".equals(marka)) {
                marka = "Volvo";
                System.out.println("marka = " + marka);
                kontrol++;
            } else {
                System.out.println("Hatali marka secimi:Lutfen 1,2 yada 3 giriniz");
                kontrol = 0;
                break;
            }
            System.out.print("Lutfen model seciniz : ");
            System.out.print(modelArac);
            System.out.println("");
            String model = scan.next();
            if ("1".equals(model)) {
                model = "Astra";
                System.out.println("model = " + model);
                kontrol++;
            } else if ("2".equals(model)) {
                model = "Corolla";
                System.out.println("model = " + model);
                kontrol++;
            } else if ("3".equals(model)) {
                model = "S60";
                System.out.println("model = " + model);
                kontrol++;
            } else {
                System.out.println("Hatali model secimi:Lutfen 1,2 yada 3 giriniz");
                kontrol = 0;
                break;
            }
            System.out.println("***************************************");
            if (marka == "Opel" && model != "Astra") {
                System.out.println("Marka ve model uyusmuyor");
                break;
            }
            if (marka == "Toyota" && model != "Corolla") {
                System.out.println("Marka ve model uyusmuyor");
                break;
            }
            if (marka == "Volvo" && model != "S60") {
                System.out.println("Marka ve model uyusmuyor");
                break;
            }
            System.out.print("Lutfen vites seciniz : ");
            System.out.print(vitesArac);
            System.out.println("");
            String vites = scan.next();
            if ("1".equals(vites)) {
                vites = "Manuel";
                System.out.println("vites = " + vites);
                kontrol++;
            } else if ("2".equals(vites)) {
                vites = "Otomatik";
                System.out.println("vites = " + vites);
                kontrol++;
            } else {
                System.out.println("Hatali vites secimi:Lutfen 1 yada 2 giriniz");
                kontrol = 0;
                break;
            }
            int gunlukUcret = 0;
            if (marka == "Opel" && model == "Astra" && vites == "Manuel") {
                gunlukUcret = gunlukUcretArac.get(0);
            }
            if (marka == "Opel" && model == "Astra" && vites == "Otomatik") {
                gunlukUcret = gunlukUcretArac.get(1);
            }
            if (marka == "Toyota" && model == "Corolla" && vites == "Manuel") {
                gunlukUcret = gunlukUcretArac.get(2);
            }
            if (marka == "Toyota" && model == "Corolla" && vites == "Otomatik") {
                gunlukUcret = gunlukUcretArac.get(3);
            }
            if (marka == "Volvo" && model == "S60" && vites == "Manuel") {
                gunlukUcret = gunlukUcretArac.get(4);
            }
            if (marka == "Volvo" && model == "S60" && vites == "Otomatik") {
                gunlukUcret = gunlukUcretArac.get(5);
            }
            System.out.println("Seciminiz");
            System.out.println("marka = " + marka);
            System.out.println("model = " + model);
            System.out.println("vites = " + vites);
            System.out.println("Gunluk ucret : " + gunlukUcret);
            Period gecenSure = Period.between(alinacakTarih, teslimTarih);
            int toplamGunSayisi = gecenSure.getDays() + (gecenSure.getMonths() * 30);
            System.out.println("toplamGunSayisi = " + toplamGunSayisi);
            int toplamUcret = toplamGunSayisi * gunlukUcret;
            System.out.println("toplamUcret = " + toplamUcret);
            System.out.println("");
            kontrol2++;
            kontrol3++;
        }

        System.out.println("*******************************");
        while (kontrol2 > 0) {

            System.out.print("Lutfen isim giriniz : ");
            System.out.print("");
            String isim = scan.next();
            System.out.print("Lutfen Soyisim giriniz : ");
            System.out.print("");
            String soyIsim = scan.next();
            System.out.print("Lutfen yas giriniz : ");
            System.out.print("");
            String yas = scan.next();
            System.out.print("Lutfen telefon no giriniz : ");
            System.out.print("");
            String telefon = scan.next();
            System.out.print("Lutfen tc kimlik no giriniz : ");
            System.out.print("");
            String tcKinlikNo = scan.next();
            System.out.print("Lutfen tc kredi kart no giriniz : ");
            System.out.print("");
            String krediKartNo = scan.next();
            System.out.println("Sayin " + isim + " " + soyIsim + " Lutfen bekleyiniz...");
            kontrol2 = 0;
            kontrol3++;
        }

        while (kontrol3 == 2) {
            Thread.sleep(3000);
            System.out.println("...");
            Thread.sleep(3000);
            System.out.println();
            System.out.println("isleminiz basariyla gerceklesti");
            System.out.println("Iyi gunler");
            System.out.println("****************************");
            kontrol3 = 0;

        }
    }
}