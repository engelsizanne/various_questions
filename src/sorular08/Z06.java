package sorular08;

public class Z06 {

    public static void main(String[] args) {
          /*
                EvenOddNums isminde bir method oluşturun.
                Bu yöntem String olan bir parametreyi kabul etsin.
                Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
                Sayıların her basamağındaki rakam çiftse toplayın, tekse çıkartın.
                toplam sonucu yazdırın.
                İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.
                For example :
                String =  "6678421312"
                6+6-7+8+4+2-1-3-1+2
                sonuç 16 olmalı
        */
        String str = "6678421312";
        String[] arr = str.split("");
        int sonuc = 0;
        int rakam = 0;
        for (String each : arr) {
            rakam = Integer.parseInt(each);
            if (rakam % 2 == 0) {
                sonuc += rakam;
            } else {
                sonuc -= rakam;
            }
        }
        System.out.println("islem sonucu = " + sonuc);
    }
}
