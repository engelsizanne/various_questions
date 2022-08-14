package sorular2;

import java.util.Scanner;

public class soru10 {

   // Sesli_Sessiz_Harf
   public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf  girmesini isteyin. Girilen harf sesli ise sesli harf olduğunu,
        sessiz ise sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada 1 karakterden fazla ise
        hata mesajı göstersin. (test girilen harfi büyük yada küçük duyarlıdır)
        örnek: sesli harfler : a,e,ı,u,o
        w.x girdiğinde yanlış karakter girsin uyarısı versin
 */
       Scanner al = new Scanner(System.in);
       String sesliHarfler = "a,e,i,ü,ö,u,ı,o,A,E,İ,Ü,Ö,I,U,O";
       boolean kontrol = false;
       do {
           System.out.println("Bir Harf Girin: ");
           String harf = al.nextLine();
           if (harf.length() >= 2 || harf.charAt(0) < 'A' || harf.charAt(0) > 'z') {  // birden fazla karakter girmişse veya karakter harflerin dışında ise
               System.out.println("Hatalı Metin Girdiniz.");
           } else if (sesliHarfler.contains(harf)) {       // girilen harf; sesliHarfler kümesinin içinde var ise  == SESLİ HARFTİR
               System.out.println("Sesli Harf Girdiniz ");
               kontrol = true;
           } else {       // girilen harf; üsteki iki kontolden de geçmiş ve şartı sağlamamışsa demekki harf == SESSİZ HARFTİR
               System.out.println("Sessiz Harf Girdiniz ");
               kontrol = true;
           }
       } while (kontrol == false);
   }
}
