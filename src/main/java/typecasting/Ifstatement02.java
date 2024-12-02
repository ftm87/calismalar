package typecasting;

import java.util.Scanner;

public class Ifstatement02 {
    public static void main(String[] args) {


        /*
               Kullanicdan bir sayi alin bu sayi cift  sayai ise consola "cift" "tek" ise tek  yazdirin

         */

        Scanner scan =new Scanner(System.in);
        System.out.println(" bir integer  giriniz");
        int a =scan.nextInt();

    if (a %2 == 0){
        System.out.println("Cift");
    }


    if (a % 2 != 0){
        System.out.println("Tek");
    }

    }
}
