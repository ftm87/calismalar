package switchstringmethods;

import java.util.Locale;
import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {



    /*
    1-Kullanicidan bri string alin
    2-tum rakamlari * a cevirin
    3-bas ve sondaki tum space leri silin
    4-aralardaki tum spaceleri  ! isaretine cevirin
    a ve z harflerini buyuk harf diger tum harfleri kucuk harf yapin
    6-en basa 'a'(" ve en sona ") ekleyin
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("LUtfen bir string giriniz");
        String s = scan.nextLine();



      s=  s.replaceAll("\\d", "*") ;

      s=  s.trim();

      s=  s.replace("","!");

      s=  s.toLowerCase(Locale.ROOT);

      s=  s.replace('a','A');

      s=  s.replace('z','Z');

      s=  "(" +s+ ")";
    }


}
