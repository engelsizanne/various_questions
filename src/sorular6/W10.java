package sorular6;

public class W10 {
    public static void main(String[] args) {
        /* Array icindeki 2. enbuyuk sayiyi bulan Java kodunu yaziniz
        arr={1232,2345,5467,678,3454,2312,3451}
        */

        int[]arr={1232,2345,5467,678,3454,2312,3451};

        int enBuyukSayi=arr[0];
        int enBuyukIKinciSayi=arr[0];

        for (int i = 1; i <arr.length; i++) {
            if (arr[i]>enBuyukSayi){
                enBuyukSayi=arr[i];
            }
        }
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > enBuyukIKinciSayi && arr[i]<enBuyukSayi){
                enBuyukIKinciSayi=arr[i];
            }
        }
        System.out.println("En Buyuk Sayi       :"+enBuyukSayi);
        System.out.println("Enbuyuk Ikinci Sayi :"+enBuyukIKinciSayi);

    }
}
