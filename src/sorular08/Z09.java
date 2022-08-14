package sorular08;

import java.util.Scanner;

public class Z09 {

    public static void main(String[] args) {
        // Girilen bir sayiya kadar olan ugly numberlari bulan programi yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir pozitif sayi giriniz : ");
        int sayi = scan.nextInt();
        int temp1 = 0;
        System.out.print("cirkin sayilar : 1 ");
        for (int j = 2; j <= sayi; j++) {
            temp1 = j;
            for (int i = 2; i <= j; i++) {
                if ((temp1 % 2) == 0) {
                    temp1 /= 2;
                } else if ((temp1 % 3) == 0) {
                    temp1 /= 3;
                }
                if ((temp1 % 5) == 0) {
                    temp1 /= 5;
                }
                if (temp1 == 1) break;
            }
            if (temp1 == 1) {
                System.out.print(j + " ");
            }
        }
    }
}
