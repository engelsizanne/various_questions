package sorular08;

public class Z07 {

    /*
        İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
        2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
        3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
        Örneğin;
        ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
        ("merhaba dünya", "dünya") ➞ "merhaba"
     */

    public static void main(String[] args) {
        String str1="bugün hava çok güzel";
        String str2="çok ";

        String sonCumle=cumledenCikar(str1,str2);
        System.out.println(str1 + "den " + str2 + " kelimesini cikar");
        System.out.println("sonCumle = " + sonCumle);

    }

    public static String cumledenCikar(String str1, String str2) {

        str1 = str1.replaceAll(str2, "");

        return str1;
    }
}
