package sorular7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A06 {
    //kullanici Q'ya basincaya kadar girecegi isimleri alarak bir liste olusturup,bu isimleri bir list
    //olarak bize donduren bir method olusturun

    public static void main(String[] args) {


    List<String> isimListesi = listOlusturma();
        System.out.println("isimListesi = "+isimListesi);
}

    public static List<String> listOlusturma() {
        Scanner scanner = new Scanner(System.in);

        String liste = "";
        List<String> list = new ArrayList<>();

        boolean ciksinMi = false;

        while (!ciksinMi) {

            if (!liste.equalsIgnoreCase("Q")) {

                System.out.println("lutfen listeye isim giriniz");
                liste = scanner.nextLine();
                if (!liste.equalsIgnoreCase("Q")) {
                    list.add(liste);
                }


            } else {
                System.out.println("ekleme iptal edildi");
                ciksinMi = true;

            }
        }
        return list;
    }
}