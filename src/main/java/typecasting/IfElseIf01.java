package typecasting;

import java.util.Scanner;

public class IfElseIf01 {
    public static void main(String[] args) {


        /*Kullanicidan bir tamsayi alin
       1.) Eger  tamsayi 0 dan kucukse ekrana "Negatif" yazdirin
       2.)0 ise ekrana "Notur" yazdirin
       3.) 0 dan buyuk ise ekrana "Pozitif " yazdirin

        NOT: ikiden fazla sart olma durumu varsa ifelseif kullanilir.
        amac duzgun bir sekilde javayi yormadan


         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();


        if (sayi<0){
            System.out.println("Negatif");

        } else if (sayi==0) {
            System.out.println("Notur");

        }else {
            System.out.println("Pozitif");
        }


    }

}
