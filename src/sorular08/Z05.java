package sorular08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z05 {
    public static void main(String[] args) {


    /* Problem tanımı:
        Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
        String parametreli return type li reverseWord isminde bir method yazınız
         Test DAta :
        İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
        Output : versin açıklığı zihin arkadaşlara Javacı Allah
         */
    String input = "Allah Javacı arkadaşlara zihin açıklığı versin";
        System.out.println(reverseWord(input));
}
    public static List<String> reverseWord(String input) {
        String[] normalInput= input.split(" ");
        System.out.print(Arrays.toString(normalInput));
        List<String> a=new ArrayList<>();
        for(int i= normalInput.length-1;i>=0;i--){
            a.add(normalInput[i]);
        }
        return a;
    }
}
