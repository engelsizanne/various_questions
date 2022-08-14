package sorular08;

import java.util.Scanner;

public class Z10 {

    /*Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
    (Check credit card number, if there aren't 16 digit print "Invalid credit card number"

    Input :

    John White 1234234534561478

    Output :

    Name : J*** W****

    CCN : **** **** **** 1478

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please Input Name : ");
        String name = scan.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).replaceAll("\\w", "*");
        System.out.println("Please Input Surname : ");
        String surname = scan.nextLine();
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1, surname.length()).replaceAll("\\w", "*");
        String cardNo = "";


        for (int i = 1; i <= 2; i++) {
            System.out.println("Please Input Card Nummer (16 digits) : ");
            cardNo = scan.nextLine(); //  "1234234534561478";
            if (cardNo.length() == 16) {
                cardNo = cardNo.substring(0, 4).replaceAll("\\d", "*") + " " +
                        cardNo.substring(4, 8).replaceAll("\\d", "*") + " " +
                        cardNo.substring(8, 12).replaceAll("\\d", "*") + " " +
                        cardNo.substring(12, 16);
                i++;
            } else {
                System.out.println("The Card Nummer is not 16 digits ");
                i--;
            }
        }
        System.out.println("Name :" + name + " " + surname);
        System.out.println("CCN  :" + cardNo);


    }

}