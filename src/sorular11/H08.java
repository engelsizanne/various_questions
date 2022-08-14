package sorular11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class H08 {

    public static List<String> methodlar = new ArrayList<>(Arrays.asList("add()", "random()", "get()", "remove()",
            "sort()", "set()", "subList()", "isEmpty()", "valueOf()", "parseOf()", "subString()", "setCharAt()",
            "replaceAll()", "contains()", "equalsIgnoreCase()"));

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("metot secimi icin 1 ile " + methodlar.size() + " araliginda bir index girin");
        int index = scan.nextInt();
        methodGetir(methodlar, index);
    }

    public static void methodGetir(List<String> methodlar, int index) {
        String arananMetot = methodlar.get(index - 1).toLowerCase();
        StringBuilder sbMetot = new StringBuilder(arananMetot.replaceAll("\\w", "*"));
        int tahminHakki = (arananMetot.length() - 2) * 2;
        char harf = ' ';
        int sayac = 0;

        while (sayac < tahminHakki && !sbMetot.toString().equals(arananMetot)) {
            System.out.println("\n" + sbMetot);
            System.out.println("tahmin hakkin: " + (tahminHakki - sayac));
            System.out.println("bir harf gir");
            harf = scan.next().toLowerCase().charAt(0);
            if (!arananMetot.toLowerCase().contains(harf + "")) sayac++;//yanlıs harf girdikce tahmin hakkı azalacak

            for (int i = 0; i < arananMetot.length() - 2; i++) {
                if ((arananMetot.toLowerCase().charAt(i)) == harf) {
                    sbMetot.setCharAt(i, harf);//sbuilder olmazsa harfi ilgili indexe set edemiyoruz
                }
                if (sbMetot.toString().equals(arananMetot)) {//sb ile str nin eşitliğini ancak bu sekilde kontrol edebiliyoruz
                    System.out.println("\ntebrikler");
                    System.out.println("tahmin ettigin metot " + sbMetot +
                            "\nyanlis tahmin sayin: " + sayac);
                    break;//tahmin hakki bitmeden bulursa kontrolu
                }
            }
        }

        if (!sbMetot.toString().equals(arananMetot)) {
            System.out.println("\n" + sayac + " yanlis tahminle tahmin hakkini bitirdin " + "\naradigin metot " + arananMetot + " metoduydu" +
                    "\nuzulme simdi tekrar oyna eminim bu sefer bileceksin");
        }
    }
}