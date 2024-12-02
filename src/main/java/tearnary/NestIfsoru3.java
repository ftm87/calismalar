package tearnary;

import java.util.Scanner;

public class NestIfsoru3 {

    public static void main(String[] args) {

        /*
        Kullanicidan password girmesini isteyiniz

        Girdigi password  5 e bolunuyorsa  son rakami kontrol edin
        son rakami 0 ise ekrana "5 e bolunen cift sayi" yazdirin

        son rakami 0 degilse " 5 e bolunen tek sayi " yazdirin
        girdigi password 5 e bolunmuyrsa ekrana " Tekrar deneyin " yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir  password giriniz ");
        int pwd =scan.nextInt();



        if (pwd%5==0){      // bolum kosullarinda % kullaniriz ==0 ise tam bolunuyor demek.ayni sey birler basamagi 0 isin %10
           if (pwd%10==0){
               System.out.println("5 e bolunen cift sayi");
           }else {
               System.out.println(" 5 e bolunen tek sayi " );
           }
        }else {
            System.out.println(" Tekrar deneyin ");
        }


    }
}
