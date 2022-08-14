package sorular10;

import java.util.Scanner;

public class D07 {
    /*
            Ebay Interview Questions
   Get a String and a character from user
   Count the number of characters between the first occurence and the last occurence of the given character in the String
   Do not count the space characters
   If the character which user selected is displayed just once in the String return -1
   If the character which user selected does not exist in the String return -1
   For example; "Java is easy" - 'a' ==> 5
                "Java is easy" - 'w' ==> -1
                "Java is easy" - 'e' ==> -1
 */


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String str = scan.nextLine().replaceAll("\\s", "");
        System.out.println(str);
        String tekrarlliHarfler = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.lastIndexOf(str.charAt(i)) != str.indexOf(str.charAt(i))) {
                if (!tekrarlliHarfler.contains(str.substring(i, i + 1))) {
                    tekrarlliHarfler += str.substring(i, i + 1);
                    System.out.println(str.charAt(i) + "==>" + (str.lastIndexOf(str.charAt(i)) - str.indexOf(str.charAt(i)) - 1));
                }
            } else {
                System.out.println(str.charAt(i) + "==>" + "-1");
            }
        }
    }
}