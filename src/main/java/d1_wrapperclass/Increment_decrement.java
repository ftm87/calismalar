package d1_wrapperclass;

public class Increment_decrement {
    public static void main(String[] args) {


        // incr =ement : bir variable in degerini toplama veya carpma kullanarak arttirmaya denir

        //1.yol
        int i1 = 5;
         i1=i1+7;
        System.out.println(i1);//12

        i1=i1+6;
        System.out.println(i1);//18 Java yukardan asagi soldan saga gelir

        //2.yol ( bu daha sade oldugu icin bu kullanilir kod sadeligi)

        i1+=5;
        System.out.println(i1);//23

        //3.yol bu sadece 1 arttirmak istenildiginde kullanilir.++

        i1++;
        System.out.println(i1);//24


        int i2 =3;
        i2=i2*2;
        System.out.println(i2);//6

        i2 *= 4;
        System.out.println(i2);//24

        // Decrement ; bir variablenin degerini cikarma veya bolme yaparak azaltmaya denir

        int k = 12;
        System.out.println(k);//12

        // k nin degerini 1.yolla 3 azaltin

        k = k -3;
        System.out.println(k);//9

        // k nin degerini 2. yolla 5 azaltin
        k -=4;
        System.out.println(k);//5

        // k nin degerini 3. yolla 1 azaltin

        k--;
        System.out.println(k);//4

        int m = 12;
        System.out.println(m);//12
        // bolme kullanarak 1.yolla yarisina indiirin

        m =m /2;
        System.out.println(m);//6





    }
}
