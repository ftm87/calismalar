package d1_wrapperclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        // kullanicidan bir diktortgenin uzun ve kisa kenarlarini alip
        // o dikdorgenin  alan ve cevresini hesaplayip ekrana yazdiran programi olusturunuz

        Scanner scan = new Scanner(System.in);

        System.out.println("Diktortgenin kisa kenarini giriniz");

        double kisa =scan.nextDouble();

        System.out.println("Dikdortgenin uzun kenarini giriniz");

        double uzun = scan.nextDouble();

        System.out.println( "Alan= "+ kisa*uzun);


        System.out.println("Cevre="+(2*kisa+2*uzun));// burda mutlaka () icine islemi yapalim
     scan.close();
    }
}
