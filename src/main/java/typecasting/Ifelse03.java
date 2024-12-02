package typecasting;

import java.util.Scanner;

public class Ifelse03 {
    public static void main(String[] args) {
         /*

         Kullanicidan bir tam sayi alin ve o tamsayinin mutlak degerini
         ekrana yazdirin.

         a>=0 ==>Mutlak deger  = a            a<0 ==>Mutlak deger  =-a

          */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int a =scan.nextInt();



        if (a>=0){
            System.out.println(a);
        }else {
            System.out.println(-a);
        }







    }
}
