package sorular11;

import java.util.Arrays;

public class H09 { public static void main(String[] args) {
        /*
            Verilen String bir dizideki elemanları karakter uzunluğuna göre büyükten küçüğe doğru sıralayın.
            input : String sehirler[] = {"Trabzon", "Ankara", "Mus", "Agri", "Hatay", "Canakkale", "Istanbul", "Van", "Sanliurfa", "Rize", "Izmir"};
            output: [Canakkale, Sanliurfa, Istanbul, Trabzon, Ankara, Hatay, Izmir, Rize, Agri, Van, Mus]
         */
    String sehirler[] = {"Trabzon", "Ankara", "Mus", "Agri", "Hatay", "Canakkale", "Istanbul", "Van", "Sanliurfa", "Rize", "Izmir"};
    System.out.println(Arrays.toString(sehirler));
    for (int i = 0; i < sehirler.length - 1; i++) {
        for (int j = i; j < sehirler.length; j++) {
            if (sehirler[i].length() < sehirler[j].length()) {
                sehirler = swapStringArray(sehirler, i, j);
            }
        }
    }
    System.out.println(Arrays.toString(sehirler));
}
    public static String[] swapStringArray(String[] sehirler, int i, int j) {
        String temp = sehirler[i];
        sehirler[i] = sehirler[j];
        sehirler[j] = temp;
        return sehirler;
    }
}