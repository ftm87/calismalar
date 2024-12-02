package d1_wrapperclass;

import java.util.Scanner;

public class Scanner05 {


    public static void main(String[] args) {

/*
Kenar uzunluklri kullanicidan alinan bir ucgenin cevresini hesaplayan bir program yaziniz
(byte kullaniniz)Not ucgenin cevresi : a+b+c

 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        byte k1=scan.nextByte();
        byte k2=scan.nextByte();
        byte k3 =scan.nextByte();


        int cevre= k1+k2+k3; // burda niye int kullandik kullanici bize buyuk rakam verebilir bu yuzden byte daha az oldugu icin int yada short kullanabiliriz
        System.out.println("Cevre:"+cevre);

    }
}
