package typecasting;

import java.util.Scanner;

public class Ifstatement04 {
    public static void main(String[] args) {
        /*
     kullanicidan bir sayi alin
     sayi uc basamakli ise konsola " uc basamakli " yazdirin
     sayi iki basamakli ise   " ki basamakli  yazin
     sayi 3 basamakli veya 2 basamakli degilse konsola "ikiside degil" yazin


 */ Scanner input = new Scanner(System.in);
        System.out.println(" lutfen bir sayi giriniz");
        int a = input.nextInt();

        if (a>99 && a<1000){
            System.out.println("uc basamakli");
        }
        if (a>9 && a<100){
            System.out.println("iki basamakli");
        }

        if ((a>99 && a<1000)|| (a>9 && a<100)){
            System.out.println("ikiside degil");
        }
    }
}
