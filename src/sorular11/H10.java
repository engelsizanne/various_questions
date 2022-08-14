package sorular11;

import java.util.*;

public class H10 {

    static List<String> methodlar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int tahminindex = 0;

        methodlar = listeSecimi();

        if (methodlar.size() != 0) {
            System.out.println(methodlar);  // Sonra bu satiri silebilirsiniz
            System.out.print(methodlar.size() + " tane metodtan birinin sayisini giriniz :");

            try {
                tahminindex = scan.nextInt() - 1; // method sayisi ile index sayisi arasindaki fark icin -1 kullandik
            } catch (Exception e) {
                tahminindex = -1;
            }
            scan.nextLine();
            if (tahminindex > -1 && tahminindex < methodlar.size()) {
                methodTahminOyunu(tahminindex);
            }
        } else {
            System.out.println("Iyi Gunler!");
        }
    }

    public static void methodTahminOyunu(int tahminindex) {

        String blankWords = "";

        String methodAdi = methodlar.get(tahminindex);

        int methodUzunlugu = methodAdi.length();

        System.out.println(methodAdi); // DAHA Sonra yorum satirina aliniz

        blankWords = methodAdi.replaceAll("\\S", "_");

        System.out.println("\n" + blankWords);

        System.out.println("Metodun harf sayisi : " + methodUzunlugu);

        System.out.println("Tahmin sayiniz : " + (methodUzunlugu * 2));

        String tahmin = "";
        int control = 0;

        for (int i = 0; i < methodUzunlugu * 2; i++) {
            System.out.print((i + 1) + ". tahmininiz icin harf giriniz : ");
            try {
                tahmin = scan.nextLine().substring(0, 1);
            } catch (Exception e) {
                tahmin = " ";
            }
            for (int j = 0; j < methodAdi.length(); j++) {
                if (methodAdi.contains(tahmin)) {     // Aradigimiz harfin icinde olup olmadigini konrol ettik
                    System.out.println("Dogru");
                    blankWords = blankWordsHarfYerlestir(methodAdi, blankWords, tahmin);
                    break;
                } else {
                    System.out.println("Yanlis");
                    break;
                }
            }
            System.out.println(blankWords);
            if (!blankWords.contains("_")) break;

            if ((methodUzunlugu * 2 - i - 1) == 0) {
                System.out.println("Method adi : " + methodlar.get(tahminindex) + " olacakti");
                break;
            }
            System.out.println((methodUzunlugu * 2 - i - 1) + " tahmininiz kaldi");
        }
    }

    private static String blankWordsHarfYerlestir(String methodAdi, String blankWords, String tahmin) {
        String str = "";
        for (int i = 0; i < methodAdi.length(); i++) {
            if (methodAdi.substring(i, i + 1).equals(tahmin)) {
                str += methodAdi.substring(i, i + 1);
            } else {
                str += blankWords.substring(i, i + 1);
            }
        }
        return str;
    }

    private static List<String> listeSecimi() {
        List<String> liste = new ArrayList<>();
        int sec = 0;
        System.out.println("1 - String Methodlari");
        System.out.println("2 - String Builder Methodlari");
        System.out.println("3 - ArrayList Methodlari");
        System.out.println("4 - LinkedList Methodlari");
        System.out.println("5 - Queue Methodlari");
        System.out.println("6 - Math Methodlari");
        System.out.print("Seciminiz : ");

        try {
            sec = scan.nextInt();
        } catch (Exception e) {
            sec = 10;
        }
        switch (sec) {
            case 1:
                liste.add("compareTo()");
                liste.add("toUpperCase()");
                liste.add("toLowerCase()");
                liste.add("equalsIgnoreCase()");
                liste.add("concat()");
                liste.add("contains()");
                liste.add("substring()");
                liste.add("indexOf()");
                liste.add("length()");
                liste.add("equals()");
                liste.add("charAt()");
                liste.add("endsWith()");
                break;
            case 2:
                liste.add("append()");
                liste.add("compareTo()");
                liste.add("delete()");
                liste.add("deleteCharAt()");
                liste.add("indexOf()");
                liste.add("insert()");
                liste.add("reverse()");
                liste.add("toString()");
                liste.add("deleteCharAt()");
                liste.add("replace()");
                liste.add("lastIndexOf()");
                liste.add("indexOf()");
                break;
            case 3:
                liste.add("get()");
                liste.add("size()");
                liste.add("set()");
                liste.add("add()");
                liste.add("addAll()");
                liste.add("equals()");
                liste.add("clear()");
                liste.add("contains()");
                liste.add("indexOf()");
                liste.add("isEmpty()");
                liste.add("lastIndexOf()");
                liste.add("remove()");
                break;
            case 4:
                liste.add("element()");
                liste.add("get()");
                liste.add("add()");
                liste.add("addAll()");
                liste.add("addFirst()");
                liste.add("addLast()");
                liste.add("clear()");
                liste.add("clone()");
                liste.add("contains()");
                liste.add("offer()");
                liste.add("size()");
                liste.add("poll()");
                liste.add("peek()");
                liste.add("pop()");
                liste.add("push()");
                liste.add("set()");
                break;
            case 5:
                liste.add("element()");
                liste.add("add()");
                liste.add("remove()");
                liste.add("offer()");
                liste.add("peek()");
                liste.add("addAll()");
                break;
            case 6:
                liste.add("Math.abs()");
                liste.add("Math.exp()");
                liste.add("Math.round()");
                liste.add("Math.floor()");
                liste.add("Math.max()");
                liste.add("Math.min()");
                liste.add("Math.pow()");
                liste.add("Math.random()");
                liste.add("Math.sin()");
                liste.add("Math.cos()");
                break;
            default:
                System.out.println("Lutfen 1 - 6 arasi tamsayi giriniz");
                break;
        }
        return liste;
    }
}