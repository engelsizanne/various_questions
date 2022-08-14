package sorular;

import java.util.Scanner;

public class C02_for {
    // Girilen bir rakamin carpim tablosunu olusturan programı yaziniz
    public class kullanicininGirdigiSayininCarpimTablosu {
        public void main(String[] args) {
            System.out.println("Lutfen Carpim tablosu olusturulacak sayiyi giriniz");

            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            new kullanicininGirdigiSayininCarpimTablosu().carpimTablosu(number);

            scan.close();
        }

        public void carpimTablosu(int number) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}
