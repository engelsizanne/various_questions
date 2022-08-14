package sorular5;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        /*
        Kullanici ehliyet almak istiyor
kullanicidan isim soyisim yas alin ve Surmek istedigi araci sectirin

Motor 16 yas ustu ve 1200tl
Araba 18 yas ustu ve 2500tl
Ucak 22 yas ve ustu 30000tl
gemi 20 yas ve ustu 15000tl

taksit imkani sunun
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz: ");
        String ad = scan.nextLine();
        ad = ad.replace(" ", "qazwsx");
        ad = ad.replaceAll("\\W", "");
        ad = ad.replace("qazwsx", " ");
        System.out.print("Soydinizi giriniz: ");
        String soyad = scan.nextLine();
        soyad = soyad.replace(" ", "qazwsx");
        soyad = soyad.replaceAll("\\W", "");
        ad = ad.replace("qazwsx", " ");
        String bosluk = "\n=================================================================";
        System.out.print("Yasinizi giriniz: ");
        int yas = scan.nextInt();
        if (!((yas > 100) || (yas < 0))) {


            System.out.print("Istediginiz arac ehliyetinin numarasini giriniz\n1. Araba\n2. Motorsiklet\n3. Ucak\n4. Gemi\nNumara: ");
            int arac = scan.nextInt();

            if (arac == 1 || arac == 2 || arac == 3 || arac == 4) {


                switch (arac) {
                    case 1:
                        if (yas >= 18) {
                            System.out.print("""
                                    Araba ehliyenin fiyat alternatiflerini degerlendirebilirsiniz
                                    1. 3500TL 10 taksit
                                    2. 3000TL 5 taksit
                                    3. Nakit 2500TL
                                    Numara:\s""" + bosluk);
                            int arabaOdeme = scan.nextInt();
                            if (arabaOdeme == 1) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Araba" + "\nOdeme: 3500TL 10 taksit");
                            } else if (arabaOdeme == 2) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Araba" + "\nOdeme: 3000TL 5 taksit");
                            } else if (arabaOdeme == 3) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Araba" + "\nOdeme: Nakit 2500TL");
                            } else {
                                System.out.println("Lutfen gecerli bir numara giriniz");
                            }

                        } else {
                            System.out.println(bosluk + "\nYasiniz Araba ehliyeti almaya uygun degil");
                        }
                        break;
                    case 2: {
                        if (yas >= 16) {
                            System.out.print("""
                                    Motor ehliyenin fiyat alternatiflerini degerlendirebilirsiniz
                                    1. 1800TL 10 taksit
                                    2. 1500TL 2 taksit
                                    3. Nakit 1500TL
                                    Numara:\s""" + bosluk);
                            int arabaOdeme = scan.nextInt();
                            if (arabaOdeme == 1) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Motorsiklet" + "\nOdeme: 1800TL 10 taksit ");
                            } else if (arabaOdeme == 2) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Motorsiklet" + "\nOdeme: 1500TL 2 taksit");
                            } else if (arabaOdeme == 3) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Motorsiklet" + "\nOdeme: Nakit 1500TL");
                            } else {
                                System.out.println("Lutfen gecerli bir numara giriniz");
                            }
                        } else {
                            System.out.println(bosluk + "\nYasiniz Motor ehliyeti almaya uygun degil");
                        }
                        break;


                    }
                    case 3: {
                        if (yas >= 22) {
                            System.out.print("""
                                    Ucak ehliyenin fiyat alternatiflerini degerlendirebilirsiniz
                                    1. 35.000TL 10 taksit
                                    2. 33.000 5 taksit
                                    3. Nakit 30.000TL
                                    Numara:\s""" + bosluk);
                            int arabaOdeme = scan.nextInt();
                            if (arabaOdeme == 1) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Ucak" + "\nOdeme: 35.000TL 10 taksit");
                            } else if (arabaOdeme == 2) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Ucak" + "\nOdeme: 33.000TL 5 taksit");
                            } else if (arabaOdeme == 3) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Ucak" + "\nOdeme: Nakit 30.000TL");
                            } else {
                                System.out.println("Lutfen gecerli bir numara giriniz");
                            }
                        } else {
                            System.out.println(bosluk + "\nYasiniz  Ucak almaya uygun degil");
                        }
                        break;
                    }
                    case 4:
                        if (yas >= 20) {
                            System.out.print("""
                                    Gemi ehliyenin fiyat alternatiflerini degerlendirebilirsiniz
                                    1. 1500TL 10 taksit
                                    2. 17.000 5 taksit
                                    3. Nakit 15.000TL
                                    Numara:\s""" + bosluk);
                            int arabaOdeme = scan.nextInt();
                            if (arabaOdeme == 1) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Gemi" + "\nOdeme: 1500TL 10 taksit");
                            } else if (arabaOdeme == 2) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Gemi" + "\nOdeme: 17.000TL 5 taksit");
                            } else if (arabaOdeme == 3) {
                                System.out.println(bosluk + "\nAdiniz: " + ad + "\nSoyadiniz: " + soyad + "\nYasiniz: " + yas +
                                        "\nSectigniz ehliyet: Gemi" + "\nOdeme: Nakit 15.000TL");
                            } else {
                                System.out.println(bosluk + "\nLutfen gecerli bir numara giriniz");
                            }
                        } else {
                            System.out.println(bosluk + "\nYasiniz Gemi ehliyeti almaya uygun degil");
                        }
                        break;
                    default:
                        System.out.println(bosluk + "\nLutfen gecerli bir numara giriniz");
                        break;
                }
            } else {
                System.out.println("Lutfen gecerli ifadeleri  kullanin");
            }
        } else {
            System.out.println("Lutfen gecerli bir yas girniz");
        }
    }
}
