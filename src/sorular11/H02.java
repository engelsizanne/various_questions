package sorular11;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class H02 {
    /*Soru 5) (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
            Orn :  list : [2,13,56,23,45,14,40]
    artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]*/
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);
        ListIterator lt = list.listIterator();
        int sayac=1;
        while (lt.hasNext() && sayac<=3) {
            int temp=(Integer)lt.next()+5;
            lt.set(temp);
            sayac++;
        }
        System.out.println(list);
    }
}
