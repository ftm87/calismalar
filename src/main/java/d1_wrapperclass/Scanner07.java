package d1_wrapperclass;

import java.util.Scanner;

public class Scanner07 {
    public static void main(String[] args) {

      /*
               A
              A A
             A A A

   Kullanicidan aldiginiz sekille yukardaki gibi bir gorunum  olusturun
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Birr karakter giriniz");
        char ch =scan.next().charAt(0);

      /*  System.out.println("  A  ");
        System.out.println(" A A ");
        System.out.println("A A A");    */

    //Eger herhangi bir karakter olmasini istiyorsam su  sekilde yapalim


        System.out.println("  "+ ch +"  ");
        System.out.println(" "+ ch +" "+ ch +" ");
        System.out.println(ch+ " "+ ch +" "+ ch);


    }
}
