package sorular09;

import java.util.Arrays;

public class M04 {


/*
1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

 ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

 */

    public class ArrayEksikSayi {
        /*1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

             ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
              ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
               ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10
             */
        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 9};
            int[] arr1 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
            int[] arr2 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
            int[] arr3 = {7, 5, 10, 2, 4, 6, 8, 3, 9};

            System.out.println(missingNumber(arr));
            System.out.println(missingNumber(arr1));
            System.out.println(missingNumber(arr2));
            System.out.println(missingNumber(arr3));

        }

        public static int missingNumber(int[] arr) {
            int missingNumber = 0;
            Arrays.sort(arr);
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[arr.length - 1] == 9) {
                    missingNumber = 10;
                } else if (arr[0] == 2) {
                    missingNumber = 1;
                } else if ((arr[i] - arr[i - 1]) > 1) {
                    missingNumber = arr[i] - 1;
                }
            }
            return missingNumber;
        }
    }
}

/*
        //Dizide sayılar tam olsaydı; toplamları 1+2+3+4+5+6+7+8+9+10 = 55 olmalı idi.
        //Verilen eksik elemanlı dizideki tüm elemanları toplayıp;
        //55 ten çıkartırsak eksik olan elemanı verir.


public static void main(String[] args) {

        int dizi1[] = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int dizi2[] = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int dizi3[] = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi1)); // 4
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi2)); // 6
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi3)); // 10
    }
   public static int eksikbul(int[] dizi) {
        int top = 0;
        for (int i = 0; i < dizi.length; i++) {
            top += dizi[i];
        }
        return 55 - top;
    }
 */

/*
    1 den 10 a kadar sayılar oluşan dizide eksik olan
    sayıyı döndüren metodu oluşturunuz.
     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

public static void main(String[] args) {

    int[] input = {7, 5, 1, 2, 4, 6, 8, 3, 9};
    arrayIcindeEksikElementiBulma(input);
}
    public static int[] arrayIcindeEksikElementiBulma( int[] input) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(input);
        int [] eksikEleman=new int[1];
        for (int i = 0; i <arr.length ; i++) {
            if (Arrays.binarySearch(input, arr[i])<0) {
                eksikEleman[0]=arr[i];
            }
        }
        System.out.println(Arrays.toString(eksikEleman));
        return eksikEleman;
    }
}
 */
