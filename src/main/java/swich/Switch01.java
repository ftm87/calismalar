package swich;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
        switch () statement if-else-if ile ayni isi yapar.
        switch () statement daha kolay yazilir ve daha kolay okunur
        2 debn fazla durum varsa genellikle  if-else-if  yerine switch () kullanilir

      */

   /*
   Kullanici haftagnunun sayisini girsin program haftanin gununu yazsin
    */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen gormek istediginiz gunu sayisini giriniz");
        int day = scan.nextInt();


        //if-else-if  ile cozlim
         if (day==1){
             System.out.println("Pazartesi");
         } else if (day==2) {
             System.out.println("Sali");
         }else if (day==3){
            System.out.println("Carsamba");
        } else if (day==4) {
            System.out.println("Persembe");
        }else if (day==5){
            System.out.println("Cuma");
        } else if (day==6) {
            System.out.println("Cumartesi");
        }else if (day==7){
            System.out.println("Pazar");
        } else  {
            System.out.println("Lutfen sadece haftanin 7 gun sayisini girin");
        }

         //switch kullanarak yapalim(switch(variable)  case durum: sout() break (kir demek).
        // ornegin 1 olma durumunda pazartesi yaz ve kes,birak


    switch (day) {

        case 1:
            System.out.println("Pazartesi");
            break;


        case 2:
            System.out.println("Sali");
            break;


        case 3:
            System.out.println("Carsamba");
            break;

        case 4:
            System.out.println("Persembe");
            break;

        case 5:
            System.out.println("Cuma");
            break;

        case 6:
            System.out.println("Cumartesi");
            break;

        case 7:
            System.out.println("Pazar");
            break;

        default:
            System.out.println("Lutfen sadece haftanin 7 gun sayisini girin");
    }

     // NOT: break kaldirirsak girilen durumdan asagiya break gorene kadar devam eder

    }
}
