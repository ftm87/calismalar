package swich;

import java.util.Locale;
import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        /*
        Kullanici ay ismi girdiginde o ayin kac cektigini ekrana yazan bir program yapiniz

         */


        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen ay ismi giriniz");
        String ay = scan.next().toLowerCase(Locale.ROOT);


        switch (ay) {
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralik":
                System.out.println(31);
                break;
            case "subat":
                System.out.println(28);
                break;
            case "nisan":
            case "haziran":
            case "eylul":
            case "kasim":
                System.out.println(30);
                break;
            default:
                System.out.println("Lutfen gecerli bir ay ismi girin");

        }
    }
}