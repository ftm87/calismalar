package switchstringmethods;

import java.util.Locale;
import java.util.Scanner;

public class String05 {
    public static void main(String[] args) {

        /*
       1-Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz
        2-kullanici ad ve soyadini girereken hata ile bas ve sona spece koyarsa siliniz
       3- ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali
       4- kimlik numarasi son dort rakami haric hepsi * yapilmali
                   Ali Can ********1234
     */


        Scanner scan = new Scanner(System.in);
        System.out.println(" LUtfen adinizi giriniz");
        String name = scan.nextLine();
        System.out.println("Lutfen soyadiniz giriniz");
        String soyAd =scan.nextLine();
        System.out.println("Lutfen 11 haneli kimlik numarasini girinzi");
         String tc = scan.nextLine();

       name= name.trim(); // burda yapmamiz gereken variabli trimledikten sonra atamak .yoksa  etkisi olmaz
       soyAd=soyAd.trim();

     name = name.substring(0,1).toUpperCase()  +  name.substring(1).toLowerCase(Locale.ROOT);
        System.out.println(name);


     soyAd=soyAd.substring(0,1).toUpperCase() + soyAd.substring(1).toLowerCase() ;

        System.out.println(soyAd);


      tc  ="********"+tc.substring(tc.length()-4);

        System.out.println(tc);



    }
}
