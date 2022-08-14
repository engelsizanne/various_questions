package sorular5;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz: ");
        String ad = scan.nextLine();
        int ara = ad.indexOf(" ");


        if (ad.contains(" ")) {

            ad = ad.substring(0, 1).toUpperCase() + ad.substring(1,ara).toLowerCase() +
                    ad.substring(ara,ara+2).toUpperCase() + ad.substring(ara+2).toLowerCase();


        } else {
            ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();

        }


        System.out.println(ara);
        System.out.println(ad);
    }
}
