package sorular7;

import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {
        int binary1, binary2;
        Scanner in = new Scanner(System.in);
        binary1 = in.nextInt();
        binary2 = in.nextInt();
        System.out.println(decimalToBinary(binaryToDecimal(binary1) + binaryToDecimal(binary2)));
    }

    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int basamaklar = 0;
        int temp = decimal;
        int k = 1;
        do {
            basamaklar = (temp % 2);
            binary = binary + basamaklar * k;
            k *= 10;
            temp /= 2;
        } while (temp != 0);
        return binary;
    }

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int basamaklar = 0;
        int temp = binary;
        int b = 1;
        do {
            basamaklar = (temp % 10) * b;
            decimal += basamaklar;
            temp /= 10;
            b *= 2;
        } while (temp != 0);
        return decimal;
    }
}

/*

// Arrayla cozumu;

 public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
        binary1 = in.nextLong();
        binary2 = in.nextLong();

        long temp1 = binary1;
        long temp2 = binary2;
        int basamakDegeri1 = 0;
        int basamakDegeri2 = 0;
        for (i = sum.length - 1; i > 0; i--) {
            basamakDegeri1 = (int) temp1 % 10;
            basamakDegeri2 = (int) temp2 % 10;
            sum[i] = sum[i] + basamakDegeri1 + basamakDegeri2;
            switch (sum[i]) {
                case 0:
                    sum[i] = 0;
                    break;
                case 1:
                    sum[i] = 1;
                    break;
                case 2:
                    sum[i] = 0;
                    sum[i - 1] = 1;
                    break;
                case 3:
                    sum[i] = 1;
                    sum[i - 1] = 1;
                    break;
            }
            temp1 /= 10;
            temp2 /= 10;
        }
        System.out.println("Binary sayilarin toplami = " + Arrays.toString(sum));
        for (i = 0; i < sum.length; i++) {  // Arrayi sayiya çeviriyor çıktıda istenildiği gibi
            remainder *= 10;
            remainder += sum[i];
        }
        System.out.println("Binary sayilarin toplami = " + remainder);
    }
}
 */
