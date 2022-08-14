package sorular5;

import java.util.Arrays;

public class S06 {
    public static void main(String[] args) {
        String[] sinifList = {"ali", "veli", "ayse", "fatma"};
        String silinecekIsim = "veli";

        sinifList = elemanSil(sinifList, silinecekIsim);
        System.out.println(Arrays.asList(sinifList));
    }

    public static String[] elemanSil(String[] sinifList, String silinecekIsim) {
        String s = "";
        for (int i = 0; i < sinifList.length; i++) {
            if (sinifList[i] != silinecekIsim) {
                s += sinifList[i] + " ";
            }
        }
        String[] yeniSinifList = s.split(" ");
        return yeniSinifList;
    }
}