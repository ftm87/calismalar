package typecasting;

import java.util.Scanner;

public class Ifelsesoru1 {
    public static void main(String[] args) {


/*  Kullanicidan alacagi urun miktarini ve urunun birim fiyatini alin.
    eger urun miktari 1000 den fazla ise  kullaniciya %10 indirim yapin  ve
     odemesi gereken toplam parayi ekrana yazdirin
     diger durumlarda odemesi gereken toplam parayi herhangi bir indirim yapmadan ekrana yazdirin


 */


        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen alacaginiz urun miktarini girin");
        int gty =scan.nextInt();

        System.out.println("Lutfen alacaginiz urun birim fiyatini giriniz");
        double price =scan.nextDouble();


        if (gty>1000){
            System.out.println("%10 indirimli fiyat :"+price*0.9*gty);
        }else {
            System.out.println("indirimsiz fiyat;"+ price*gty);
        }






    }
}
