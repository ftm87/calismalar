package tearnary;

import java.util.Scanner;

public class NestedTearnary02 {
    public static void main(String[] args) {
        /*
        Artik yil (lep year) :100 e bolunren yillardan 400 e bolunenler artik yildir.
                              100 e bolunmeyenlerden 4 e bolunenler artik yildir

               Kullanicidan alinan yilin artik yil olup olmadigini  belirleyen kodu yazin
                              */



        Scanner scan = new Scanner(System.in);
        System.out.println("Luffen bir yil giriniz");
        int year =scan.nextInt();

  String result = year%100==0 ? (year%400==0 ? "Artik yil ": "Artik yil degil") :(year%4==0 ? "Artik yil":"Artik yil degil");

        System.out.println(result);

    }
}
