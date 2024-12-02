package tearnary;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {

/*  Kullanicidan alacagi urun miktarini ve urunun birim fiyatini alin.

    eger urun miktari 1000 den fazla ise  kullaniciya %10 indirim yapin  ve
     odemesi gereken toplam parayi ekrana yazdirin

     diger durumlarda odemesi gereken toplam parayi herhangi bir indirim yapmadan ekrana yazdirin


 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun miktarini  girin ");
        int miktar =scan.nextInt();
        System.out.println("Lutfen birim fiyatini giriniz");
        double fiyat = scan.nextDouble();

       double result =miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar;

        System.out.println(result);



    }
}
