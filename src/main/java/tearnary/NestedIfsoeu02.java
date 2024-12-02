package tearnary;

import java.util.Scanner;

public class NestedIfsoeu02 {
    public static void main(String[] args) {
/*
    Kullanicidan bir harf girmesini isteyin

     girdigi kucuk harf ise harfin  "a " olup olmadigini kontrol edin
      Harf  a ise ekrana  "Ilk kucuk harf" yazdirin
      "a" degilse ekrana "Ilk kucuk harf degil" yazdirin

      Girdigi buyuk harf ise harfin "Z" olup olmadigina bakin
      Hraf "Z" ise ekrana "Son buyuk harf " yazdirn
      Z degilse ekrana "Son buyuk harf degil " yazdirin

 */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char h =scan.next().charAt(0);


        if (h>='a'&& h<='z'){
            if (h=='a'){
                System.out.println("Ilk kucuk harf" );
            }else {
                System.out.println("Ilk kucuk harf degil");
            }

        } else if (h>='A'&& h<='Z') {
            if (h=='Z'){
                System.out.println( "Son buyuk harf " );
            }else {
                System.out.println("Son buyuk harf degil " );
            }
        }else {
            System.out.println("Bir harf girmelisin");
        }
scan.close();

    }
}
