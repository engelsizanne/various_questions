package sorular5;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        /*
 Kullanicidan bir websitesi girmesini isteyin
kullanici eger basinda www. ve sonunda .com yoksa uyari verin
eger sitesinin isminde codestars kullanirsa tesekkur mesaji ilet
sitenin isminde bosluk varsa uyar
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz wes sitesi ismini giriniz: ");
        String web = scan.nextLine();

        if (web.startsWith("www.")&&web.endsWith(".com")){
            if (web.contains("codestars")&&  !web.contains(" ")){
                System.out.println("Tesekkur ederiz site isminiz olusturuludu");
            } else if (web.contains(" ")) {
                System.out.println("Site isminin arasinda bosluk koyamazsiniz");
            }
        }else {
            System.out.println("Site isminiz gecerli degil");
        }





    }
}
