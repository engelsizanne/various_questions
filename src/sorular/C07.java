package sorular;

public class C07 {
    public static void main(String[] args) {


    /*
    Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
    Input :
    String str="Javaisalsoeasy"
    Output: a s
         */
        String str = "merhabalar";

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {


                    System.out.print(str.charAt(i) + " ");
                }
            }
        }
    }
}