package typecasting;

import java.util.Scanner;

public class Ifstatement03 {
    public static void main(String[] args) {
        /*

        Kullanicidan bir character  alin
        Bu character  buyuk harf ise  "Buyuk harf " yazin
        Bu character kucuk ise "Kucuk harf" yazin
        Bu character harf degilse "Harf degil " yaz

         */


        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen bir character giriniz");
        char ch =scan.next().charAt(0);

        if (ch>='A'&& ch<='Z'){     // burda yaptigimiz sey A-Z arasindaki buyuk sayilar ayni sey a-z arasindada yapabilirz
            System.out.println("Buyuk harf");
        }

       if (ch>='a'&& ch<='b'){
           System.out.println("Kucuk harf");
       }

       if( !(ch>='A'&& ch<='Z') && !(ch>='a'&& ch<='b')){
           System.out.println("Harf degil");
       }


    scan.close();

        System.out.println();
/*
     kullanicidan bir sayi alin
     sayi uc basamakli ise konsola " uc basamakli " yazdirin
     sayi iki basamakli ise   " ki basamakli  yazin
     sayi 3 basamakli veya 2 basamakli degilse konsola "ikiside degil" yazin


 */ Scanner input = new Scanner(System.in);
        System.out.println(" lutfen bir sayi giriniz");
        int a = input.nextInt();

        if (a>99 && a<1000){
            System.out.println("uc basamakli");
        }
        if (a>9 && a<100){
            System.out.println("iki basamakli");
        }

        if ((a>99 && a<1000)|| (a>9 && a<100)){
            System.out.println("ikiside degil");
        }
    }
}
