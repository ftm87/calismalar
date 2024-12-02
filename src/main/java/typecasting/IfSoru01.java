package typecasting;

import java.util.Scanner;

public class IfSoru01 {

    public static void main(String[] args) {


        /*
        Kullanicidan bir gun alin
        "cuma " ise ekrana "muslumanlar icin kutsal " yazin
        "cumartesi" ise ekrana "yahudiler icin kutsal " yazin
        "pazar" ise "hristiyanlar icin kutsal " yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun =scan.next();
         // stringlerde == bunu kesinlikle kullanmayiniz.== bu primitiv data typlerinde kullanilir
        // eguals methodu iki stringi karsilastirir ayni ise true yanlis false.
        // buyuk kucuk harfe duyarli,buyuzden buna yeni method olusturur java
        // bunun adi egualsignorCase()(stringe git buyuk kucuk harf umursama al esitle)


        if (gun.equalsIgnoreCase("cuma")){
            System.out.println("muslumanlar icin kutsal " );
        }

        if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("yahudiler icin kutsal ");
        }

        if (gun.equalsIgnoreCase("pazar")){
            System.out.println("hristiyanlar icin kutsal ");
        }
        if (!gun.equalsIgnoreCase("cuma") && !gun.equalsIgnoreCase("cumartesi")&&!gun.equalsIgnoreCase("pazar")){
            System.out.println("Oyle bir kutsal gun yok");
        }
    }
}
