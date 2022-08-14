package sorular09;

public class M10 {

    /*
    Java dersine giren 10 kişilik bir sınıftaki öğrencilerin isimleri, vize - final notları  ve proje Notları üç ayrı dizide tutulmaktadır.
Not: dizilerdeki index numarası aynı olan elemenlar aynı kişiye ait bilgileri temsil etmektedir.

 String isimler[]={"Adem","Emsal","Ayşe","Yasemin","Gülşah","Hüseyin","Birol","Cihan","Hatice","Selim"}
 int vizeFinalNotu[][]={{65,85},{75,90},{92,55},{68,72},{68,75},{75,55},{85,90},{65,56},{55,88},{72,86}}
 int projeNotu[]={100,50,0,50,68,78,85,90,98,100};


  İSTENEN - I - Vize Notunun %30'u , Final notunun % 50'si, Proje Notunun %20'si alınarak ders notu ortalaması bulunacak ve "ortalamaNotu" adlı dizide saklanacaktır.
     Örnek :Vize ve Final Notu : 65,85; Proje notu : 100  olan bir öğrencinin ortalama Notu ==> 65*0,3 + 85*0,5 + 80*0,2 = 78

  İSTENEN - II - Tüm sınıfın vize, Final, Proje ve Ortalama notlarını alt alta sıralayın.
  Örnek : JAVA 82 SINIFININ NOT LİSTESİ
           ADI      V   F    P     ORT
           Adem    65  85  100   82.0
           Emsal   75  90  50    77.5  .. gibi

  İSTENEN - III - Sınıfın Ağırlıklı not ortalamasını bulun ve yazdırın; ( Tüm öğrencilerin ortalamasının, öğrenci sayısına bölünmesi ile bulunur. )
     Örnek : Java 82 sınıfının Ağrırlıklı Not Ortalaması : 62,26 gibi

 İSTENEN - IV - Ağırlıklı Sınıf Not Ortalamasından daha düşük not ortalamasına sahip kişileri
  BÜTÜNLEMEYE GELECEK ÖĞRENCİLER şeklinde isimleri ve karşılarına not ortalamaları gelecek şekilde
    Örnek : BÜTÜNLEMEYE KALAN ÖĞRENCİLER
            Adı                 Ortalaması
            Hüseyin               55.26
            Hatice                61.25   ... gibi
     */

    public static void main(String[] args) {

        String isimler[] = {"Adem", "Emsal", "Ayşe", "Yasemin", "Gülşah", "Hüseyin", "Birol", "Cihan", "Hatice", "Selim"};

        int vizeFinalNotu[][] = {{65, 85}, {75, 90}, {92, 55}, {68, 72}, {68, 75}, {75, 55}, {85, 90}, {65, 56}, {55, 88}, {72, 86}};
        int projeNotu[] = {100, 50, 0, 50, 68, 78, 85, 90, 98, 100};

        double[] ort = new double[isimler.length];
        double sinifNotOrtalamasi = 0;

        System.out.println("JAVA 82 SINIFININ NOT LISTESI");
        System.out.println("Adi         Vize    Final   Proje   Ort");

        for (int i = 0; i < ort.length; i++) {

            ort[i] = (vizeFinalNotu[i][0] * 0.3 + vizeFinalNotu[i][1] * 0.5 + projeNotu[i] * 0.2);
            sinifNotOrtalamasi += ort[i];
            System.out.println(isimler[i] + "\t\t" + vizeFinalNotu[i][0] + "\t\t" + vizeFinalNotu[i][1] + "\t\t" + projeNotu[i] + "\t\t" + ort[i]);

        }
        sinifNotOrtalamasi /= ort.length;

        System.out.println("Sinif Not Ortalamasi = " + sinifNotOrtalamasi);
        System.out.println("\nBUTUNLEMEYE KALAN OGRENCILER");
        System.out.println("Adi         Ortalamasi");

        for (int i = 0; i < ort.length; i++) {

            if (sinifNotOrtalamasi > ort[i]) {
                System.out.println(isimler[i] + "\t\t" + ort[i]);

            }
        }

    }

}
