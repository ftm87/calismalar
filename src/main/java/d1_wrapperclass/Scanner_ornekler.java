package d1_wrapperclass;

import java.util.Scanner;

public class Scanner_ornekler {
    public static void main(String[] args) {

        /*Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini
        ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.
        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın*/


        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen adinzi ve soyadinizi giriniz");
        String fullName=input.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        byte age =input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        float height = input.nextInt();

        System.out.println("Lutfen kilonuzu giriniz");
        short weight =input.nextShort();

        System.out.println("Lutfen medeni durumunuzu giriniz");
        String maritalStatus = input.next();

        //Kullanici girdilerini konsola yazdiralim

        System.out.println("fullName;"+fullName);
        System.out.println("age;"+age);
        System.out.println("height;"+height);
        System.out.println("weight;"+weight);
        System.out.println("maritalStatus;"+maritalStatus);






    }
}
