package sorular6;

import java.util.Arrays;

public class W06 {

    /*
    Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip, kalan elementleri
yeni bir array yapin
     */

    public static void main(String[] args) {
        String[] verilenArr={"ali","erik","karpuz","kiraz"};
        String istenmeyenHarf="a";
        int count=0;
        for (int i = 0; i <verilenArr.length ; i++) {
            if (verilenArr[i].contains(istenmeyenHarf)){
                count++;
            }
        }
        int arrDegeri=0;
        String[] yeniArr=new String[verilenArr.length-count];
        for (int i = 0; i <verilenArr.length ; i++) {
            if (!verilenArr[i].contains(istenmeyenHarf)){
                yeniArr[arrDegeri]=verilenArr[i];
                arrDegeri++;
            }
        }
        System.out.println("Verilen Array : "+Arrays.toString(verilenArr));
        System.out.println("istenmeyenHarf = " + istenmeyenHarf);
        System.out.println("Yeni Array : " + Arrays.toString(yeniArr));
    }
}