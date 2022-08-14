package sorular5;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        //kullanicidan bir cumle isteyin ve cumledeki Kelime Sayisini Yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle = scan.nextLine();

        String[] kelimeler = cumle.split(" ");
        int temp = kelimeler.length;
        System.out.println(temp);
    }
}