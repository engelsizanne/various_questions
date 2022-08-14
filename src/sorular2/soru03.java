package sorular2;

public class soru03 {
    public static void main(String[] args) {

    /*
                   A
                   An
                   Ank
                   Anka
                   Ankar
                   Ankara
                   Ankar
                   Anka
                   Ank
                   An
                   A
       */
        String input = "Ankara";
        for (int i = 0; i <= input.length(); i++) {
            System.out.println(input.substring(0, i));
        }
        for (int i = input.length(); i > 0; i--) {
            System.out.println(input.substring(0, i - 1));
        }
    }
}