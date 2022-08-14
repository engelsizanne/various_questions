package sorular08;

public class Deneme1 {

        int x;
        static int y;

        Deneme1(int i){
            x+=i;
            y+=i;
        }

        public static void main(String[] args) {
            new Deneme1(2);
            Deneme1 dnm=new Deneme1(3);

            System.out.println(dnm.x +","+dnm.y);
        }
    }
