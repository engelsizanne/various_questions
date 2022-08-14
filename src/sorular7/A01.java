package sorular7;

import java.util.Arrays;
import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {

        /*
        Bir String değişkeni cümlesi verildiğinde,
        her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

        Test Data:
        sentence -> "Java is fun"
        reversed **-> "**fun is Java**"**
         */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";

        String[] arr = sentence.split(" ");
        String[] arr2 = sentence.split(" ");


        System.out.println(Arrays.toString(arr)); //[Java, is, fun]

        for (int i = 0; i < 1; i++) {
            for (int j = arr2.length - 1; j > arr2.length - 2; j--) {
                arr[i] = arr2[j];
                break;
            }
        }
        System.out.println(Arrays.toString(arr)); // [fun, is, fun]

        for (int i = arr.length - 1; i > arr.length - 2; i--) {
            for (int j = 0; j < 1; j++) {
                arr[i] = arr2[j];
                break;
            }
        }
        System.out.println(Arrays.toString(arr)); // [fun, is, Java]

        for (int i = 0; i <= arr.length - 1; i++) {
            reversed += arr[i] + " ";
        }
        reversed = "**" + reversed.trim() + "**";
        System.out.println(reversed); // **fun is Java**

    }
}