package typecasting;

import java.util.Scanner;

public class Ifelse02 {
    public static void main(String[] args) {


        /*Kullanicidan bir character aliniz
        Bu kcharacter harf ise consola "Harf" yazdirin
        harf degil ise harf degil yazdirin

      */


        Scanner input = new Scanner(System.in);
        System.out.println(" lutfen bir character giriniz");
       char ch = input.next().charAt(0);

       if ((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')){
           System.out.println("Harf");
       }else {
           System.out.println("Harf degil");
       }


    }
}
