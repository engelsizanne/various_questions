package sorular;

import java.util.Scanner;

public class Okek_Obeb_Method {

    /*
    Girilen iki sayının OKEK'ini ve OBEB'ini bulan ve geri dönderen
    okek() ve obeb() methodları
     */
    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);
        System.out.print(" 1.Sayı : ");
        int s1 = al.nextInt();
        System.out.print(" 2.Sayı : ");
        int s2 = al.nextInt();
        System.out.println("OKEK :" + okek(s1, s2));
        System.out.println("OBEB :" + obeb(s1, s2));
    }
    public static int obeb(int s1, int s2) {
        int buyuk;
        if (s1 >= s2) { // girilen iki sayıdan büyüğünü buldum ve buyuk değişkenine atadım.
            buyuk = s1;    // döngü devam ettikçe OBEB'i bulamadığında döngüyü büyük
        } else buyuk = s2;    // olan sayıya kadar döndürüp, dongüyü kırmak için büyük sayıya ihtiyacım var.
        int obeb =0; // bulacağım OBEB için int obeb değişkeni oluştursum ve ilk başta 0 atadım. OBEB bulamaz ise 0 değerini geri döndürür.
        if (s1 == 0 || s2 == 0) {
            System.out.println(" Sıfır sayısının OBEB'i olmaz");  // sayılardan herhangi birinin 0 olması durumunu sorgulattım.
        } else {
            for (int i = 2; (i >= 2); i++) { // 1 rakamının OBEB olmaması için i=2 den başladı
                if (s1 % i == 0 && s2 % i == 0) { // iki sayıyı aynı anda i'ye bölünce kalanı 0 oluyor ise;  o i değeri OBEB dir.
                    obeb = i;  // OBEB olarak bulunan i değerini obeb değişkenine atadım.
                    i = -1;  // döngüyü kırmak için i'ye -1 değeri gönderdim.
                } else if (i >=buyuk) { // i değeri artıkça ve OBEB bulamadıkça döngü, girilen sayılardan büyük olana kadar dönsün diye kontrol ettirdim. Bunu yapmazsak sonsuz döngüye giriyor.
                    i = -1;   // // döngüyü kırmak için i'ye -1 değeri gönderdim.
                }
            }
        }
        return obeb; // bulduğum OBEB değerini geri gönderdim.
    }
    public static int okek(int s1, int s2) {
        int okek = 0;
        if (s1 == 0 || s2 == 0) {  // sayılardan herhangi birinin 0 olması durumunu sorgulattım.
            System.out.println(" Sıfır sayısının OKEK'i olmaz");
        } else {
            for (int i = 1; i >= 1; i++) {
                if (i % s1 == 0 && i % s2 == 0) { // döngüde devamlı değeri artan i değerini; hem s1'e hemde s2'ye böldüğümüzde aynı anda kalanı 0 ise, o i değeri OKEK olur.
                    okek = i;  // bulduğum OKEK değerini okek değişkenine atadım.
                    i = -1;  // döngüyü kırmak için i'ye -1 değerini atadım.
                }
            }
        }
        return okek;  // bulduğum OKEK değerini geri gönderdim.
    }
}
