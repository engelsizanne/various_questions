package sorular6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W07 {
    public static void main(String[] args) {
        // Soru 2) Verilen bir array’deki unique elementleri yeni bir array olarak
        // döndüren bir method oluşturun
        int[] arr = {1, 2, 3, 5, 6, 4, 6, 2, 8, 9, 1, 6, 4, 5, 10, 1, 11, 10, 42};
        int[] newArr = new int[1];

        newArr = uniqueBul(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] uniqueBul(int[] arr) {
        List<Integer> listAsil = new ArrayList<>();
        List<Integer> listUnique = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            listAsil.add(arr[i]);
            if (!listUnique.contains(arr[i])) {
                listUnique.add(arr[i]);
            }
        }
        for (int i = 0; i < listAsil.size(); i++) {
            if (listAsil.indexOf(listAsil.get(i)) != listAsil.lastIndexOf(listAsil.get(i))) {
                listUnique.remove(listAsil.get(i));
            }
        }
        int[] newArr = new int[listUnique.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = listUnique.get(i);
        }
        return newArr;
    }
}


//2.yol

/*
 /*
    Soru 2) Verilen bir array deki unique elementleri yeni bir array olarak donduren bir
method olusturun
  //  ------
public static void main(String[] args) {
    int[] input={1,3,5,6,2,4,6,1,7,8,9,5,1,3}; // sonuc: 2,4,7,8,9
    yeniArr(input);
}
    private static void yeniArr(int[] input) {  // tekrar Eden: 1,3,5,6
        int count=0;
        int tekrarEtmeyen=0;
        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j <input.length ; j++) {
                if (input[i]==input[j]){
                    count++;
                }
            }
            if (count==1){
                tekrarEtmeyen++;
                count=0;
            } else {
                count=0;
            }
        }
        System.out.println("tekrarEtmeyen = " + tekrarEtmeyen);
        int [] yeniArr=new int[tekrarEtmeyen];
        int sayac=0;
        int arrDegeri=0;
        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j < input.length ; j++) {
                if (input[i]==input[j]){
                    sayac++;
                }
            }
            if (sayac==1){
                yeniArr[arrDegeri]=input[i];
                arrDegeri++;
                sayac=0;
            } else {
                sayac=0;
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
 */