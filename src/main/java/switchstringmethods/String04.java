package switchstringmethods;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {


        /*
        1)Kullanicidan passwordunu aliniz
        2)Passwordun
          -ilk karakteri buyuk harf olacak
          -son karakteri sayi olacak
          -en az 6 karakter uzunlugunda olacak
       sartlarini sagliyorsa ekrana "password basariyla olusturuldu " yaziniz
       3)Password yukaridaki sartlardan herhnagi birini saglamiyorsa "Tekrar deneyiniz " yazdirin

         */


        Scanner scan = new Scanner(System.in);
        System.out.println(" LUtfen passwordunuzu giriniz");
        String pwd = scan.nextLine();

       if ((pwd.charAt(0)>='A'&& pwd.charAt(0)<='Z') &&
               (pwd.charAt(pwd.length()-1)>='0' && pwd.charAt(pwd.length()-1)<='9') && pwd.length()>5){

           System.out.println( "password basariyla olusturuldu" );
       }else {
           System.out.println("Tekrar deneyiniz ");
       }




    }
}
