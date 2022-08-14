package sorular08;

import java.util.Arrays;
import java.util.Scanner;

public class Z03 {
    public static void main(String[] args) {
        /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("kac elemanlı array olsun");
        int uzunluk= scanner.nextInt();
        int[] olusanarr=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            olusanarr[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(olusanarr));
        farkıbul(olusanarr);

    }

    private static void farkıbul(int[] olusanarr) {
        Arrays.sort(olusanarr);
        System.out.println("fark= "+(olusanarr[olusanarr.length-1]-olusanarr[0]));

    }
}