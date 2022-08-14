package sorular;

import java.util.Scanner;

public class C03_ {


    public static void main(String[] args) {


        //  Bir String içinde kaç kelime olduğunu yazdıran bir method yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str = scan.nextLine();
        kacKelime(str);

    }
    public static void kacKelime(String str) {
        str = str.replaceAll("\\s", "*" );
        int bosluk = 0;
        for (int i = 0; i <= str.length()-1 ; i++) {
            if(str.charAt(i)=='*') {
                bosluk++;
            }
        }
        System.out.println("kelime sayisi : " + (bosluk+1));
    }
}