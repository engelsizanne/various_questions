package sorular4;

import java.util.Arrays;
import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        /*
        Verilen bir array'den istenen degere esit olan elemanlari kaldırıp,
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz.
         */

        int [] arr={1,2,5,4,9,3,3,8};
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaldırmak İstediginiz degeri girin:");
        int deger=scan.nextInt();
        int sayac=0;

        kalanLemanlar(deger,sayac,arr);

    }

    public static void kalanLemanlar(int deger, int sayac, int[]arr) {
        for (int i = 0; i < arr.length ; i++) {
            if(deger==arr[i]){
                sayac++;
            }
        }
        System.out.println(sayac);

        int [] yeniArr=new int[arr.length-sayac];
        // System.out.println(Arrays.toString(yeniArr));// yeniArr'yi gormek icin eklendi

        int yeniArrIndex=0;

        for (int i = 0; i < arr.length ; i++) {
            if(deger!=arr[i]){
                yeniArr[yeniArrIndex]=arr[i];
                yeniArrIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
