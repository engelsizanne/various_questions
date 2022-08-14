package sorular12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class P08 {

    public static void main(String[] args) {

        /*soru-1
        Bir TreeSet ve HashSet'e random 100 sayi ekleyin
        islem surelerini kiyaslayin

        soru-2:ilk soruya 3. bir islem ekleyelim
        str'i Hashset olarak olusturup elemanlari
        ekleyelim ve sonra TreeSet'e cevirip yazdiralim
         */

        Set<Integer> hash=new HashSet<>();
        hash.add(16);
        hash.add(36);
        hash.add(55);
        hash.add(43);
        hash.add(47);
        System.out.println("HashSet olarak olusruturulan liste = " + hash);
        //HashSet olarak olusruturulan liste = [16, 36, 55, 43, 47]

        Set<Integer>tree=new TreeSet<>();

        for (Integer each:hash )
        {
            tree.add(each);

        }        System.out.println("HashSet'i TreeSet'e ekledikten sonra TreeSet liste = " + tree);
        //HashSet'i TreeSet'e ekledikten sonra TreeSet liste = [16, 36, 43, 47, 55]
    }
}