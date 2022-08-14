package sorular10;

import java.util.ArrayList;
import java.util.List;

public class D01 {

    /* Ebay Interview Question
         Put all zeros to end in an integer array
         {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
         {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0*/
    public static void main(String[] args) {

        int[] sayilar = {3, 0, 4, 2, 0,8,0,5};
        List<Integer> sayi = new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] != 0) {
                sayi.add(sayilar[i]);
            }
        }
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == 0) {
                sayi.add(sayilar[i]);
            }
        }
        System.out.println(sayi);
    }
}