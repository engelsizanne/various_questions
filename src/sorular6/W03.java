package sorular6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W03 {
    //noUrunler urunFiyat ve fiyat variableları class levelde tuttum her yerde kullanabilmek için
    static String[]  noUrunler={"00 Domates","01 Patates","02 Biber","03 Soğan","04 Havuç" ,
            "05 Elma","06 Muz","07 Çilek","08 Kavun","09 Kavun","10 Limon"};
    static String[] urunFiyat={"2.10 Tl","3.20 Tl","1.50 Tl","2.30 Tl","3.10 TL",
            "1.20 Tl","1.90 Tl","6.10 Tl","4.30 Tl","2.70 TL","0.50 Tl"};
    static double[] fiyat={2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50};
    public static void main(String[] args) {
        menu();
        Scanner scan= new Scanner(System.in);
        boolean devamEtmekIstıyormusunuz=false;
        int bitirme=0;
        double toplam=0;
        List<String> sepet=new ArrayList<>();
        List<String> urunler=new ArrayList<>();
        while(!devamEtmekIstıyormusunuz){
            System.out.println("Ürün no'suna göre listeden ürün seçiniz:");
            int urunNo= scan.nextInt();
            if(urunNo>10){
                System.out.println("Lütfen geçerli bir ürünNo giriniz");
                continue;//10dan büyük girdiği durumlarda uyarı verip
                //döngüyü baştan başlatıcak.
            }
            System.out.println("Seçtiginiz urun : " + urunler(urunNo));
            System.out.println("Kac kg satin almak istersiniz ?");
            int kg= scan.nextInt();
            toplam+=(kg*fiyat[urunNo]);
            //burada sepetteki ürünleri tutacağız
            for (int i = 0; i <noUrunler.length ; i++) {
                urunler.add(noUrunler[i]);//Arrayi listeye yazdırdı
            }
            sepet.add(urunler.get(urunNo));
            //
            System.out.println("Eğer bitirmek istiyorsanız 99 devam etmek için 1 tuşuna basınız");
            //1 tuşuna basma sebebi konsolda ilerlemek için
            bitirme=scan.nextInt();
            if(bitirme==99){
                System.out.println(sepet);
                System.out.println("Ödeyeceğiniz tutar : "+toplam);
                devamEtmekIstıyormusunuz=true;
            }
        }
    }
    //Her methodda kullanılan her bir urunler ismi farklı bir scopetadır.
    //bu classta menuyu olusturduk.
    public static void menu() {
        System.out.println("No\t"+" Ürün\t"+" Fiyat\t");
        List<String> urunler=new ArrayList<>();
        for (int i = 0; i <noUrunler.length ; i++) {
            urunler.add(noUrunler[i]);//Arrayi listeye yazdırdım
        }
        List<String> urunFiyatlari=new ArrayList<>();
        for (int i = 0; i <urunFiyat.length ; i++) {
            urunFiyatlari.add(urunFiyat[i]);//class leveldeki arrayden aldık.
        }
        for (int i = 0; i < noUrunler.length ; i++) {
            System.out.println(urunler.get(i)+" "+urunFiyatlari.get(i));
        }
    }
    public static String urunler(int urunNo) {
        String donecekUrun="";
        List<String> urunler=new ArrayList<>();
        for (int i = 0; i <noUrunler.length ; i++) {
            urunler.add(noUrunler[i]);//Arrayi listeye yazdırdım
        }
        switch (urunNo){
            case 0:{donecekUrun+=urunler.get(0);break;
            }
            case 1:{donecekUrun+=urunler.get(1);break;
            }
            case 2:{donecekUrun+=urunler.get(2);break;
            }
            case 3:{donecekUrun+=urunler.get(3);break;
            }
            case 4:{donecekUrun+=urunler.get(4);break;
            }
            case 5:{donecekUrun+=urunler.get(5);break;
            }
            case 6:{donecekUrun+=urunler.get(6);break;
            }
            case 7:{donecekUrun+=urunler.get(7);break;
            }
            case 8:{donecekUrun+=urunler.get(8);break;
            }
            case 9:{donecekUrun+=urunler.get(9);break;
            }
            case 10:{donecekUrun+=urunler.get(10);break;
            }
        }
        return donecekUrun;
    }

}
