package sorular;

import java.util.Scanner;

public class C01_for {
    public static void main(String[] args) {
        // Kullanıcıdan bir tamsayı girmesini isteyen ve ardından sayıları ters çevrilmiş sayıyı veren bir
        // program yazın. Örneğin giriş 12345 ise çıkış 54321 olmalıdır.  (string’le ve string’siz yapın)

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        String str = String.valueOf(sayi);

        int tersSayi = 0;
        String tersStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.substring(i, i + 1);
        }
        System.out.println("String Manipulation ile sayiyi ters cevirdik :" + tersStr);

        int yedekSayi = sayi;

        for (int i = 0; i < 10; i++) {
            tersSayi = tersSayi * 10;
            tersSayi = tersSayi + yedekSayi % 10;
            yedekSayi = yedekSayi / 10;
            if (yedekSayi == 0) {
                i = 10;
            }
        }
        System.out.println("\nMatematiksel yol ile sayiyi ters cevirdik :" + tersSayi);
    }
}
