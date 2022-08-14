package sorular4;

public class A10 {
    public static void main(String[] args) {


        // Soru1:Asağıdaki multi dimensional arrayın tum elemenlarının çarpımını yazdıran bir method yazdırın


        int[][] sayilar = {{1, 2, 3}, {4, 5, 6}};


        carpımsonuc(sayilar);
        System.out.println("Array'ın tüm elemanlarının çarpımının sonucu:" + carpımsonuc(sayilar));
    }

    public static int carpımsonuc(int[][] sayilar) {
        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {

                carpim *= sayilar[i][j];

            }
        }
        return carpim;
    }
}