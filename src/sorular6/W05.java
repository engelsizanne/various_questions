package sorular6;

import java.util.Arrays;
import java.util.Scanner;

public class W05 {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle girin");
        String cumle = scanner.nextLine();
        String kelime[] = cumle.split(" ");
        int kelimeSayisi = 1;
        for (int i = 0; i <cumle.length() ; i++) {
            if(Arrays.toString(kelime).substring(i,i+1).contains(",")){
                kelimeSayisi++;
            }
        }
        System.out.println("kelimeSayisi = " + kelimeSayisi);
    }
}
