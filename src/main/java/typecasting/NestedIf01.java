package typecasting;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

    
            //Nested if ; ic ice girmis "if Statement" demek
    
      /* Kullanicidan bir sayi alin
       eger sayi pozitif ise ; 10 san buyuk olup olmadigini kontrol edn
       eger 10 dan buyuk  ise "Buyuksun" yazdirin
       eger 10 dan kucuk ise "Normalsin" yazdirin
    
       eger sayi pozitif degilse ;-10 dan buyuk olup olmadigini kontrol edin
       eger -10 dan buyuk ise "Negatifsin"
       eger -10 dan kucuk ise "Cok negatifsin"

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        
        if (sayi>0){
            if (sayi>10){
                System.out.println("Buyuksun");
            } else  {
                System.out.println("Normalsin");
            }

        }else {

            if (sayi>-10){
                System.out.println("Negatifsin");
            }else {
                System.out.println("Cok negatifsin");
            }
        }
    }
}
