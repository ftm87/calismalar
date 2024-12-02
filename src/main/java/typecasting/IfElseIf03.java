package typecasting;

import java.util.Scanner;

public class IfElseIf03 {

    public static void main(String[] args) {

       /*
       Kullanicidan notunu  alin ve asagidaki  kurallara gore ekrana  A , B, C, veya D yazdirin
       50 den az -D
       50 (dahil) ile 60 arasi -C
       60(dahil) ile 80 arasi -B
       80 (dahil) ile 100 (dahil)  -A

        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int num =scan.nextInt();


        if (num<0){
            System.out.println("Sana not gir dedik ;)");// kullanici yanlislikla negetif bir sayi girerse

        }else if (num<50){
            System.out.println('D');
        } else if (num>=50 && num<60) {
            System.out.println('C');
        }else if (num>=60 && num<80){
            System.out.println('B');
        } else if (num>=80 &&num<=100) {
            System.out.println('A');
        }else {
            System.out.println(" sadece not girmelisin ");
        }


    }
}
