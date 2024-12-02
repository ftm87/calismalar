package typecasting;

import java.util.Scanner;

public class ifstatement {

    public static void main(String[] args) {

        // Svap yerdegistirme.

        // Ornek: a variablenin degerini 12 , b variablenin degeri 25 olsun .
        // oyle bir kod yazinizki  a 25 ve b 12 olsun , sayilari kullanicidan alin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double a = scan.nextDouble();    //12
        double b = scan.nextDouble();   //25
        System.out.println("a;" + a);
        System.out.println("b;" + b);

        System.out.println("----------------------");
        // 1.yol : ucuncu variable kullandik

        double temp = 0;  // teporary geceici bir alan olusturduk digerlerini buna koycaz

        temp = a;      //temp 12    a 12    b 25
        a = b;         //temp 12    a 25    b 25
        b = temp;      //temp 12    a 25    b  12

        System.out.println("a;" + a);
        System.out.println("b;" + b);

       // 2. yol :ucuncu bir variabla kulanmmadn

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a;" + a);
        System.out.println("b;" + b);






    }
}