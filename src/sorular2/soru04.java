package sorular2;

public class soru04 {
    /*
    S
    SE
    SEY
    SEYM
    SEYMA
    SEYM
    SEY
    SE
    S

     */
    public static void main(String[] args) {


        String input = "SEYMA";

        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j) + " ");//ilk harf için substring 0,1 olmalı
            }
            System.out.println("");

        }
        for (int i = 1; i <= input.length() - 1; i++) {
            for (int j = 1; j <= input.length() - i; j++) {
                System.out.print(input.substring(j - 1, j) + " ");//ilk harf için substring 0,1 olmalı
            }
            System.out.println("");

        }
    }
}
