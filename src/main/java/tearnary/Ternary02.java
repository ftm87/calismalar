package tearnary;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
/*
    kullanicindan bir tamsyi alin
    Eger tam sayi 0 dan kucuk ise ekrana "Negatif "
    Diger durumlarda ekrana "Negatif degil " yazdirin
 */

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen bir tamsayi giriniz");
        int s = scan.nextInt();

        String num =s<0 ? "Negatif": "Negatif degil ";

        System.out.println(num);





    }
}
