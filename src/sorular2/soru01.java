package sorular2;

public class soru01 {
    /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
        OUTPUT : 100 98 96 94 92 … … … … 2 0
         */
    public static void main(String[] args) {


        for (int i = 100; i > 0; i--) {
            if (i % 2 == 0 && i >= 92) {
                System.out.print(i + " ");
            }
            if (i % 2 == 0 && i < 92 && i > 2) {
                System.out.print("..." + " ");
            }
            if (i % 2 == 0 && i == 2) {
                System.out.println(i);
            }
        }
    }
}
