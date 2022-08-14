package sorular7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        //kullanici Q'ya basincaya kadar girecegi isimleri alarak bir liste olusturup,
        // bu isimleri bir list
        // olarak bize donduren bir method olusturun

        List<String> isimlerListesi=new ArrayList<>();

        isimlerListesi =isimListesiOlustur(isimlerListesi);

        System.out.println(isimlerListesi);

    }
    private static List<String> isimListesiOlustur(List<String> isimlerListesi) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Liste olusturmak icin entera basarak isim giriniz, cikmak icin 'Q' basiniz");
        String girilenIsim = "";

        int sayac = 0;
        do {
            girilenIsim = scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")) {
                isimlerListesi.add(girilenIsim);
            }
            sayac++;
        } while (!girilenIsim.equalsIgnoreCase("q"));

        return isimlerListesi;
    }
}
