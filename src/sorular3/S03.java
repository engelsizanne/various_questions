package sorular3;

import java.util.Scanner;

public class S03 {
    /*Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
    Örnek Ekran Çıktısı
    birinci kenar: 12
    ikinci kenar: 5
    hipotenus: 13      */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kenar uzunlugu giriniz");
        double kenar1 = scan.nextDouble();
        System.out.println("Bir kenar uzunlugu giriniz");
        double kenar2 = scan.nextDouble();
        double x = kenar1;
        double y = kenar2;
        double hipotenus = (x * x) + (y * y);

        System.out.println("hipotenus=" + hipotenus);
    }
}