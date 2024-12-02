package tearnary;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*

        Kullanicidan bir tamsyi girmesini isteyin
        eger tamsayi  3 baamakli ise ekrana " 3 basamakli " yazdirin
        3 basamakli degilse cift olup olmadigini kontrrol edin
        cift ise " 3 basamakli olmayan cift sayi "
        cift sayi degilse "3 basamakli olmayan tek sayi" yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Luffen bir tamsayi giriniz");
        int sayi =scan.nextInt();


      String result = sayi>=99 && sayi<1000 ? " 3 basamakli ":(sayi%2==0?" 3 basamakli olmayan cift sayi ":"3 basamakli olmayan tek sayi");


        System.out.println(result);


    }
}
