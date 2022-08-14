package sorular08;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z08 {

    public static void main(String[] args) {
        /*
        1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
        2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
        3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
        Örneğin;
        ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"
         */

        String str="I am only human after all";
        String cikarilacakStr="only";

        cumledenKelimeCikar(str, cikarilacakStr);
        System.out.println(cumledenKelimeCikar(str, cikarilacakStr));
    }

    private static String cumledenKelimeCikar(String str, String cikarilacakStr) {

        String[] arr1=str.split(" ");
        List<String> strList=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            strList.add(arr1[i]);
        }

        strList.remove(strList.indexOf(cikarilacakStr));
        String yeniStr="";

        for (int i = 0; i <strList.size() ; i++) {
            yeniStr+=strList.get(i)+" ";
        }

        return yeniStr;

    }
}