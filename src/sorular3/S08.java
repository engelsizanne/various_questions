package sorular3;

public class S08 {
    /*
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */

    public static void main(String[] args) {
        int input = 7;

        for (int i = 1; i <= input; i++) {
            for (int j = input - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = input - 1; i >= 1; i--) {
            for (int j = input - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
