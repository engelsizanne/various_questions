package sorular12;

import java.util.ArrayList;
import java.util.List;

public class P04 {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(4);
        sayilar.add(2);
        sayilar.add(1);
        System.out.println("sayilar = " + sayilar);

        List<String> kelimeler = new ArrayList<>();
        kelimeler.add("Masa");
        kelimeler.add("Sandalye");
        kelimeler.add("Koltuk");
        System.out.println("kelimeler = " + kelimeler);

        System.out.println("*** get ***");
        System.out.println("sayilar.get(2) = " + sayilar.get(2));
        System.out.println("kelimeler.get(1) = " + kelimeler.get(1));

        System.out.println("*** set ***");
        kelimeler.set(1, "Koltuk Takimi");
        System.out.println("kelimeler = " + kelimeler);
        sayilar.set(1,9);
        System.out.println("sayilar = " + sayilar);

        System.out.println("*** size ***");
        System.out.println(sayilar.size());
        System.out.println(kelimeler.size());
        // length ---> size

    }
}
