package typecasting;

import java.util.Scanner;

public class IfElseIf04 {
    public static void main(String[] args) {

        /*
        Kullanicidan  bir  yil alin;
        eger yil 1000' e bolunuyorsa ekrana "Milenyum" yazdirin.
        Eger yil 100 ' e bolunuyorsa  ekrana "Yuzyil " yazdirin
        Eger yil 10'a bolunuyorsa ekrana "Onyil" yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int year = scan.nextInt();

        if (year<=0) {
            System.out.println("Negatif veya sifir yil kabul edilmez ");

        } else if (year % 1000 == 0) {
            System.out.println("Milenyum");
        } else if (year % 100 == 0) {
            System.out.println("Yuzyil ");
        } else if (year % 10 == 0) {
            System.out.println("Onyil");
        } else {
            System.out.println("Hicbiri");

        }

        //NOT.sorunun mantigina gore siralama yapilmali
        // normalde kucukten buyuge dogru yapilir
        // ama burda buyukten kusuge yaptik.
        // Java yukardan asagisoldan saga dogru islem yapar.
        // Mutlaka kullanicinin yapabilecegi hatalr dusunulmeli ona gore if acilmali.


    }
}