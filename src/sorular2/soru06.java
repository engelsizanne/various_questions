package sorular2;

public class soru06 {
    public static void main(String[] args) {


        String input = "istanbul";
        String alt = "";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j) + " ");
            }
            System.out.println("");
        }
        for (int j = 1; j <= input.length(); j++) {
            alt = input.substring(0, input.length() - j);
            for (int i = 0; i < alt.length(); i++) {
                System.out.print(alt.substring(i, i + 1) + " ");
            }
            System.out.println("");
        }
    }
}
