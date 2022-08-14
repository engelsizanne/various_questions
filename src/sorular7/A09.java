package sorular7;

import java.util.Scanner;

public class A09 {
    public static void main(String[] args) {
        /*
         * Kullanıcının girdiği integer sayıyı tersten yazdıran kod bloğu yazınız.123==>321 yada 1045==>5401 gibi.*/

        Scanner scanner = new Scanner(System .in );
        System.out.println("Please enter the number to find its reverse");
        int number = scanner.nextInt();
        String tempNumber=String.valueOf(number);
        String reverse="";


        for (int i = tempNumber.length(); i >0 ; i--) {
            reverse+=tempNumber.substring(i-1,i) ;
        }
        System.out.println(Integer .valueOf(reverse));

    }
}
/*
public static void main(String[] args) {
  //  Kullanıcının girdiği integer sayıyı tersten yazdıran kod bloğu yazınız.123==>321 yada 1045==>5401 gibi
    Scanner scan= new Scanner(System.in);
    System.out.println("lutfen bir sayi giriniz");
    int sayi=scan.nextInt();

   String ters="";
   while (sayi>0)            {
       ters+=sayi%10;
       sayi/=10;
    }
   Integer tersSayi=Integer. valueOf(ters);
    System.out.println(tersSayi);
}
 */