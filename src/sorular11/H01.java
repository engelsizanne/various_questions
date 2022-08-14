package sorular11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class H01 {
    public static void main(String[] args) {

        /*
        bir listedeki ilk n elemani iterator kullanarak 5 artirin.
        orn: list: [2,13,56,23,45,14,40]
        artirilmasi istenen eleman sayisi : 3
        output : [7,18,61,23,45,14,40]
         */

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);
        System.out.println(" listemizin ilk hali : " + list);
        int artirilmasiIstenenElemanSayisi = 3;
        artirilmasiIstenenElemanSayisi--;
        int sayac = 0;
        ListIterator it = list.listIterator();

        while (it.hasNext()) {
            Integer sayi = (Integer) it.next();
            sayi += 3;
            list.set(sayac,sayi);
            sayac++;
            if (sayac == artirilmasiIstenenElemanSayisi) {
                break;
            }
        }
        System.out.println("List'in son hali : "+list);

    }
}
