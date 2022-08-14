package sorular2;

public class soru02 {
    /*
    I
    Is
    ISt
    Ista
    Istan
    Istanb
    Istanbu
    Istanbul

     */

    public static void main(String[] args) {


        String input = "Barbunya";

        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));
            }
            System.out.println("");
        }
        for (int i = input.length() - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));
            }
            System.out.println("");
        }

    }
}