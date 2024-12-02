package tearnary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        int s = scan.nextInt();


       if (s>9) {System.out.println("Rakam degil");} else {System.out.println("Rakam");}

         //  s>9  ?  "Rakam degil" : "Rakam"  ;      bu ternary in calisma stilisadece icleri yzar ?   :  ;

         //  true  ise  bunu uretir

         // false   ise              : bunu uretir

         // uretim yapildiktan sora memoryde bir alan olusturulmali.bir variable olusturulmali

        String result = s>9  ?  "Rakam degil" : "Rakam"  ;
        System.out.println(result);

    // eger farkli data typleri varsa ve konsola yazdirmak istiyorsak soutta kullanalim

        System.out.println(s>99 && s<1000 ? " 3 basamakli " : s);

     // burda hem string hem int data var ..nunu icin variable olusturmadan boyle yapabilirz
    }
}