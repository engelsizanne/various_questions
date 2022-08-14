package sorular12;

import java.util.ArrayList;
import java.util.List;

public class P03 {

    //add
    //addAll
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(4);
        sayilar.add(2);
        sayilar.add(1);
        System.out.println("sayilar = " + sayilar);
        sayilar.add(1,9);
        System.out.println("sayilar = " + sayilar);

        System.out.println("***************");
        List<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(5);
        sayilar2.add(7);
        sayilar2.add(9);

        System.out.println("sayilar2 = " + sayilar2);

        sayilar.addAll(sayilar2);
        System.out.println("sayilar = " + sayilar);

    }
}
