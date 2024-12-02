package d1_wrapperclass;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //Kullanicidan data almak icin

         // 1.yol
        //class object = object uretir  (clasn const.yani yapan )( kisaca demek istedigimiz sistemin icine gir data koy)

        Scanner  scan =   new          Scanner(System.in);

        // 2.yol  kullaniciya mesaj ver

        System.out.println("Yasinizi giriniz");

        //3. yol kullanicinin verdigii datayi saklamak icin bir variabla olusturun (burda yas istedigim icin int)

        int age =scan.nextInt();// burda nextint kullanicinin girdigi veriyi inte yukler ...data tipi neyse next... o olur burda int oyuzden

        System.out.println(age);




    }
}
