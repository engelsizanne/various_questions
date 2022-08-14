package sorular08;

public class Z02 {
    public static void main(String[] args) {
    //   Write a method which accepts a String as parameter
    //   and prints the sum of the digits, present in the given string.
    //   input : ade1r4d3
    //   output : 8

        String sayi = "34m334";
        sayilariTopla(sayi);

    }

    public static void sayilariTopla(String sayi) {
        int toplam = 0;
        toplam += Integer.parseInt(sayi.replaceAll("\\D", ""));

        int total = 0;
        while (toplam > 0) {

            total += toplam % 10;
            toplam /= 10;

        }
        System.out.println("String icindeki sayilar toplami :" + total);
    }
}