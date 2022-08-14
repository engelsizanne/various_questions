package sorular08;

import java.util.Scanner;

public class Z04 {
    public static void main(String[] args) {
        //   Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

        //   Input :

        //   30 and 40

        //   Expected OutPut:

        //   GCD for 30 and 40 = 10

        //   LCM for 30 and 40 = 120

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter number1:");
        int number1 = scan.nextInt();
        System.out.print("please enter number2:");
        int number2 = scan.nextInt();
        int ebob=0;
        int ekok=0;
        for (int i = 1; i <=number1*number2; i++) {
            if (number1%i==0&&number2%i==0){
                ebob =i;

            }
            for (int j =number1*number2; j>0; j--) {
                if(number1*number2%j==0 && j%number1==0 && j%number2==0){
                    ekok=j;
                }
            }
        }System.out.println("en buyuk ortak boleni "+ebob);
        System.out.println("en kucuk ortak kati "+ekok);
    }
}
