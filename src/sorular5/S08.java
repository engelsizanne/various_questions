package sorular5;

import java.util.Arrays;

public class S08 {

    /*
    Array sort işlemini herhangi bir metod kullanmadan büyükten küçüğe yapıyor.
      > <   işaretlerini değiştirirsek tersini yapıyor.
     */

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 9, 3, 2, 8, 11, 0};
        int sayi = 0;
        int temp = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sayi = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i] ;
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}