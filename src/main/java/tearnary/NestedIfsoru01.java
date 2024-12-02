package tearnary;

import java.util.Scanner;

public class NestedIfsoru01 {
    public static void main(String[] args) {

        /*
        Kullanicidan  cinsiyetini  girmesini isteyin

        erkek ise yasini kontrol edin .
        Yasi 18 den kucuk ise ekrana " Erkek cocuk " yazdirin
        Yasi 18 den buyuk ve esit ise ekran  "Adam"


        Kiz ise yasini kontrol edin
        Yasi 18 den kucuk ise ekrana " Kiz cocuk " yazdirin
        Yasi 18 den buyuk ve esit ise ekran  "Kadin"

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String c = scan.next();
        System.out.println("Lutfen yasinizi giriniz");
        byte age = scan.nextByte();


        if (c.equalsIgnoreCase("erkek")) {
            if (age < 18) {
                System.out.println(" Erkek cocuk ");
            } else {
                System.out.println("Adam");
            }

        } else if (c.equalsIgnoreCase("kiz")) {

            if (age < 18) {
            System.out.println(" Kiz cocuk ");
           } else {
            System.out.println("Kadin");
        }

        }else {
            System.out.println(" bu cinsiyet tanimli degil");
        }
    }




    }
