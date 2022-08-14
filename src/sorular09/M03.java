package sorular09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M03 {public static void main(String[] args) {

    //  Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

    //  input :

    //  Learning java is easy

    //  output:

    //  maximum occurring character is : a

    String input="Learning java is easy";
    input=input.replaceAll("\\s","");

    String[]arr=input.split("");
    Arrays.sort(arr);

    List<String> liste=new ArrayList<>();
    int sayac=0;
    int max=0;
    String maxArr=arr[0];
    for (int i = 0; i < arr.length-1 ; i++) {
        if(arr[i].equals(arr[i+1])&&!liste.contains(arr[i])){

            liste.add(++sayac+arr[i] );

            if (sayac>max){
                max=sayac;
                maxArr=arr[i];
            }
        }

              else {
            sayac=0;

        }
    } System.out.println("En fazla Harf :"+maxArr);
    System.out.println("Harf sayisi :"+(++max));
}
}
