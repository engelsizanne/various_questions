package sorular;

import java.util.Arrays;
import java.util.Collections;

public class C04_DizininTersiniAlma {


        static void reverse(Integer dizi[])
        {
            Collections.reverse(Arrays.asList(dizi));
            System.out.println("reverse method'u ile tersi : "+Arrays.asList(dizi));
        }
        public static void main(String[] args) {
            int dizi[] = {150, 0, 61, -36, 4};
            Integer []dizi2={-36, 0, 4, 61, 150};
            reverse(dizi2);
            Arrays.sort(dizi);
            System.out.println("dizinin sirali hali : "+Arrays.toString(dizi));
            int diziTers[]=new int[5];
            int j=5;
            for (int i = 0; i < dizi.length; i++) {
                diziTers[j-1]=dizi[i];
                j=j-1;
            }
            System.out.println("for loop ile tersi = " + Arrays.toString(diziTers));
        }
    }
