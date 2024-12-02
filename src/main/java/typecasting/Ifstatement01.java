package typecasting;

import java.util.Scanner;

public class Ifstatement01 {
    public static void main(String[] args) {


        // if rains     i will cansel picnic  ( burda iki durum var eger yagmusr yagarsa piknik iptal olacak..1.olay olursa ikinci durum gerceklesecek

     //    TRUE           CALAISIR

   //       FALSE          CALISMAZ



        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();


        if (a>b){
            System.out.println("ilk sayi buyuktur"); // eger dogru ise ekrana bunu yazdirir,if(condisn yani if in ici karar veriyor asaginin calismasina)

        }

       if (a<b){
           System.out.println("ikinci sayi buyuktur");
       }


       if (a==b){
           System.out.println(" iki sayi birbirine esittir");
       }

    }



}
