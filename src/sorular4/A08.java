package sorular4;

import java.util.Arrays;
import java.util.Scanner;

public class A08 {

    public static void main(String[] args) {
// Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle = scan.nextLine();

        String[] kelimeSayısı = cümle.split("\\s");
        System.out.println(Arrays.toString(kelimeSayısı));

        int kelimeSayısınum = kelimeSayısı.length;
        System.out.println("kelimeSayısı = " + kelimeSayısınum);

    }
}



