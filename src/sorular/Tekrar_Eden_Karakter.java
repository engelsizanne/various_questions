package sorular;

import java.util.Scanner;

public class Tekrar_Eden_Karakter {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */
//&&
        String cumle = "javakisajlsoekasyj";
        System.out.println("Bu Metinde Tekrarlanan Karakterler :" + (tekrarbul(cumle)));
    }

    public static String tekrarbul(String cumle) {
        String bulunan = "";
        for (int i = 0; i < cumle.length(); ++i) { // i=2 iken h1 = r
            String h1 = cumle.substring(i, i + 1);
            for (int j = i + 1; j < cumle.length(); j++) {  // iç döngüyü 1 karakter sonrasından başlasın diye j=i+1 yaptım.
                String h2 = cumle.substring(j, j + 1); // j=10  h2 =r
                if (h2.equals(h1) && !bulunan.contains(h2)) {     // h1 ve h2 aynı karakter ise ve bulunan diye tanımladığımız string içinde yok ise ekletmek için.
                    // contains kullanmaz isek aynı karakterden 3 adet var ise stringe üçünüde ekliyor.
                    bulunan = bulunan + "  " + h2;                  // bulunan string değişkenine  bulduğu karakteri ekliyor.
                }
            }
        }
        return bulunan;
    }
}
