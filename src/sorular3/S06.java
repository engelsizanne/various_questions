package sorular3;

import java.util.Arrays;

public class S06 {
    // SORU 3 : 5.000'e kadar 9 ve 11 e tam bölünebilen sayıları
    // ve bu sayıların toplam kaç tane olduklarını yazdırın

    public static void main(String[] args) {

        int sayac = 0;
        for (int i = 1; i <= 5000; i++) {

            if (i % 9 == 0 && i % 11 == 0) {
                System.out.print(i + " ");
                sayac++;
            }

        } // döngü sonu
        System.out.println("");
        System.out.println("9 ve 11 e bölünebilen sayılar :" + sayac + " adettir");

        int dizi[] = new int[sayac];
        sayac=0;
        for (int i = 99; i <= 5000; i+=99) {
            if (i % 99 == 0) {
                dizi[sayac]=i;
                sayac++;
            }
        } // döngü sonu
        System.out.println(Arrays.toString(dizi));

    }


}